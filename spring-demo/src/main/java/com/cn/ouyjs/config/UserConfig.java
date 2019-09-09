package com.cn.ouyjs.config;

import com.cn.ouyjs.common.MyTypeFilter;
import com.cn.ouyjs.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author ouyjs
 * @date 2019/8/26 15:15
 */
//配置类==配置文件
@Configuration //告诉spring这是个配置类
@ComponentScan(value = {"com.cn.ouyjs" },includeFilters = {
		/*@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class),
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {UserService.class}),*/
		@ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
} ,useDefaultFilters = false)
//@ComponentScan value:指定要扫描的包
//excludeFilters = Filter[]:指定扫描的时候按照什么规则排除那些组件
//includeFilters = Filter[]:指定扫描的时候只需要包含那些组件--useDefaultFilters 要关闭默认的过滤规则
// FilterType.ANNOTATION 按照注解类型  calsses中为注解类
//FilterType.ASSIGNABLE_TYPE :按照给定的类型 classes中为具体的某些类
//FilterType.ASPECTJ  使用ASPECTJ表达式
//FilterType.REGEX 使用正则表达式
//FilterType.CUSTOM 使用自定义规则
public class UserConfig {

	//给容器中注册一个Bean 类型为返回值,id默认是用方法名作为id
	@Bean
	public User user(){
		return new User("Tom","Cat");
	}
}
