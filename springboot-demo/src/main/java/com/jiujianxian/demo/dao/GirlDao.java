package com.jiujianxian.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiujianxian.demo.domain.Girls;

/**
 * @author (︶︹︺)
 *
 */
public interface GirlDao extends JpaRepository<Girls, Integer>{

//	List<Girls> findByName(String name);
	List<Girls> findByAge(Integer age);
}
