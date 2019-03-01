package com.java.controller;

import com.java.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.dao.UserManageDao;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserManageController {
	
	@Resource
    private UserManageDao usermanagedao;

	@Resource
    HttpServletRequest request;

    @RequestMapping(value = "/Login")
    public @ResponseBody String valid(@RequestParam(value = "username") String username,@RequestParam(value = "password") String password)
    {

        String result=usermanagedao.login(username,password);
        request.getSession().setAttribute("username",username);
        return String.valueOf(result);
    }

    @RequestMapping(value = "/Register")
    public @ResponseBody String valid(UserInfo userinfo) {
        String result=usermanagedao.register(userinfo);
        return String.valueOf(result);
    }


}
