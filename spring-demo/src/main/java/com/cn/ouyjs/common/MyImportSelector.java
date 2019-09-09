package com.cn.ouyjs.common;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author ouyjs
 * @date 2019/8/27 15:15
 */
public class MyImportSelector implements ImportSelector {
	/**
	 * 返回需要导入的组件的全类名数组
	 * @param importingClassMetadata 获取当前标注@Import注解类的所有注解信息
	 * @return
	 */
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.cn.ouyjs.entity.Car"};
	}
}
