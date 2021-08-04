package com.oop.device;

public class TV extends Device{
	
	private int channel;

	public TV() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TV(String brand, String name, int price,int channel) {
		super(brand, name, price);
		this.channel = channel;
		
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void channelUp() {
		System.out.println("채널 업");
	}
	public void channelDown() {
		
	}
	@Override
	public String toString() {
		return "brand=" + super.getBrand() + ", name=" + super.getName() + ", price=" + super.getPrice() + ", channel = "+channel;
	}
	
	

}
