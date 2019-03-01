package com.java.dao;

import com.java.mapper.CarMapper;
import com.java.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import com.java.entity.ProductInfo;
import com.java.entity.UserInfo;

import javax.annotation.Resource;

import java.util.List;

@Repository("CarDao")
@SuppressWarnings("all")
public class CarDao {

	@Resource
	private UserInfo userinfo;
	@Resource
	private CarMapper carmapper;
	@Resource
	private UserMapper usermapper;
	
	public List<ProductInfo> showshopcar(String username)
	{
		return carmapper.getcar(get_user_id(username));
	}
	
	public String addtocar(String pro_id,String username)
	{

		return carmapper.insert(get_user_id(username),pro_id);
	}

	private int get_user_id(String username)
	{
		userinfo=usermapper.getOne(username);
		return userinfo.getUser_id();
	}

}
