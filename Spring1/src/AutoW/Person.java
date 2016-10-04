package AutoW;

public class Person {
	private String name;
	private Phone phonePerson;

	public Phone getPhonePerson() {
		return phonePerson;
	}

	public void setPhonePerson(Phone phonePerson) {
		this.phonePerson = phonePerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phonePerson=" + phonePerson + "]";
	}
}
