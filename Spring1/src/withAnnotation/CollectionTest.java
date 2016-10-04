package withAnnotation;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("withAnnotation.xml");

		Collection bean = context.getBean("serviceId", Collection.class);
		
		List<Object> list = bean.getMyList();
		System.out.println("My List");
		for(Object li : list){
			System.out.println(li);
		}
		
		Map<String, Object> map = bean.getMyMap();
		System.out.println("My Map");
		for(Object m : map.keySet() ){
			System.out.println(map.get(m));
		}
		
	}
}
