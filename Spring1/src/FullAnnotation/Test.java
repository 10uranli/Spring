package FullAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("fullannotation.xml");
		 Person person = context.getBean("personId", Person.class);
		 System.out.println(person);
		 PersonService service = context.getBean("serviceId",PersonService.class);
		 System.out.println(service);

	}
}
