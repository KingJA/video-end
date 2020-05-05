package com.kingja.video.service;

import com.kingja.video.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:TODO
 * Create Time:2020/5/5 23:32
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public boolean hasRegistered(String username) {
        return userDao.getCountByUserName(username) > 0;
    }

    @Override
    public void saveUser(String username, String password) {

    }
}
