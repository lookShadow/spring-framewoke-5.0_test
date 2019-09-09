package com.cn.ouyjs.config;

import com.cn.ouyjs.common.MyConditional;
import com.cn.ouyjs.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author ouyjs
 * @date 2019/8/27 14:06
 */
@Configuration
public class ConditionalConfig {

	/**
	 * @Conditional({Condition}) 按照一定的条件进行判断,满足条件给容器中注册Bean
	 * @return
	 */
	@Bean
	@Conditional(value = {MyConditional.class})
	public User user(){
		return new User("one","two");
	}

	@Bean
	public User userOne(){
		return new User("one1","two1");
	}
}
