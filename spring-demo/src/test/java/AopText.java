import com.cn.ouyjs.config.AopConfig;
import com.cn.ouyjs.entity.Cat;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

/**
 * @author ouyjs
 * @date 2019/8/28 15:47
 */
public class AopText {

	@Test
	public void aopTest(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
/*		String[] names = context.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}*/

		Cat cat = (Cat) context.getBean("cat");
		cat.run(2,0);
	}
}
