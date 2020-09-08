package com.yumstone.controller;

import com.alibaba.fastjson.JSON;
import com.yumstone.domain.Order;
import com.yumstone.domain.Product;
import com.yumstone.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lee.
 * @date 2020/9/8 13:58
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderService orderService;
    @RequestMapping("/order/prod/{pid}")
    public Order order(@PathVariable("pid") Integer pid){
        log.info("接收{}号商品的下单服务",pid);
        Product product =   restTemplate.getForObject("http://127.0.0.1:8081/product/"+pid, Product.class);
        log.info("商品信息查询成功={}", JSON.toJSONString(product));
        Order order = new Order();
        order.setUid(1);
        order.setUsername("测试");
        order.setPid(pid);
        order.setPanme(product.getPname());
        order.setPprice(product.getPprice());
        order.setNumber(1);
        orderService.createOrder(order);
        log.info("下单成功={}", JSON.toJSONString(order));
        return order;
    }
}
