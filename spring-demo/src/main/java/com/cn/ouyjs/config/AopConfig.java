package com.cn.ouyjs.config;

import com.cn.ouyjs.aop.LogAspect;
import com.cn.ouyjs.entity.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author ouyjs
 * @date 2019/8/28 9:30
 */

/**
 * AOP:[动态代理]
 * 		指在程序运行期间动态的将某段代码切入到指定方法指定位置进行运行的编程方式
 *
 * 	1.导入aop模块,Spring AOP(spring-aspects)
 * 	2.定义一个业务逻辑类:在业务逻辑运行的时候将日志进行打印(方法之前,方法之后,方法出现异常,xxx)
 * 	3,定义一个日志切面类:切面类里面的方法需要动态感知 业务逻辑类中定义的方法(切点) 运行到哪里然后开始执行
 * 		通知方法:
 * 				前置通知(@Before):在目标方法运行之前运行
 * 				后置通知(@After):在目标方法运行结束后运行,不管目标方法是正常运行还是异常运行后置通知都运行,原理是:finally
 * 				异常通知(@AfterThrowing):在目标方法正常返回之后运行
 * 				返回通知(@AfterReturning):在目标方法出现异常之后运行
 * 				环绕通知(@Around):动态代理,手动推进目标方法运行(joinPoint.procced())
 * 	4.给目标方法标注何时何地运行(通知注解);
 * 	5.将切面类和业务逻辑类(目标方法所在的类)都加入到ioc容器中
 * 	6.必须告诉ioc容器那个是切面类(在切面类上加上@Aspect注解)
 * 	7.给配置类中加@EnableAspectJAutoProxy[开启基于注解的aop模式]
 *
 * 	三部曲:
 * 		1. 将业务逻辑组件和切面类都加入到容器中,告诉spring那个是切面类(@Aspect)
 * 		2. 在切面类中的每一个通知方法都标注相应的注解,告诉spring何时何地运行(切入点表达式)
 * 		3. 开启基于注解的aop模式@EnableAspectJAutoProxy
 *
 */
@EnableAspectJAutoProxy
@Configuration
public class AopConfig {
	@Bean
	public LogAspect logAspect() {
		return new LogAspect();
	}
	@Bean
	public Cat cat() {
		return new Cat();
	}

}
