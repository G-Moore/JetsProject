package com.skilldistillery.jets;

public class FighterJet extends Jets {

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void fight() {
		System.out.println(this.getModel()+ " is Fighting to the bitter end by the seat of the pilots pants.");
	}

	@Override
	public String toString() {
		return "FighterJet [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() + "]";
	}
	
}
