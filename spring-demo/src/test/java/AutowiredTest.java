import com.cn.ouyjs.config.AutowiredConfig;
import com.cn.ouyjs.controller.UserController;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ouyjs
 * @date 2019/8/28 9:09
 */
public class AutowiredTest {
	@Test
	public void autowiredTest(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutowiredConfig.class);
	/*	String[] names = context.getBeanDefinitionNames();
		for(String name : names) {
			System.out.println(name);
		}*/
		/*Object userService = context.getBean("userService");
		System.out.println("context..userService: "+userService);*/
		/*UserController userController = (UserController) context.getBean("userController");
		userController.user();*/
	}
}
