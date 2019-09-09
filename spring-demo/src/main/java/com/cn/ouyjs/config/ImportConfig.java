package com.cn.ouyjs.config;

import com.cn.ouyjs.common.MyFactoryBean;
import com.cn.ouyjs.common.MyImportBeanDefinitionRegistrar;
import com.cn.ouyjs.common.MyImportSelector;
import com.cn.ouyjs.entity.Cat;
import com.cn.ouyjs.entity.Dog;
import com.cn.ouyjs.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author ouyjs
 * @date 2019/8/27 15:09
 */
@Configuration
@Import({Dog.class, Cat.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
/**
 * 给容器中注册组件
 * 		1).包扫描+组件标注注解(@Controller/@Service/@Component/@Repository)
 * 		2).@Bean[导入的第三方包里面的组件]
 * 		3).@Import[快速给容器中导入一个组件]
 * 			1).@Import(要导入到容器中的组件),容器中就会自动注册这个组件,id默认是全类名
 * 			2).	ImportSelector:返回需要导入的组件的全类名数组(使用比较多)
 * 			3).ImportBeanDefinitionRegistrar:手动注册Bean到容器中
 * 		4).使用Spring提供的FactoryBean(工厂bean)
 * 			1).默认获取的是工厂Bean调用getObject()方法创建的对象
 * 			2).获取工厂bean对象本身,需要在id前面加一个&,
 * 				例如:Object factoryBean = configApplicationContext.getBean("&myFactoryBean");
 */
public class ImportConfig {

	@Bean
	public User user(){
		return new User();
	}

	@Bean
	public MyFactoryBean myFactoryBean(){
		return new MyFactoryBean();
	}
}
