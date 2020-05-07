package com.kingja.video.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Description:TODO
 * Create Time:2020/5/7 0007 下午 3:27
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
@ApiModel(value = "用户对象")
public class User {
    @ApiModelProperty(hidden = true)
    private String id;
    @ApiModelProperty(value = "用户名", name = "username", example = "KingJA", required = true)
    private String username;
    @ApiModelProperty(value = "密码", name = "password", example = "123456", required = true)
    private String password;

    public String getId() {
        return null == id ? "" : id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return null == username ? "" : username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return null == password ? "" : password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
