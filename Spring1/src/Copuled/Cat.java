package Copuled;

public class Cat {

	Hayvan hayvan;

	public Cat() {
		hayvan = new Hayvan();
	}

	// birbirine ba�l�d�r.
	// hayvanda yap�lan bir de�i�iklik her �eyi alt �st edebilir.sesVerCat
	// metodu davran���n� de�i�ebilir.
	public void sesVerCat() {
		hayvan.sesVer();
		
	}
}
