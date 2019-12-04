package com.skilldistillery.jets;

public class CargoPlane extends Jets implements CargoCarrier {

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void loadCargo() {
System.out.println(this.getModel()+ " is loading Cargo via rear bay door.");
	}

	@Override
	public String toString() {
		return "CargoPlane [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() + "]";

}
}
