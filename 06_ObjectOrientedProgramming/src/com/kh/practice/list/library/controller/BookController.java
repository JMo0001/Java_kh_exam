package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.mode.vo.Book;

public class BookController {
	private List<Book> list = new ArrayList();
	
	public BookController() {
		 list.add(new Book("자바의 정석","남궁 성","기타",20000));
		 list.add(new Book("쉽게 배우는 알고리즘","문병로","기타",15000));
		 list.add(new Book("대화의 기술", "강보람", "인문", 17500));
		 list.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	public void insertBook(Book bk) {
		list.add(bk);
	}
	
	public ArrayList selectList() {
		return null;
	}
	public ArrayList searchBook(String keyword) {
		return null;
	}
	public Book deleteBook(String title, String author) {
		return null;
	}
	public int ascBook() {
		return 0;
	}
	
}
