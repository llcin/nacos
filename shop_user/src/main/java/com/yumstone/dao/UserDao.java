package com.yumstone.dao;

import com.yumstone.domain.User;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lee.
 * @date 2020/9/8 13:49
 */
public interface UserDao extends JpaRepository<User,Integer>{
}
