package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book{
	
	private boolean coupon;	// 요리학원 쿠폰 유무
	
	public CookBook() {}
	public CookBook(String title, String author, String publisher, boolean coupon) {
		
	}
	@Override
	public String toString() {
		return "CookBook [coupon=" + coupon + ", toString=" + toString + "]";
	}
	
	public boolean getCoupon() {
		return coupon;
	}
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	
}
