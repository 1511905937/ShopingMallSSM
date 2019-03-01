package com.java.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.service.ProductService;

import javax.annotation.Resource;

@Controller
public class ProductController {

    @Resource
    private ProductService productservice;

    @RequestMapping(value = "/ProductCategory")
    public @ResponseBody  String valid(@RequestParam(value = "kind") String kind) {

        net.sf.json.JSONArray category_json = net.sf.json.JSONArray.fromObject(productservice.category(kind));
        return String.valueOf(category_json);

    }

    @RequestMapping(value = "/ProductDetail")
    public @ResponseBody  String product_detail(@RequestParam(value = "pro_id") String pro_id) {

        net.sf.json.JSONArray productdetail_json = net.sf.json.JSONArray.fromObject(productservice.productdetail(pro_id));
        return String.valueOf(productdetail_json);

    }

    @RequestMapping(value = "/ProductIndex")
    public @ResponseBody String index() {

        net.sf.json.JSONArray index_json = net.sf.json.JSONArray.fromObject(productservice.index());
        return String.valueOf(index_json);
    }

}
