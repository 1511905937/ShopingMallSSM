package com.java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

//@Entity
//@Table(name = "evaluate")
@Component
public class EvaluateInfo {
	//@Id
	private int evaluate_id;
	//@Column
	private int user_id;
	//@Column
	private String evaluate_content;
	//@Column
	private String evaluate_picture1;
	//@Column
	private int evaluate_pro;
	public int getEvaluate_id() {
		return evaluate_id;
	}
	public void setEvaluate_id(int evaluate_id) {
		this.evaluate_id = evaluate_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getEvaluate_content() {
		return evaluate_content;
	}
	public void setEvaluate_content(String evaluate_content) {
		this.evaluate_content = evaluate_content;
	}
	public String getEvaluate_picture1() {
		return evaluate_picture1;
	}
	public void setEvaluate_picture1(String evaluate_picture1) {
		this.evaluate_picture1 = evaluate_picture1;
	}
	public int getEvaluate_pro() {
		return evaluate_pro;
	}
	public void setEvaluate_pro(int evaluate_pro) {
		this.evaluate_pro = evaluate_pro;
	}
	
}
