package com.skwax.service;

import com.skwax.pojo.UserInfo;

import java.util.List;

public interface IUserService {

    List<UserInfo> findUserList();

    boolean UpdateUser(UserInfo user);

}
