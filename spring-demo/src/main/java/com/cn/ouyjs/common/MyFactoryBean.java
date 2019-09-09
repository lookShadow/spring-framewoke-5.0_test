package com.cn.ouyjs.common;

import com.cn.ouyjs.entity.Lion;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author ouyjs
 * @date 2019/8/27 15:46
 */
public class MyFactoryBean implements FactoryBean<Lion> {
	@Override
	public Lion getObject() throws Exception {
		return new Lion();
	}

	@Override
	public Class<?> getObjectType() {
		return Lion.class;
	}

	/**
	 * 是否是单例
	 * true:是单例
	 * false:多例(原型)
	 * @return
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}
}
