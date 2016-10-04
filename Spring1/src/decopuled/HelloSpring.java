package decopuled;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationCon.xml");
		Person1 person1 = context.getBean("person1Id", Person1.class);
		person1.hayvanSoyle();
		((ClassPathXmlApplicationContext) context).close();
	}

}
