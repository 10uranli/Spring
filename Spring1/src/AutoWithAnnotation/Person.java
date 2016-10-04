package AutoWithAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
private String personName;

private Car car;
public Person() {
	//default yapýlandýrýcý koymazsak hata alýrýz.
}
@Autowired
//YAPILANDIRICI ÝLE ÝNJECT ETMEK ÝÇÝN.
public Person(Car car) {
	super();
	this.car = car;
}
//setter üzerinden inject
//Xml dosyasýnda bir adet phone bean varsa bu yeterle olacaktýr.
@Autowired
//Xml dosyasýnda birden fazla phone bean varsa @Qualifier ile id göstermeliyiz.
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
