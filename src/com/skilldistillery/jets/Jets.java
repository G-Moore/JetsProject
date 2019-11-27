package com.skilldistillery.jets;

public abstract class Jets {
	private String model;
	private double speed;
	private int range;
	private long price;
	
	public Jets(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	 
}
