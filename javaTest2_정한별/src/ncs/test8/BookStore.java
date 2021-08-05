package ncs.test8;

import ncs.test7.Book;

public class BookStore {

	public static void main(String[] args) {
		Book bookdata; 
		BookUpdater bookupdater;  
		
		
		bookdata = new Book("IT","HTML5",30000,15.0);
		bookupdater = new BookUpdater(bookdata);
		System.out.println("기본정보");
		System.out.println(bookdata.getBookName()+ " \t" + bookdata.getBookPrice());
		
		bookupdater.updateBookPrice();
		System.out.println("변경된 정보");
		System.out.println(bookdata.getBookName()+ " \t" + bookdata.getBookPrice());
		
		
	}

}
