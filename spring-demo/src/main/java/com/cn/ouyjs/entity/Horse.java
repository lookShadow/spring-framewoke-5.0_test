package com.cn.ouyjs.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author ouyjs
 * @date 2019/8/27 16:24
 */
public class Horse implements BeanPostProcessor {
	public Horse() {
		System.out.println("构造器....Horse");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("初始化....Horse");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("销毁.....Horse");
		return bean;
	}
}
