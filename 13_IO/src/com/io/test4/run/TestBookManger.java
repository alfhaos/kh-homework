package com.io.test4.run;

import com.io.test4.controller.BookManager;

public class TestBookManger {

	public static void main(String[] args) {
		BookManager manager = new BookManager();
		manager.fileSave();
		manager.fileRead();

	}

}
