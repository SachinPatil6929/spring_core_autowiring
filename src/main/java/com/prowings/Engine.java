package com.prowings;

public class Engine {
	
	private int no_of_cylinders;
	private int rpm;
	private String type;
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine(int no_of_cylinders, int rpm, String type) {
		super();
		this.no_of_cylinders = no_of_cylinders;
		this.rpm = rpm;
		this.type = type;
	}
	public int getNo_of_cylinders() {
		return no_of_cylinders;
	}
	public void setNo_of_cylinders(int no_of_cylinders) {
		this.no_of_cylinders = no_of_cylinders;
	}
	public int getRpm() {
		return rpm;
	}
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [no_of_cylinders=" + no_of_cylinders + ", rpm=" + rpm + ", type=" + type + "]";
	}
	
	

}
