package com.House;

public class House {
	
       public House() {
		// TODO Auto-generated constructor stub
	}
	public House(int noofrooms, String color) {
		this.noofrooms = noofrooms;
		this.color = color;
	}
	int noofrooms=4;
    String color="Red";
       
	public int getNoofrooms() {
		return noofrooms;
	}
	public void setNoofrooms(int noofrooms) {
		this.noofrooms = noofrooms;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int areaofhouse(int l,int b) {
		return l*b;
		
		
				
	}
}
