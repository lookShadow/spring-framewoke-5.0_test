package com.cn.ouyjs;

import com.cn.ouyjs.config.UserConfig;
import com.cn.ouyjs.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ouyjs
 * @date 2019/8/26 16:20
 */
public class Test {
	public static void main(String[] args) {
		new Test().test1();
	}

	public void test1() {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(UserConfig.class);

		User user = (User)configApplicationContext.getBean("user");
		System.out.println(user);
	}
}
