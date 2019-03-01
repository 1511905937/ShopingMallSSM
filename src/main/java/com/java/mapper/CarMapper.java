package com.java.mapper;

import com.java.entity.ProductInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CarMapper {

    @Insert("insert into car values(null,#{shopcar_userid},#{shopcar_proid}")
    public String insert(int shopcar_userid,String shopcar_proid);

    @Select("SELECT * FROM car c,product p where c.shopcar_userid=#{user_id} and c.shopcar_proid=p.pro_id")
    @Results({
            @Result(property = "pro_id",  column = "pro_id"),
            @Result(property = "pro_name", column = "pro_name"),
            @Result(property = "pro_content",  column = "pro_content"),
            @Result(property = "pro_picture1", column = "pro_picture1"),
            @Result(property = "pro_picture2",  column = "pro_picture2"),
            @Result(property = "pro_picture3", column = "pro_picture3"),
            @Result(property = "pro_sale",  column = "pro_sale"),
            @Result(property = "pro_shop", column = "pro_shop"),
            @Result(property = "pro_kind",  column = "pro_kind"),
            @Result(property = "pro_price", column = "pro_price")
    })
    public List<ProductInfo> getcar(int shopcar_userid);
}
