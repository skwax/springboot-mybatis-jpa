package com.skwax.controller;

import com.skwax.pojo.Dept;
import com.skwax.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/dept")
public class DeptController {

    @Autowired
    private IDeptService deptService;

    @RequestMapping("/")
    public List<Dept> home() {

        return deptService.findDepts();
    }

    @RequestMapping("/tt")
    public Dept getById() {
        return deptService.findDept();
    }

    @RequestMapping("/t1")
    public int t1(@RequestParam(value = "s",defaultValue = "Johhn", required = false) String s) {
        int len = 0;
        List<Character> list = new ArrayList<>();
        char[] arr = s.toCharArray();
        for (int i = 0;i<arr.length;i++){
            char c = arr[i];
            while (list.contains(c)) {
                list.remove(0);
            }
            list.add(c);
            if (list.size() > len){
                len = list.size();
            }
        }
        return len;
    }
    @RequestMapping("/t2")
    public int t2(@RequestParam(value = "s",defaultValue = "Johhn", required = false) String s) {
        int len = 0;
        List<Character> list = new ArrayList<>();
        char[] arr = s.toCharArray();
        for (int i = 0;i<arr.length;i++){
            char c = arr[i];
            while (list.contains(c)) {
                list.remove(0);
            }
            list.add(c);
            if (list.size() > len){
                len = list.size();
            }
        }
        return len;
    }
}
