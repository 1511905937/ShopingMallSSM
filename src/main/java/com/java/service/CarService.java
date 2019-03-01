package com.java.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.dao.CarDao;
import com.java.entity.ProductInfo;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service("CarService")
public class CarService {
	
	@Resource
    private CarDao cardao;
	
	public List<ProductInfo> showshopcar(String username)
	{
		return cardao.showshopcar(username);
	}
	
	public String addtocar(String pro_id,String username)
	{
		return cardao.addtocar(pro_id,username);
	}
}
