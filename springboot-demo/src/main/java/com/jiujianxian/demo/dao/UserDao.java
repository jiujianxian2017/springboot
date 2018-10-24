package com.jiujianxian.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiujianxian.demo.domain.User;

/**
 * @author (︶︹︺)
 *
 */
public interface UserDao extends JpaRepository<User, Integer>{
}
