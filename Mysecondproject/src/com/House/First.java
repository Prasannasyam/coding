package com.House;

public class First extends House {
	
	public static void main(String arg[]) {
		
		House house = new First();
		
		System.out.println(house.getNoofrooms());
		System.out.println(house.getColor());
		System.out.println(house.areaofhouse(10,10));
		
	}

}
