package com.io.test4.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.io.test4.model.vo.Book;

public class BookManager {
	Scanner sc = new Scanner(System.in);
	public static final String FILE_NAME = "books.dat";
	public BookManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void fileSave() {
		File src = new File(FILE_NAME);
		Book[] book = new Book[5];
		book[0] = new Book("헝거게임","제니퍼 로렌스",15000,new GregorianCalendar(2016,9,10));
		book[1] = new Book("캣칭파이어","캣니스",20000,new GregorianCalendar(2018,7,15));
		book[2] = new Book("모킹제이","화이트 스노우",18000,new GregorianCalendar(2020,1,23));
		book[3] = new Book("판엠의불꽃","찰리",15000,new GregorianCalendar(2021,5,6));
		book[4] = new Book("제2구역","러셀",17000,new GregorianCalendar(2021,8,11));
		
		try(ObjectOutputStream oos
				= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(src))))
		{
			for(int i = 0 ; i < book.length ; i++) {
			oos.writeObject(book[i]);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		Book[] book = new Book[10];
		File src = new File(FILE_NAME);
		
		try(ObjectInputStream ois=
				new ObjectInputStream(new BufferedInputStream(new FileInputStream(src))))
		{
			
			for(int i = 0 ; i < book.length ; i++) {
				book[i] = (Book) ois.readObject();
				System.out.println(book[i]);
			}
		
			
			
		}
		catch( EOFException e) {
			System.out.println("이상 입니다.");
		}
		catch(IOException | ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		System.out.println("books.dat 읽기 완료");
		
	}
	

}
