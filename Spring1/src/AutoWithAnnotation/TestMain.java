package AutoWithAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("autowiring4.xml");
		 Person person = context.getBean("personId", Person.class);
		 System.out.println(person);

	}

}
