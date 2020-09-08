package com.yumstone.service.impl;

import com.yumstone.dao.ProductDao;
import com.yumstone.domain.Product;
import com.yumstone.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lee.
 * @date 2020/9/8 13:58
 */
@Service
public class ProductImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public Product findByPid(Integer pid) {
        return  productDao.findByPid(pid);

    }
}
