package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book{
	private int accessAge;	//제한 나이
	
	public AniBook() {}
	public AniBook(String title, String author, String publisher, int accessAge) {
		
	}
	
	@Override
	public String toString() {
		return "AniBook [accessAge=" + accessAge + "]";
	}

	public int getAccessAge() {
		return accessAge;
	}
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
}
