package AutoWithAnnotation;

public class Car {
	private String carModel;

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + "]";
	}

}
