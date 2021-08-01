package com.oop.person.model;

public class Person {

	private String name;
	private int age;
	private int height;
	private int weight;
	private int money;
	
	public Person(String name, int age, int height, int weight, int money) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.money = money;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Person() {
		
	}
	
	public String information() {
		return name + "\t" + age + "\t" + height + "kg\t" + weight + "cm\t" + money+"원";
		
	}
	
}
