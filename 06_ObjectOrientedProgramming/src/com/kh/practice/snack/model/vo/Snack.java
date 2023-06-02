package com.kh.practice.snack.model.vo;

public class Snack {

	private String kind;		//종류
	private String name;		//이름
	private String flavor;		//맛
	private String numOf;		//개수
	private String price;		//가격
	
	public Snack() {
		
	}
	public Snack(String kind, String name, String flavor, String numOf, String price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	public String information() {
		return null;
		//TODO
	}
		
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public String getNumOf() {
		return numOf;
	}
	public void setNumOf(String numOf) {
		this.numOf = numOf;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}

