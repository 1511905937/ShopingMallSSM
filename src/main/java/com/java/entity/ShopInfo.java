package com.java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

//@Entity
//@Table(name = "shop")
@Component
public class ShopInfo {
	//@Column
	private String shopname;
	//@Id
	private int shop_owner_id;
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public int getShop_owner_id() {
		return shop_owner_id;
	}
	public void setShop_owner_id(int shop_owner_id) {
		this.shop_owner_id = shop_owner_id;
	}
	

}
