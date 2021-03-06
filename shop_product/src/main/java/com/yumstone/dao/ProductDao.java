package com.yumstone.dao;

import com.yumstone.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lee.
 * @date 2020/9/8 13:57
 */
public interface ProductDao extends JpaRepository<Product,Integer> {
    Product findByPid(Integer pid);
}
