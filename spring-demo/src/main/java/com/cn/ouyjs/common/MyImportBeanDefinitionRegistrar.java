package com.cn.ouyjs.common;

import com.cn.ouyjs.entity.Car;
import com.cn.ouyjs.entity.Dog;
import com.cn.ouyjs.entity.Panda;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author ouyjs
 * @date 2019/8/27 15:16
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	/**
	 *AnnotationMetadata:当前类的所有注解信息
	 * BeanDefinitionRegistry 注册类
	 * 		把所有需要添加到容器中的Bean,调用
	 * 	BeanDefinitionRegistry.registerBeanDefinition 手动注册
	 */
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		boolean dog = registry.containsBeanDefinition("user");
		if (dog) {
			//定义一个bean信息
			BeanDefinition beanDefinition = new RootBeanDefinition(Panda.class);
			//注册Bean
			registry.registerBeanDefinition("panda", beanDefinition);
		}
	}
}
