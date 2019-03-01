package com.java.service;

import com.java.entity.UserInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.dao.UserManageDao;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service("UserManageService")
public class UserManageService {
	
	@Resource
    private UserManageDao usermanagedao;
	
	public String login(String username,String password)
	{
		return usermanagedao.login(username,password);
	}

	public String register(UserInfo userinfo)
	{
		return usermanagedao.register(userinfo);
	}
	
}
