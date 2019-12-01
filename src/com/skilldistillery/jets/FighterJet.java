package com.skilldistillery.jets;

public class FighterJet extends Jets {

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void fight() {
		System.out.println("Im a Fighter Jet ");
	}
}
