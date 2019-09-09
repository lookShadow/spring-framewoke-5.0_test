package com.cn.ouyjs.entity;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author ouyjs
 * @date 2019/8/26 15:14
 */
public class User {

	public User(){

	}
	public User(String name, String passwd) {
		this.name = name;
		this.passwd = passwd;
	}

	/**
	 * 使用@Value赋值:
	 * 1.基本数值 @Value("i am king")
	 * 2.可以写SpEL, #{} @Value("#{20-2}")
	 * 3.可以从配置文件(运行环境变量中)中读取值 ${}
	 */
	@Value("${user.Name}")
	private String name;

	@Value("${user.passwd}")
	private String passwd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", passwd='" + passwd + '\'' +
				'}';
	}
}
