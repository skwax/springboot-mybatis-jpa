package com.skwax.service.impl;

import com.skwax.dao.jpa.DeptJpa;
import com.skwax.pojo.Dept;
import com.skwax.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService implements IDeptService {

    @Autowired
    private DeptJpa deptJpa;

    public List<Dept> findDepts(){
        return deptJpa.findAll();
    }

    public Dept findDept(){
        System.out.println(Long.valueOf(1));
        return  deptJpa.findByDeptID(Long.valueOf(1));
    }

}
