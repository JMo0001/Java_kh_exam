package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class Asctitle implements Comparator<Music>{
	public int compare(Music o1, Music o2) {
		int result = 0;
		result = o1.getTitle().compareTo(o2.getTitle());
		
		return result;
	}

}
