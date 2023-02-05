package com.rohit.builder.designpattern;

public class CarBuildMain {
	
	public static void main(String[] args) {
		
		Car car = CarBuilder.builder().vehicleNumber("12").color("yellow").model("Maruti")
				.build();
		System.out.println(car);
	
	}

}
