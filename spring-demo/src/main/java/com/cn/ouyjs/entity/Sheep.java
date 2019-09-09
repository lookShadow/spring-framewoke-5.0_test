package com.cn.ouyjs.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author ouyjs
 * @date 2019/8/27 16:19
 */
	public class Sheep implements InitializingBean, DisposableBean {

		public Sheep() {
			System.out.println("构造器....Sheep");
		}

		public void init() {
			System.out.println("初始化....Sheep");
		}

		public void detory(){
			System.out.println("销毁.....Sheep");
		}

		@Override
		public void destroy() throws Exception {
			System.out.println("销毁..Sheep...destroy");
		}

		@Override
		public void afterPropertiesSet() throws Exception {
			System.out.println("初始化..Sheep..afterPropertiesSet");
		}
	}
