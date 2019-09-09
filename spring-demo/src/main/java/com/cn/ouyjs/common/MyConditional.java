package com.cn.ouyjs.common;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


/**
 * @author ouyjs
 * @date 2019/8/27 14:07
 */
public class MyConditional implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String property = context.getEnvironment().getProperty("os.name");
		System.out.println(property);
		if (property.equals("Windows 10")) {
			return true;
		}
		return false;
	}
}
