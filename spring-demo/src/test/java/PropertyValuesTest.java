import com.cn.ouyjs.config.ConditionalConfig;
import com.cn.ouyjs.config.PropertyValuesConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ouyjs
 * @date 2019/8/27 14:11
 */
public class PropertyValuesTest {

	@Test
	public void propertyValuesTest(){
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(PropertyValuesConfig.class);
		System.out.println("创建容器完成....");
		printBeans(configApplicationContext);

		Object user = configApplicationContext.getBean("user");
		System.out.println(user);
	}

	private void printBeans(AnnotationConfigApplicationContext context) {
		String[] names = context.getBeanDefinitionNames();
		for (String name: names) {
			System.out.println(name);
		}
	}
}
