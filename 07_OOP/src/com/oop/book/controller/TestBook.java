package com.oop.book.controller;

import com.oop.book.model.Book;

public class TestBook {

	public static void main(String[] args) {
		String title;
		int price = 0;
		String title2;
		int price2 = 0;
		 
		Book b1 = new Book();
		
		Book b2 = new Book("뇌를 자극하는 JAVA",20000,0.2,"김윤영");
		
		b1.setTitle("자바의 정석");
		b1.setPrice(35000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("윤상섭");
		
		b1.bookInformation();
		b2.bookInformation();
		
		title = b1.getTitle();
		price = b1.getPrice();
		title2 = b2.getTitle();
		price2 = b2.getPrice();
		
		price = (int) (price - (price * b1.getDiscountRate()));
		price2 = (int) (price2 - (price2 * b2.getDiscountRate()));
		
		System.out.println("도서명 : " + title);
		System.out.println("할인된 가격 : " + price);
		System.out.println("도서명 : " + title2);
		System.out.println("할인된 가격 : " + price2);
		
	}

}
