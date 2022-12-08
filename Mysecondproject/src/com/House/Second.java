package com.House;

public class Second extends House {
	
	public static void main(String arg[]) {
		
		House house = new Second();
		
		System.out.println(house.getNoofrooms());
		System.out.println(house.getColor());
		System.out.println(house.areaofhouse(20,20));
		
		
		
	}

}
