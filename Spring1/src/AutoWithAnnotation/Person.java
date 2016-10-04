package AutoWithAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
private String personName;

private Car car;
public Person() {
	//default yap�land�r�c� koymazsak hata al�r�z.
}
@Autowired
//YAPILANDIRICI �LE �NJECT ETMEK ���N.
public Person(Car car) {
	super();
	this.car = car;
}
//setter �zerinden inject
//Xml dosyas�nda bir adet phone bean varsa bu yeterle olacakt�r.
@Autowired
//Xml dosyas�nda birden fazla phone bean varsa @Qualifier ile id g�stermeliyiz.
@Qualifier(value = "nokiaId")
private Phone phone;

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
public Phone getPhone() {
	return phone;
}
public void setPhone(Phone phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "Person [personName=" + personName + ", car=" + car + ", phone=" + phone + "]";
}

}
