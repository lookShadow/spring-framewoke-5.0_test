package com.cn.ouyjs.config;

import com.cn.ouyjs.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ouyjs
 * @date 2019/8/27 17:04
 */
@Configuration
/**
 * @PropertySource 读取外部配置文件中的k/v 保存到运行的环境变量中;加载完外部的配置文件以后使用@Value(${})取出配置文件中的值
 * @PropertySource(value = {"/user.properties"}) /@PropertySource(value = {"classPath:/user.properties"})
 */
@PropertySource(value = {"/user.properties"})
public class PropertyValuesConfig {

	@Bean
	public User user(){
		return new User();
	}
}
