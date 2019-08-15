package com.skwax.service.impl;

import com.skwax.dao.mapper.UserInfoMapper;
import com.skwax.pojo.UserInfo;
import com.skwax.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserService implements IUserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findUserList() {
        return userInfoMapper.findAllUser();
    }

    @Override
    public boolean UpdateUser(UserInfo user) {
        return false;
    }
}
