package com.jiujianxian.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiujianxian.demo.dao.GirlDao;
import com.jiujianxian.demo.domain.Girls;

@Service
public class GirlService {
	@Autowired
	private GirlDao girlDao;
	
	public void insertTwo(){
		Girls girlA = new Girls();
		girlA.setAge(16);
		girlA.setName("小雪");
		girlDao.save(girlA);
		
		Girls girlB = new Girls();
		girlB.setAge(180);
		girlB.setName("大雪");
		girlDao.save(girlB);
		
	}

}
