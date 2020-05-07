package com.kingja.video.dao;


import com.kingja.video.dao.dto.User;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Description:TODO
 * Create Time:2019/9/3 0003 下午 3:44
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
@Mapper
public interface UserDao {
    @Select("select count(*) from users where username = #{username}")
    public int getCountByUserName(@Param("username") String username);

    @Insert("insert into users (id,username, password)values(#{id},#{username}, #{password})")
    public int insertUser(User user);
}
