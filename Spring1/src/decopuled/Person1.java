package decopuled;

public class Person1 implements Human {

	private Animal animal;


	@Override
	public void setAnimal(Animal animal) {
		this.animal = animal;
		
		
	}
	@Override
	public void hayvanSoyle() {
		animal.sesVer();
		animal.isimVer();
		
	}

}
