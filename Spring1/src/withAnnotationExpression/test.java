package withAnnotationExpression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("withAnnotationExpression.xml");

		Person person = context.getBean("personServiceId", Person.class);
		System.out.println(person);
	}
}
