package withExpression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import withAnnotation.Collection;

public class testMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("expression.xml");

		Person person = context.getBean("personId", Person.class);
		System.out.println(person);
	}

}
