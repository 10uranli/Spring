package FullAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personId")
public class Person {
	@Value(value = "Onur")
	private String personName;
	@Autowired
	// setter injection
	private Car car;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", car=" + car + "]";
	}

}
