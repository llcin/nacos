package com.yumstone.controller;

import com.yumstone.domain.Product;
import com.yumstone.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lee.
 * @date 2020/9/8 13:58
 */
@RestController
@Slf4j
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/product/{pid}")
    public Product product(@PathVariable("pid") Integer pid){
        log.info("商品信息查询，商品id={}",pid);
        return productService.findByPid(pid);
    }
}
