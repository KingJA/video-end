package com.kingja.video.service;

import com.kingja.video.common.util.MD5Utils;
import com.kingja.video.dao.UserDao;
import com.kingja.video.dao.dto.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

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
    public void saveUser(User user) {
        userDao.insertUser(user);
    }
}
