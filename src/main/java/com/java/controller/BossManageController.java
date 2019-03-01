package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.entity.ProductInfo;
import com.java.service.BossManageService;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class BossManageController {
	
	@Resource
    private BossManageService bossmanageservice;

	@Resource
	HttpServletRequest request;
	
	@RequestMapping(value = "/AddShop")
	public @ResponseBody  String valid(@RequestParam(value = "shop_name") String shopname) {
		String username=request.getSession().getAttribute("username").toString();
		String result=bossmanageservice.addshop(shopname,username);
        return String.valueOf(result);
        
    }
	
	@RequestMapping(value = "/Shop")
	public @ResponseBody  String valid() {
		String username=request.getSession().getAttribute("username").toString();
		net.sf.json.JSONArray shopcar_json = net.sf.json.JSONArray.fromObject(bossmanageservice.shop(username));
        return String.valueOf(shopcar_json);
        
    }
	
	@RequestMapping(value = "/AddProduct")
	public @ResponseBody  String valid(@RequestParam(value = "shop_name") ProductInfo productinfo) {

		String result=bossmanageservice.addproduct(productinfo);
		return String.valueOf(result);
        
    }
	
	@RequestMapping(value = "/UpdateProduct")
	public @ResponseBody  String valid(@RequestParam(value = "shop_name") ProductInfo productinfo,String pro_id) {

		String result=bossmanageservice.updateproduct(productinfo,pro_id);
		return String.valueOf(result);
        
    }
	
	@RequestMapping(value = "/DeleteProduct")
	public @ResponseBody  String deletepro(@RequestParam(value = "pro_id") String pro_id) {

		String result=bossmanageservice.deleteproduct(pro_id);
		return String.valueOf(result);
        
    }

}
