package FullAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//model üzerinde component önerilir
@Component("carId")
public class Car {
	@Value(value = "Bmw")
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
