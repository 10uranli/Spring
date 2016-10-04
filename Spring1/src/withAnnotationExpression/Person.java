package withAnnotationExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("personServiceId")
public class Person {
	@Value("#{person2ServiceId.name}")
	private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Person [name=" + name + "]";
}

}
