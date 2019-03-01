package com.java.mapper;

import com.java.entity.ShopInfo;
import com.java.entity.UserInfo;
import org.apache.ibatis.annotations.*;

public interface ShopMapper {

    @Insert("insert into shop(shopname,shop_owner_id) values(#{shopname},#{shop_owner_id}")
    public String insert(ShopInfo shopinfo);

}
