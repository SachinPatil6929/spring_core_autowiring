package com.prowings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	private String colour;
	private int maxSpeed;
	@Autowired
	
	private Engine engine;
	private Wheel wheel;
	private Interior interior;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public Car(@Qualifier("interior1") Interior interior) {
		super();
		this.interior = interior;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Wheel getWheel() {
		return wheel;
	}
	@Autowired
	@Qualifier("wheel1")
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	public Interior getInterior() {
		return interior;
	}
	public void setInterior(Interior interior) {
		this.interior = interior;
	}
	@Override
	public String toString() {
		return "Car [colour=" + colour + ", maxSpeed=" + maxSpeed + ", engine=" + engine + ", wheel=" + wheel
				+ ", interior=" + interior + "]";
	}
	
	
	
	

}
