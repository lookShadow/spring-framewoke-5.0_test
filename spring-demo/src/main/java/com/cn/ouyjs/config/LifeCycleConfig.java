package com.cn.ouyjs.config;

import com.cn.ouyjs.entity.Horse;
import com.cn.ouyjs.entity.Sheep;
import com.cn.ouyjs.entity.Tiger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author ouyjs
 * @date 2019/8/27 16:10
 */

/**
 * bean的生命周期
 * 		bean的创建---初始化----销毁的过程
 * 	容器管理Bean的生命周期
 * 	我们可以自定义初始化和销毁方法,容器在bean进行到当前生命周期的时候来调用我们自动以的初始化和销毁方法
 *
 * 	构造(对象创建)
 * 			单实例:在容器启动的时候创建对象
 * 			多实例:在每次获取对象的时候创建对象
 *
 * 	beanPostProcessor.postProcessBeforeInitialization
 * 	初始化
 *  beanPostProcessor.postProcessAfterInitialization
 *
 *	applyBeanPostProcessorsBeforeInitialization遍历得到容器中所有的BeanPostProcess;挨个执行beforeInitialization,
 *	一旦返回null,跳出for循环,不会执行beanPostProcessor.postProcessBeforeInitialization
 *
 *  BeanPostProcessor原理:
 *  populateBean(beanName, mbd, instanceWrapper);给Bean进行属性赋值
 *  初始化initializeBean{
 *  applyBeanPostProcessorsBeforeInitialization(wrappedBean, beanName);
 *  invokeInitMethods(beanName, wrappedBean, mbd);
 *  applyBeanPostProcessorsAfterInitialization(wrappedBean, beanName);
 *  }
 *
 * 		1). 指定初始化和销毁方法
 * 			通过@Bean指定initMethod和destoryMethod
 * 		2).通过让bean实现InitializingBean(定义初始化逻辑),
 * 					DisposableBean(定义销毁逻辑)
 * 		3).可以使用JSR250
 * 			@PostConstruct: 在bean创建完成并属性赋值完成,来执行初始化方法
 * 			@PreDestroy	在容器销毁bean之前通知我们进行销毁方法
 * 		4).beanPostProcessor:bean的后置处理器
 * 			postProcessBeforeInitialization:在初始化之前
 * 			postProcessAfterInitialization:在初始化之后
 *
 * 	Spring底层对BeanPostProcessor的使用;
 * 		比如:bean赋值,注入其他组件,@Autowired,生命周期注解功能,@Async, xxxBeanPostProcessor;
 */
@Configuration
public class LifeCycleConfig {

	//@Scope("prototype")
	@Bean(initMethod="init",destroyMethod="detory")
	public Tiger tiger(){
		return new Tiger();
	}

	@Bean
	@Scope("prototype")
	public Sheep sheep(){
		return new Sheep();
	}

	@Bean
	public Horse horse(){
		return new Horse();
	}
}
