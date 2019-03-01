package com.java.dao;

import com.java.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import com.java.entity.UserInfo;

import javax.annotation.Resource;

import java.util.List;

@Repository("UserManageDao")
@SuppressWarnings("all")
public class UserManageDao {

	@Resource
	private UserMapper usermapper;
	
	@Resource
	private UserInfo userinfo;
	
	public String login(String username,String password)
	{
		userinfo=usermapper.Login(username,password);
		if(userinfo==null)
			return "0";
		else
			return "1";
	}

	public String register(UserInfo userinfo)
	{
		int result=usermapper.insert(userinfo);
		if(result==0)
			return "0";
		else
			return "1";
	}
	
}
