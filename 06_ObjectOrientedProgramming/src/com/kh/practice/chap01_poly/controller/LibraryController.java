package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem = null;
	private Book[] bList = new Book[5] ;
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
		
	public Book[] selectAll() {
		return bList;
	}

	public Book[] searchBook(String keyword) {
		return book[];
		
	}
	
	public int rentBook(int index) {
		return index;
	}
}
