package com.howtodoinjava.app.controller;

public class Book {

	public String bookId;
	public String title;
	public String author;
	
	public Book() {
		
	}

	
	public Book(String bookId, String title, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
