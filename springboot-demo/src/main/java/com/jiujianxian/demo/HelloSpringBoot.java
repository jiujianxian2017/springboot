package com.jiujianxian.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {
//	@Value("${name}")
//	private String name;
	@Autowired
	private GirlsProperties girl;
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello(){
//		return name+" Hello spring boot!";
		girl.setAge("19");
		return girl.getName()+"\r\n"+girl.getAge()+"\n"+girl.getCup();
	}
}
