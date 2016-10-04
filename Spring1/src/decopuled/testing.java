package decopuled;

public class testing {
	public static void main(String[] args) {

		Human human = new Person1();// human interfacesini implement eden bir
									// Person1 nesnesi (codetoýnterface)
		Animal animal = new Cat();// Animal sýnýfýný implement eden bir cat
									// nesnesi

		human.setAnimal(animal); // Bu kediyi set ettik.
		human.hayvanSoyle();// kedi olduðu için miyavv. ve kediyim.
							// diyecektir.Esnek bir yapý saðladýk.yENÝ BÝR
							// HAYVAN EKLEMEDE SORUN YAÞAMAYIZ
		// Bir insana yeni hayvan vermede sorun yaþamayýz.

	}
}
