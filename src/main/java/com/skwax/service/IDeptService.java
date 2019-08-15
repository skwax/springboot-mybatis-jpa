package com.skwax.service;

import com.skwax.pojo.Dept;

import java.util.List;

public interface IDeptService {

    List<Dept> findDepts();

    Dept findDept();
}
