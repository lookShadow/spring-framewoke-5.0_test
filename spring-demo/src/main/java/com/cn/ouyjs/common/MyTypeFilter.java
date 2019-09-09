package com.cn.ouyjs.common;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author ouyjs
 * @date 2019/8/27 9:26
 */
public class MyTypeFilter implements TypeFilter {
	/**
	 *
	 * @param metadataReader the metadata reader for the target class  读取到当前正在扫描的类的信息
	 * @param metadataReaderFactory a factory for obtaining metadata readers 可以获取到其他任何类的信息
	 * for other classes (such as superclasses and interfaces)
	 * @return
	 * @throws IOException
	 */
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
		//获取当前类的注解信息
		AnnotationMetadata metadata = metadataReader.getAnnotationMetadata();
		//获取当前类的类信息
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		//获取当前扫描类的类资源(类的路径)
		Resource resource = metadataReader.getResource();
		String className = classMetadata.getClassName();
		System.out.println("-->" +className);
		if (className.contains("User")) {
			return true;
		}
		return false;
	}
}
