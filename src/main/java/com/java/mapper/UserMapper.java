package com.java.mapper;

import com.java.entity.UserInfo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "user_id",  column = "user_id"),
            @Result(property = "user_name", column = "user_name"),
            @Result(property = "user_pwd",  column = "user_pwd"),
            @Result(property = "user_isboss", column = "user_isboss")
    })
    public List<UserInfo> getAll();

    @Select("SELECT * FROM user WHERE user_name = #{username}")
    @Results({
            @Result(property = "user_id",  column = "user_id"),
            @Result(property = "user_name", column = "user_name"),
            @Result(property = "user_pwd",  column = "user_pwd"),
            @Result(property = "user_isboss", column = "user_isboss")
    })
    public UserInfo getOne(String username);

    @Select("SELECT * FROM user WHERE user_name = #{user_name} and user_pwd = #{user_pwd}")
    @Results({
            @Result(property = "user_id",  column = "user_id"),
            @Result(property = "user_name", column = "user_name"),
            @Result(property = "user_pwd",  column = "user_pwd"),
            @Result(property = "user_isboss", column = "user_isboss")
    })
    public UserInfo Login(String user_name, String user_pwd);

    @Insert("insert into user(user_id,user_name,user_pwd,user_isboss) values(null,#{user_name},#{user_pwd},#{user_isboss})")
    public int insert(UserInfo user);

    @Update("UPDATE user SET user_name=#{user_name},user_pwd=#{user_pwd} WHERE user_id =#{user_id}")
    public void update(UserInfo user);

    @Delete("DELETE FROM user WHERE user_id =#{user_id}")
    public void delete(Long id);

}
