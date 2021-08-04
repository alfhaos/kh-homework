package com.oop.device;

public class DeviceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device[] arr = new Device[10];
		arr[0] = new TV("삼성", "평면TV", 3_000_000, 10);
		arr[1] = new TV("LG", "울트라평면TV", 2_500_000, 20);
		arr[2] = new Laptop("LG", "그램17", 2_000_000, 512);
		arr[3] = new Laptop("apple", "맥북16", 3_000_000, 1024);
	
		for(int i = 0 ; i < arr.length ; i++) {
			Device dv = arr[i];
			if(dv instanceof TV) {
				((TV)dv).channelUp();
			}
			else if(dv instanceof Laptop) {
				System.out.println(((Laptop)dv).getName() +" 용량 : "+((Laptop)dv).getCapacity());
			}
			System.out.println(dv.toString());
			if(i == 3)
				break;
		}
	
	}

}
