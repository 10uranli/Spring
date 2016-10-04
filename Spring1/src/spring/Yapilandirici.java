	package spring;
	
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	
	public class Yapilandirici {
		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("yapilandirici.xml");
			Person2 person = context.getBean("personId", Person2.class);
			System.out.println(person);
		}
	}
