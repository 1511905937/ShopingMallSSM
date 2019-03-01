package com.java.dao;

import com.java.mapper.ProductMapper;
import com.java.mapper.UserMapper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.java.entity.ProductInfo;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Repository("productDao")
@SuppressWarnings("all")
public class ProductDao {

	@Resource
	private ProductMapper productmapper;

	public List<ProductInfo> index()
	{
		return productmapper.usergetAll();
	}
	
	public List<ProductInfo> category(String kind)
	{
		return productmapper.usergetAll();
	}

	public List<ProductInfo> productdetail(String pro_id){return productmapper.getOne(pro_id); }
}
