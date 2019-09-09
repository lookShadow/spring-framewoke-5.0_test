import com.cn.ouyjs.config.ConditionalConfig;
import com.cn.ouyjs.config.ImportConfig;
import com.cn.ouyjs.entity.Lion;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ouyjs
 * @date 2019/8/27 14:11
 */
public class ImportTest {

	@Test
	public void importTest(){
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(ImportConfig.class);
		System.out.println("创建容器完成....");
		//工厂bean获取的是调用getObject创建的对象
		printBeans(configApplicationContext);
		Object bean = configApplicationContext.getBean("myFactoryBean");
		//获取工厂bean
		Object factoryBean = configApplicationContext.getBean("&myFactoryBean");
		System.out.println("ImportTest..." +bean.getClass());
		System.out.println("ImportTest..." +factoryBean.getClass());
	}

	private void printBeans(AnnotationConfigApplicationContext context) {
		String[] names = context.getBeanDefinitionNames();
		for (String name: names) {
			System.out.println(name);
		}
	}
}
