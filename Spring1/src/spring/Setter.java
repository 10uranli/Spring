package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Setter {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("setter.xml");
		Person person = context.getBean("personId", Person.class);
		System.out.println(person);
	}
}
