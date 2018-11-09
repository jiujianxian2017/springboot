package com.jiujianxian.demo.controller.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiujianxian.demo.domain.Girls;
import com.jiujianxian.demo.service.GirlService;

@RestController
@RequestMapping(value="/web")
public class GirlControllerWeb {
	@Autowired
	private GirlService girlService;
	
	@PostMapping(value="addOne")
	public Girls addGirl(@Valid Girls girl,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			System.out.println(bindingResult.getFieldError().getDefaultMessage());
			return null;
		}
		Girls girls= new Girls();
		girls.setAge(girl.getAge());
		girls.setId(girl.getId());
		girls.setName(girl.getName());
		return girlService.insertOne(girls);
	}

}
