package com.rohit.builder.designpattern;

import java.util.Vector;

//Class Car : vehicleNumber, model, brand, noOfSeats, color
//Create a builder class for Car
//
//CarBuilder.builder().vehicleNumber("1234").color("red").build();
public class Car {
	
	private String vehicleNumber;
	private String model;
	private String brand;
	private String noOfSeats;
	private String color;
	
	
	public Car(CarBuilder carBuilder) {
		this.vehicleNumber = carBuilder.vehicleNumber;
		this.color = carBuilder.color;
		this.brand = carBuilder.brand;
		this.noOfSeats = carBuilder.noOfSeats;
		this.model = carBuilder.model;
	}
	
//
//	public void setVehicleNumber(String vehicleNumber) {
//		this.vehicleNumber = vehicleNumber;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}
//
//	public void setNoOfSeats(String noOfSeats) {
//		this.noOfSeats = noOfSeats;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}


	@Override
	public String toString() {
		return "Car [vehicleNumber=" + vehicleNumber + ", model=" + model + ", brand=" + brand + ", noOfSeats="
				+ noOfSeats + ", color=" + color + "]";
	}

}
