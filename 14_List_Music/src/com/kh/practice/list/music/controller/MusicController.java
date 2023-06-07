package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<Music>();
	//다형성 생성 > 다운캐스팅 가능
	public MusicController() {//리스트에 초기 10곡 미리 입력해두기
		list.add(new Music("aa", "aaa"));
		list.add(new Music("bb", "bbb"));
		list.add(new Music("cc", "ccc"));
		list.add(new Music("dd", "ddd"));
		list.add(new Music("aa", "eee"));
		list.add(new Music("bb", "fff"));
		list.add(new Music("cc", "aaa"));
		list.add(new Music("dd", "bbb"));
		list.add(new Music("ee", "ccc"));
		list.add(new Music("ff", "ddd"));
	}
	public int addList(Music music) {
		//****** 마지막 위치에 곡 추가 ******
		int result = 0;	// 0 : 추가 실패, 1 : 추가 성공
		if(list.add(music)) {	//추가
			result = 1;	//boolean list.add(music) 참이면 1
		}
		return result;
	}
	public int addAtZero(Music music) {
		//****** 첫 위치에 곡 추가 ******
		int result = 0; // 0 : 추가 실패, 1 이상: 추가 성공
		int cnt = list.size();	//add가 void 이기 떄문에 boolean으로 확인 불가능
		//리스트 크기를 비교하기 위한 변수 추가.
		((ArrayList<Music>)list).add(0, music); //다운캐스팅
		int cntAfter = list.size();
		if(cnt<cntAfter) {	
			result = cntAfter-cnt;
		}
		return result;
	}
	public List<Music> printAll(){
		//TODO
		return list;
	}
	public Music searchMusic(String title) {
		Music result = null;
		for(Music vo:list) {//list에서 하나 뽑으면 Music형식의 vo가 나올거다.
//			if(vo.equals(title))	//Music 하고 Stirng title 자료형이 안맞아서 비교가 안됨.
			if(vo.getTitle().equals(title)) {	//주소값이 같은가?
				result = vo;	//한곡만 찾아서 한곡만 알려준다.
				break;
			}
		}
		return result;
	}
	public Music removeMusic(String title) {
		//TODO
		return null;
	}
	public Music setMusic(String title, Music music) {
		//TODO
		return null;
	}
	public int ascTitle() {
		int result = 0;
		//TODO
		return result;
	}
	public int descSinger() {
		int result = 0;
		//TODO
		return result;
	}
	
}
