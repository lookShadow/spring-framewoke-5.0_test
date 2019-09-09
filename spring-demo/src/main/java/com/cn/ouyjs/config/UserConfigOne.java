package com.cn.ouyjs.config;

import com.cn.ouyjs.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @author ouyjs
 * @date 2019/8/27 9:48
 */
@Configuration
public class UserConfigOne {

	/**
	 * @Scope 调整作用域
	 * 默认 singleton
	 * singleton 单例: 对象的创建在容器中完成--ioc容器启动会调用方法创建对象放到Ioc容器中
	 * 					以后每次获取就是从Ioc容器(mp.get())中直接获取,容器关闭 对象将被销毁
	 * prototype 多例(原型):对象的创建在需要(引用/New )的时候完成--ioc容器启动并不会去调用方法创建对象放在容器中
	 * 					每次获取的时候才会调用方法创建对象,容器关闭 对象不会被销毁
	 * request 同一次请求创建一个实例(web)
	 * session 同一个session创建一个实例(web)
	 * @Lazy 懒加载:针对单实例bean
	 * 		单实例bean:默认在容器启动的时候创建对象
	 * 		懒加载:容器启动不创建对象.第一次使用(获取)对象的时候创建对象,并初始化
	 * @return
	 */
	@Bean
	@Lazy
	@Scope("singleton")
	public User user(){
		return new User("King", "custom");
	}
}
