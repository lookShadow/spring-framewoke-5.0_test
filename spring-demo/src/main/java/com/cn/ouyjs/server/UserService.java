package com.cn.ouyjs.server;

import com.cn.ouyjs.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author ouyjs
 * @date 2019/8/26 17:21
 */
//@Primary
@Service
public class UserService {

	@Autowired
	private UserController userController;

	private String indent = "1";

	public String getIndent() {
		return indent;
	}

	public void setIndent(String indent) {
		this.indent = indent;
	}

	@Override
	public String toString() {
		return "UserService{" +
				"indent='" + indent + '\'' +
				'}';
	}
}
