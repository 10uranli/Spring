package decopuled;

public class testing {
	public static void main(String[] args) {

		Human human = new Person1();// human interfacesini implement eden bir
									// Person1 nesnesi (codeto�nterface)
		Animal animal = new Cat();// Animal s�n�f�n� implement eden bir cat
									// nesnesi

		human.setAnimal(animal); // Bu kediyi set ettik.
		human.hayvanSoyle();// kedi oldu�u i�in miyavv. ve kediyim.
							// diyecektir.Esnek bir yap� sa�lad�k.yEN� B�R
							// HAYVAN EKLEMEDE SORUN YA�AMAYIZ
		// Bir insana yeni hayvan vermede sorun ya�amay�z.

	}
}
