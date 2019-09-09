package com.cn.ouyjs.controller;

import com.cn.ouyjs.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author ouyjs
 * @date 2019/8/26 17:20
 */
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private UserService userService1;

	public void user(){
		System.out.println("userService: "+userService);
		System.out.println("userService1: "+userService1);
	}
}
