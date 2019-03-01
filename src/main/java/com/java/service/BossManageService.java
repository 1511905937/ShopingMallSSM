package com.java.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.dao.BossManageDao;
import com.java.entity.ProductInfo;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service("BossManageService")
public class BossManageService {

	@Resource
    private BossManageDao bossmanagedao;
	
	public List<ProductInfo> shop(String username)
	{
		return bossmanagedao.shop(username);
	}
	
	public String addproduct(ProductInfo productinfo)
	{
		return bossmanagedao.addproduct(productinfo);
	}
	
	public String updateproduct(ProductInfo productinfo,String pro_id)
	{
		return bossmanagedao.updateproduct(productinfo,pro_id);
	}
	
	public String deleteproduct(String pro_id)
	{
		return bossmanagedao.deleteproduct(pro_id);
	}
	public String addshop(String shopname,String username)
	{
		return bossmanagedao.addshop(shopname,username);
	}
	
}
