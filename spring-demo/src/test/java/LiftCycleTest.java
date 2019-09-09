import com.cn.ouyjs.config.ConditionalConfig;
import com.cn.ouyjs.config.LifeCycleConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ouyjs
 * @date 2019/8/27 14:11
 */
public class LiftCycleTest {

	@Test
	public void conditionalTest(){
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(LifeCycleConfig.class);

		configApplicationContext.getBean("tiger");
		configApplicationContext.getBean("sheep");
		System.out.println("创建容器完成....");
		configApplicationContext.close();
	}

	private void printBeans(AnnotationConfigApplicationContext context) {
		String[] names = context.getBeanDefinitionNames();
		for (String name: names) {
			System.out.println(name);
		}
	}
}
