package com.java.mapper;

import com.java.entity.ProductInfo;
import com.java.entity.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ProductMapper {
    /*
          查询一个店铺的所有商品
    */
    @Select("SELECT * FROM shop s,products p where p.pro_shop=s.shopname and shop_owner_id=${shop_owner_id}")
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
    public List<ProductInfo> bossgetAll(int shop_owner_id);

    /*
          查询所有商品
    */
    @Select("SELECT * FROM shop ")
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
    public List<ProductInfo> usergetAll();

    /*
          查询商品分类
    */
    @Select("SELECT * FROM shop where pro_kind=#{pro_kind}")
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
    public List<ProductInfo> getbyCategory(String pro_kind);

    /*
          查询一个商品
    */
    @Select("SELECT * FROM products WHERE pro_id = #{pro_id}")
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
    public List<ProductInfo> getOne(String pro_id);

    @Insert("insert into products(pro_id,pro_name,pro_content,pro_picture1,pro_picture2,pro_picture3,pro_sale,pro_shop,pro_kind,pro_price) values(null,${pro_name},${pro_content},${pro_picture1},${pro_picture2},${pro_picture3},${pro_sale},${pro_shop},${pro_kind},${pro_price}")
    public String insert(ProductInfo product);

    @Update("UPDATE user SET pro_name=#{pro_name},pro_content=#{pro_content} ,pro_picture1=#{pro_picture1},pro_picture2=#{pro_picture2},pro_picture3=#{pro_picture3},pro_sale=#{pro_sale},pro_kind=#{pro_kind},pro_price=#{pro_price} WHERE pro_id =#{pro_id}")
    public String update(ProductInfo product);

    @Delete("DELETE FROM products WHERE pro_id =#{pro_id}")
    public String delete(String pro_id);
}
