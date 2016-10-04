package withAnnotationExpression;

import org.springframework.stereotype.Service;

@Service("person2ServiceId")
public class Person2 {
private String name = "Onur";

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}
