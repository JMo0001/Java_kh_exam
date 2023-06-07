package com.kh.practice.list.music.model.vo;

import java.util.Objects;

public class Music /*extends Object 모든 클래스는 오브젝트 상속*/{
	private String title;
	private String singer;
	
	public Music() {}
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	@Override
	public int hashCode() {
		//TODO
		return Objects.hash(singer, title);
	}
	@Override
	public boolean equals(Object obj) {
		/*if("aaa".equals("bbb")) {
		//  aaa랑 bbb를 비교.
		}*/
		//TODO
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}
	public int compareTo(Object o) {
		int result = 0;
		//TODO
		return result;
	}
	
	
	
	
}
