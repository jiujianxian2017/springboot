package com.jiujianxian.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiujianxian.demo.dao.GirlDao;
import com.jiujianxian.demo.domain.Girls;
import com.jiujianxian.demo.service.GirlService;

@RestController
@RequestMapping(value="/girls/girl")
public class GirlController {
	@Autowired
	private GirlDao girlDao;
	
	@Autowired
	private GirlService girlService;
	
	/**
	 * 查询所有
	 * @return
	 */
	@GetMapping(value="/getall")
	public List<Girls> findAllGirls() {
		List<Girls> girls = girlDao.findAll();
		return girls;
	}
	
	/**
	 * 添加一个
	 */
	@GetMapping(value="/insert")
	public Girls insertGirl(Integer id,Character cup,Integer age,String name) {
		Girls girls = new Girls();
//		girls.setId(id);    //id自增不取set的值
		girls.setName(name);
		girls.setAge(age);
		return girlDao.save(girls);
	}
	
	//查询一个
	@GetMapping(value="/select/{id}")
	public Optional<Girls> findOneGirl(@PathVariable(value="id") Integer id){
		return girlDao.findById(id);
	}
	//更新
	@GetMapping(value="/update/{id}")
	public Girls updateOne(@PathVariable(value="id") Integer id,Integer age,String name, char cupsize){
		Girls girl = new Girls();
		girl.setAge(age);
		girl.setName(name);
		girl.setId(id);
		return girlDao.save(girl);
	}
	//删除
	@GetMapping(value="/delete/{id}")
	public String delOne(Integer id){
		 Girls girl = new Girls();
		 girl.setId(id);
		girlDao.delete(girl);
		 return "delete sucess!";
	}
	//根据id删除
	@GetMapping(value="/delbyid/{ids}")
	public String delbyid(@PathVariable(value="ids")Integer id){
		girlDao.deleteById(id);
		 return "delete sucess!";
	}
	
	//根据年龄查询
	@GetMapping(value="/select")
	public List<Girls> findbyAge(Integer age){
		 return girlDao.findByAge(age);
	}
	
//	//根据名字查询
//	@GetMapping(value="/select")
//	public List<Girls> findbyName(String name){
//		return girlDao.findByName(name);
//	}			 
	@GetMapping(value="insert2")		
	public void  insertTwo() {
		girlService.insertTwo();
	}
}
