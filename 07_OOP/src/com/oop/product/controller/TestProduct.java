package com.oop.product.controller;

import com.oop.product.model.Product;

public class TestProduct {

	public static void main(String[] args) {
		int price;
		
		Product p1 = new Product("ssgnote6","갤럭시노트6","경기도수원",960000,10.0);
		Product p2 = new Product("lgxnote5","LG스마트폰5","경기도평택",780000,0.7);
		Product p3 = new Product("ktnorm3","KT일반폰3","서울시강남",25000,0.3);
		
		p1.information();
		p2.information();
		p3.information();
		
		p1.setPrice(1_200_000);
		p2.setPrice(1_200_000);
		p3.setPrice(1_200_000);
		
		p1.setTex(0.05);
		p2.setTex(0.05);
		p3.setTex(0.05);
		
		System.out.println("-------------가격 및 부가세 수정 -------------");
		p1.information();
		p2.information();
		p3.information();
		
		System.out.println("-------------실제가격 출력 -------------");
		price = (int) (p1.getPrice() + (p1.getPrice() * p1.getTex()));
		System.out.println("상품명 : " + p1.getProductName());
		System.out.println("부가세 포함 가격 : " + price + " 원");
		
		System.out.println("상품명 : " + p2.getProductName());
		System.out.println("부가세 포함 가격 : " + price + " 원");
		
		System.out.println("상품명 : " + p3.getProductName());
		System.out.println("부가세 포함 가격 : " + price + " 원");
		
		
	}

}
