package com.yumstone.service;

import com.yumstone.domain.Product;

/**
 * @author lee.
 * @date 2020/9/8 13:58
 */
public interface ProductService {
    Product findByPid(Integer pid);
}
