package ncs.test8;

import ncs.test7.Book;

public class BookUpdater {
	
	Book bookData;
	

	public BookUpdater() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookUpdater(Book bookData) {
		this.bookData = bookData;
	}
	
	public Book getBookData() {
		return bookData;
	}
	
	public void updateBookPrice() {
		bookData.setBookPrice( bookData.getBookPrice()-(bookData.getBookPrice() *( bookData.getBookDiscountRate()*0.01)));
	}
	
	

	
}
