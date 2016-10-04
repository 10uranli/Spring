package AutoWithAnnotation;

public class Phone {
	private String phoneModel;

	public String getPhoneModel() {
		return phoneModel;
	}

	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}

	@Override
	public String toString() {
		return "Phone [phoneModel=" + phoneModel + "]";
	}

}
