package com.kingja.video.api.controller;

import com.kingja.video.common.util.ApiResult;
import com.kingja.video.common.util.MD5Utils;
import com.kingja.video.dao.dto.User;
import com.kingja.video.service.UserService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Description:TODO
 * Create Time:2020/5/5 23:14
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */

@Api(value="用户相关业务的接口", tags= {"用户相关业务的controller"})
@RestController
public class UserController {
    @Autowired
    UserService userService;

//    @RequestMapping("test")
//    public String test() {
//        return "hello kingja";
//    }
//
//    @RequestMapping("/kingja")
//    public String kingja() {
//        return "hello kingja";
//    }


    @PostMapping("/register")
    @ResponseBody
    @ApiOperation(value="用户登录", notes="用户登录的接口")
    public ApiResult register(@RequestBody User user) throws Exception {
        if (StringUtils.isEmpty(user.getUsername()) || StringUtils.isEmpty(user.getPassword())) {
            return ApiResult.errorMsg("用户名或密码错误");
        }
        if (userService.hasRegistered(user.getUsername())) {
            return ApiResult.errorMsg("用户名已经注册过");
        }

        user.setId(UUID.randomUUID().toString());
        user.setPassword(MD5Utils.getMD5Str(user.getPassword()));
        userService.saveUser(user);
        return ApiResult.ok("注册成功");
    }
}
