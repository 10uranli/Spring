package AutoW3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("autowiring3.xml");
		Person person = context.getBean("personId", Person.class);
		System.out.println(person);
	}
}
