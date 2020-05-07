package com.kingja.video.service;

import com.kingja.video.dao.dto.User;

/**
 * Description:TODO
 * Create Time:2020/5/5 23:30
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public interface UserService {
    boolean hasRegistered(String username);

    void saveUser(User user);

    int login(User user);
}
