package com.jiujianxian.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(value="girl")
public class GirlsProperties {
	private String name;
	private String age;
	private String cup;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCup() {
		return cup;
	}
	public void setCup(String cup) {
		this.cup = cup;
	}
	@Override
	public String toString() {
		return "GirlsProperties [name=" + name + ", age=" + age + ", cup=" + cup + "]";
	}
}
