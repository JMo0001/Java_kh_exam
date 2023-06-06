package com.kh.practice.list.library.mode.vo;

public class Book {
	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {}
	public Book(String title, String author, String category, int price) {
		this.title=title;
		this.author=author;
		this.category=category;
		this.price=price;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getCategory() {
		return category;
	}
	public int getPrice() {
		return price;
	}
	public void setTile(String title) {
		this.title=title;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", category=" + category + ", price=" + price + "]";
	}
	public int hashCode() {
		return 0;
	}
	public Boolean equals() {
		return null;
	}
	public int compareTo() {
		return 0;
		
	}

}
