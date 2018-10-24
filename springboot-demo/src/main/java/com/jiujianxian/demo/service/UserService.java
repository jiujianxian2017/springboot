package com.jiujianxian.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jiujianxian.demo.dao.UserDao;
import com.jiujianxian.demo.domain.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	@Transactional
	public void insertTwo(){
		User girlA = new User();
		girlA.setSex(false);
		girlA.setName("999");
		girlA.setAge("9");
		userDao.save(girlA);
		
		User girlB = new User();
		girlB.setSex(true);
		girlB.setName("1010");
		girlB.setAge("10");
		userDao.save(girlB);
	}

}
