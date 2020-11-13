package com.yumstone.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lee.
 * @date 2020/9/9 15:09
 */
//@RestController
public class OrderController3 {
    @RequestMapping("/order/message")
    public String test(){
        return "test high";
    }

    @RequestMapping("/order/message2")
    public String test2(){
        return "test high 2";
    }
    @RequestMapping("/order/message3")
    @SentinelResource("message")
    public String test3(String name,Integer age){
        return name +":"+age;
    }
}
