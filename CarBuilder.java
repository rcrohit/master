package com.rohit.builder.designpattern;

public class CarBuilder {

	String vehicleNumber;
	String model;
	String brand;
	String noOfSeats;
	String color;

	static CarBuilder carBuilder = new CarBuilder();

	static CarBuilder builder() {
		return carBuilder;

	}

	public CarBuilder vehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
		return this;
	}

	public CarBuilder color(String color) {
		this.color = color;
		return this;
	}
	
	public CarBuilder model(String model) {
		this.model =model;
		return this;
	}

	public Car build() {

		return new Car(carBuilder);
	}

}
