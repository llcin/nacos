package com.yumstone;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lee.
 * @date 2020/9/30 14:09
 */
@RestController
public class Test {
    @RequestMapping("test")
    public String tet() {
        return "test";
    }

    public static void main(String[] args) {
        BCryptPasswordEncoder b = new BCryptPasswordEncoder();
        String srt = b.encode("123456");
        System.out.println(srt);
    }
}
