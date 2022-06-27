package com.prowings;

public class Interior {
	private int seats;
	private int airbags;
	private String roof;
	public Interior() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Interior(int seats, int airbags, String roof) {
		super();
		this.seats = seats;
		this.airbags = airbags;
		this.roof = roof;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getAirbags() {
		return airbags;
	}
	public void setAirbags(int airbags) {
		this.airbags = airbags;
	}
	public String getRoof() {
		return roof;
	}
	public void setRoof(String roof) {
		this.roof = roof;
	}
	@Override
	public String toString() {
		return "Interior [seats=" + seats + ", airbags=" + airbags + ", roof=" + roof + "]";
	}
	
	

}
