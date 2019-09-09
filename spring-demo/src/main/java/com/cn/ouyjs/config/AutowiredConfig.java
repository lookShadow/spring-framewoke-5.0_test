package com.cn.ouyjs.config;

import com.cn.ouyjs.server.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ouyjs
 * @date 2019/8/28 9:08
 */
@Configuration
@ComponentScan({"com.cn.ouyjs.controller","com.cn.ouyjs.server","com.cn.ouyjs.dao"})
public class AutowiredConfig {

/*	@Bean("userService2")
	public UserService userService(){
		UserService userService = new UserService();
		userService.setIndent("2");
		return userService;
	}*/
}
