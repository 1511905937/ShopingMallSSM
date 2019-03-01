package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.service.CarService;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

	@Resource
    private CarService carService;

	@Resource
	HttpServletRequest request;

	@RequestMapping(value = "/AddToCar")
	public @ResponseBody  String valid(@RequestParam(value = "pro_id") String pro_id) {

		String username=request.getSession().getAttribute("username").toString();
		String result=carService.addtocar(pro_id,username);
        return String.valueOf(result);
        
    }
	
	@RequestMapping(value = "/Car")
	public @ResponseBody  String valid() {
		String username=request.getSession().getAttribute("username").toString();
		net.sf.json.JSONArray shopcar_json = net.sf.json.JSONArray.fromObject(carService.showshopcar(username));
        return String.valueOf(shopcar_json);
        
    }
	
}
