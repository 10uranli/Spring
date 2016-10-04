package ListWithXml;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class listMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("listWithXml.xml");
		Person bean = context.getBean("withCollectionId",Person.class);
		System.out.println("WÝTH LÝST");
		List<Object> list = bean.getList();
		for(Object li : list){
			System.out.println(li);
		}
		System.out.println("WÝTH SET");
		Set<Object> set = bean.getSet();
		for(Object s : set){
			System.out.println(s);
		}

	}

}
