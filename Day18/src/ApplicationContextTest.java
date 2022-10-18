import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");
		System.out.println("Application Context Started");

	}

}
