package com.java.dao;

import com.java.entity.UserInfo;
import com.java.mapper.ProductMapper;
import com.java.mapper.ShopMapper;
import com.java.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import com.java.entity.ProductInfo;
import com.java.entity.ShopInfo;

import javax.annotation.Resource;
import java.util.List;

@Repository("BossManageDao")
public class BossManageDao {

	@Resource
	private ShopMapper shopMapper;

	@Resource
	private ShopInfo shopinfo;

	@Resource
	private UserInfo userinfo;

	@Resource
	private UserMapper usermapper;

	@Resource
	private ProductMapper productmapper;

	public List<ProductInfo> shop(String username)
	{
		return productmapper.bossgetAll(get_user_id(username));
	}
	
	public String addproduct(ProductInfo productinfo)
	{
		return productmapper.insert(productinfo);
	}
	
	public String updateproduct(ProductInfo productinfo,String pro_id)
	{
		return productmapper.update(productinfo);
	}
	
	public String deleteproduct(String pro_id)
	{
		return productmapper.delete(pro_id);
	}
	public String  addshop(String shopname,String username)
	{
		shopinfo.setShopname(shopname);
		shopinfo.setShop_owner_id(get_user_id(username));
		return shopMapper.insert(shopinfo);
	}

	private int get_user_id(String username)
	{
		userinfo=usermapper.getOne(username);
		return userinfo.getUser_id();
	}

}
