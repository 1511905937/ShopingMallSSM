package com.java.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.dao.ProductDao;
import com.java.entity.ProductInfo;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service("productService")
public class ProductService {
	
	@Resource
    private ProductDao productdao;

	public List<ProductInfo> index()
	{
		return productdao.index();
	}
	
	public List<ProductInfo> category(String kind)
	{
		return productdao.category(kind);
	}
	
	public List<ProductInfo> productdetail(String pro_id)
	{
		return productdao.productdetail(pro_id);
	}
	
	
}
