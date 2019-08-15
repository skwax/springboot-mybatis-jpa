package com.skwax.controller;

import com.skwax.pojo.UserInfo;
import com.skwax.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.util.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/findAll", produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    public List<UserInfo> getAllUser(){

        return userService.findUserList();
    }

    @RequestMapping(produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    public String reverse(){
        String str = "ni shuo she me";
        String[] arr =  str.trim().split(" ");
        List list = Arrays.asList(arr);
        Collections.reverse(list);
        return String.join(" ",list);
    }

    @RequestMapping(value = "/arr", produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    public Map arr(){

        Integer[] arr =  new Integer[]{1,4,2,3,4,1,5,2,7};
        if (arr.length<1){
            return null;
        }

        Set set = new HashSet();
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && !set.add(arr[i])){
                arr[i] = null;
            }
        }
        Arrays.sort(arr,new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (a == null)
                    return 1;
                if (b == null)
                    return -1;
                if (a > b)
                    return 1;
                return -1;
            }
        });
        Map map = new HashMap<Integer,Integer[]>();
        map.put(set.size(), arr);
        return map;
    }

    @RequestMapping(value = "/test", produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    public boolean test(){
        Set set = new HashSet();
        return set.add(null);
    }

    @RequestMapping(value = "/view")
    public ModelAndView hello(){
        System.out.println("进入了hello");
        ModelAndView mav = new ModelAndView("/hello.html");
        return mav;
    }
}
