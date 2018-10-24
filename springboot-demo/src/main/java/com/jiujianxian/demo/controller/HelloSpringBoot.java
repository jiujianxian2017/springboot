package com.jiujianxian.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jiujianxian.demo.utils.GirlsProperties;

//@Controller
//public class HelloSpringBoot {
//	/*@Value("${name}")
//	private String name;*/
//	@Autowired
//	private GirlsProperties girl;
//	
//	
//	@RequestMapping(value="/hello",method=RequestMethod.GET)
//	public String hello(){
//		return " Hello spring boot!";
//	}
//	@RequestMapping(value="/girl",method=RequestMethod.GET)
//	public String welcome(){
//		return girl.getName()+"---"+girl.getAge()+girl.toString();
//	}
//	@RequestMapping(value="/welcome",method=RequestMethod.GET)
//	public String welcome2(){
//		return "welcome";
//	}
//}


@RestController
//@RequestMapping(value="/boot")
public class HelloSpringBoot {
	/*@Value("${name}")
	private String name;*/
	@Autowired
	private GirlsProperties girl;
	
	@RequestMapping(value="/hello",method=RequestMethod.POST)
	public String hello(){
		return " Hello spring boot!";
	}
	@RequestMapping(value="/girl")   //不推荐缺失method参数
	public String welcome(){
		return girl.getName()+"---"+girl.getAge()+girl.toString();
	}
	@RequestMapping(value={"/welcome","/hi"},method=RequestMethod.GET)
	public String welcome2(){
		return "welcome";
	}
//	@RequestMapping(value="/cool/{ids}/{name}",method=RequestMethod.GET)
//	public String cool(@PathVariable("ids") Integer id,@PathVariable("name") String name) {
//		String cool=id+"\t"+name;
//		return cool;
//	}
	
	@RequestMapping(value="/cool2",method=RequestMethod.GET)
	public String cool2(@PathParam("id22") Integer myid,@PathParam("name") String name) {
		String cool=myid+"\t"+name;
		return cool;
	}
	
	@RequestMapping(value="/cool3",method=RequestMethod.GET)
	public String cool3( Integer myid,String name) {
		String cool=myid+"\t"+name;
		return cool;
	}
	@GetMapping(value="/cool4")
	public String cool4( Integer myid,String name) {
		String cool=myid+"\t"+name;
		return cool;
	}
	@PostMapping(value="/cool5")
	public String cool5( Integer myid,String name) {
		String cool=myid+"\t"+name;
		return cool;
	}
	
	@GetMapping(value="/cool6")
	public String cool6( @RequestParam(value="ids",defaultValue="10001") Integer id,String name) {
		String cool=id+"\t"+name;
		return cool;
	}
	
}
