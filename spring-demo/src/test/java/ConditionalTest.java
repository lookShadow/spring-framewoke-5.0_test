import com.cn.ouyjs.config.ConditionalConfig;
import com.cn.ouyjs.config.UserConfigOne;
import com.cn.ouyjs.entity.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ouyjs
 * @date 2019/8/27 14:11
 */
public class ConditionalTest {

	@Test
	public void conditionalTest(){
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(ConditionalConfig.class);
		System.out.println("创建容器完成....");
		String property = configApplicationContext.getEnvironment().getProperty("os.name");
		System.out.println("my " + property);
		printBeans(configApplicationContext);
	}

	private void printBeans(AnnotationConfigApplicationContext context) {
		String[] names = context.getBeanDefinitionNames();
		for (String name: names) {
			System.out.println(name);
		}
	}
}
