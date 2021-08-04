package com.oop.device;

public class Laptop extends Device {
	
	private int capacity;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(String brand, String name, int price,int capacity) {
		super(brand, name, price);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "brand=" + super.getBrand() + ", name=" + super.getName() + ", price=" + super.getPrice() + ", capacity = "+capacity;
	}
	

}
