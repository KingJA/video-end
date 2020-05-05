package com.kingja.video.api.controller;

import com.kingja.video.common.util.ApiResult;
import com.kingja.video.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:TODO
 * Create Time:2020/5/5 23:14
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("test")
    public String test() {
        return "hello kingja";
    }
    @RequestMapping("/kingja")
    public String kingja() {
        return "hello kingja";
    }

    @PostMapping("/register")
    @ResponseBody
    public ApiResult register(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println(username +password);
        boolean hasRegistered = userService.hasRegistered(username);
        System.out.println("hasRegistered"+hasRegistered);
        return ApiResult.ok("true");
    }
}
