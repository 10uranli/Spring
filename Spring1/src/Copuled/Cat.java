package Copuled;

public class Cat {

	Hayvan hayvan;

	public Cat() {
		hayvan = new Hayvan();
	}

	// birbirine bağlıdır.
	// hayvanda yapılan bir değişiklik her şeyi alt üst edebilir.sesVerCat
	// metodu davranışını değişebilir.
	public void sesVerCat() {
		hayvan.sesVer();
		
	}
}
