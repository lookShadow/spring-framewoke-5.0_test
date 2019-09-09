package com.cn.ouyjs.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author ouyjs
 * @date 2019/8/28 15:38
 */

/**
 * 切面类
 */
@Aspect
public class LogAspect {

	/**
	 * @Pointcut 抽取公共的切入点表达式
	 * 1.本类引用直接 在注解中写入该方法
	 * 2.其他的切面类引用需要 copy Reference 复制引用
	 *
	 * 表达式:execution(访问权限符 返回值 方法全类名(参数列表))
	 * 		*:
	 * 			1).匹配一个或者多个字符
	 * 			2).匹配任意一个参数,
	 * 			3).只能匹配一层路径
	 * 			4).权限位置不能用*, 权限位置可不写
	 * 		..
	 * 			1).匹配任意多个参数,任意类型参数
	 * 			2).匹配任意多层路径
	 *
	 */
	@Pointcut("execution(public int com.cn.ouyjs.entity.Cat.*(..))")
	public void pointCut(){

	}

	@Before(value = "pointCut()")
	public void before(JoinPoint joinPoint){
		System.out.println("LogAspect...before "+joinPoint.getSignature().getName());
	}

	@After(value = "pointCut()")
	public void after(JoinPoint joinPoint){
		System.out.println("LogAspect...after "+joinPoint.getSignature().getName());
	}

	//JoinPoint一定要出现参数表的第一位
	@AfterReturning(value = "pointCut()", returning = "result")
	public void result(JoinPoint joinPoint,Object result) {
		System.out.println("LogAspect...result  "+joinPoint.getSignature().getName()+" result:"+result);
	}

	@AfterThrowing(value = "pointCut()", throwing = "exception")
	public void throwss(JoinPoint joinPoint, Exception exception){
		System.out.println("LogAspect...throwss  "+joinPoint.getSignature().getName()+" exception:"+exception.getStackTrace());
	}
}
