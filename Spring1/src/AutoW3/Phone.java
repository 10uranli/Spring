package AutoW3;

public class Phone {
	private String phoneName;

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	@Override
	public String toString() {
		return "Phone [phoneName=" + phoneName + "]";
	}

}