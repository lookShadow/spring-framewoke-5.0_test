import com.cn.ouyjs.config.UserConfig;
import com.cn.ouyjs.config.UserConfigOne;
import com.cn.ouyjs.entity.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ouyjs
 * @date 2019/8/26 16:30
 */
public class UserTest {

	@Test
	public void userConfigTest(){
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(UserConfig.class);
		printBeans(configApplicationContext);
		/*User user = (User)configApplicationContext.getBean("张三");
		System.out.println(user);*/
	}

	@Test
	public void userConfigOneTest(){
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(UserConfigOne.class);
		System.out.println("创建容器完成....");
		User user = (User) configApplicationContext.getBean("user");
		User user1 = (User) configApplicationContext.getBean("user");
		System.out.println(user.equals(user1));
	}

	private void printBeans(AnnotationConfigApplicationContext context) {
		String[] names = context.getBeanDefinitionNames();
		for (String name: names) {
			System.out.println(name);
		}
	}
}
