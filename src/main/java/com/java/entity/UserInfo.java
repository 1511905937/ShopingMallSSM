package com.java.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;

//@Entity
//@Table(name = "user")
@Component
public class UserInfo {
	//@Id
	private int user_id;
	//@Column
	private String user_name;
	//@Column
	private String user_pwd;
	//@Column
	private int user_isboss;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public int getUser_isboss() {
		return user_isboss;
	}
	public void setUser_isboss(int user_isboss) {
		this.user_isboss = user_isboss;
	}
	
}
