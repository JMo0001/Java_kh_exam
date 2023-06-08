package com.kh.practice.list.music.controller;

import java.awt.image.DataBufferDouble;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.Asctitle;
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
		return list;
	}
	public Music searchMusic(String title) {
		Music result = null;
		for(Music vo:list) {//list에서 하나 뽑으면 Music형식의 vo가 나올거다.
//			if(vo.equals(title))	//Music 하고 Stirng title 자료형이 안맞아서 비교가 안됨.
			if(vo.getTitle().equals(title)) {	//주소값이 같은가?
				result = vo;	//찾은 Music 객체 vo를 return.
				break;
			}
		}
		return result;
	}
	public Music removeMusic(String title) {
		Music result = null;
		for(Music vo:list) {
			if(vo.getTitle().equals(title)) {
				list.remove(vo);//list에서 객체 vo를 제거.
				result=vo;//찾은 Music 객체 vo를 return.
				break;
			}
		}
		return result;
	}
	public Music setMusic(String title, Music music) {
		Music result = null;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				result = list.get(i);
				list.set(i, music);
				break;
			}
		}
//		for(Music vo:list) {
//			if(vo.getTitle().equals(title)) {
//				list.remove(vo);//list에서 객체 vo를 제거.
//				result=vo;//찾은 Music 객체 vo를 return.
//				vo = music;	//Music vo, Music music 자료형이 같다.
//				// vo = music; //vo는 for문의 새로운 지역변수로 list와는 무관하다
//			int findIdx = list.indexOf(vo);//indexof > (F2) > 리턴값은 int
//			list.set(findIdx, music);//music을 찾아낸 위치에다가 vo를 넣어달라.
//				break;
//			}
//		}
		return result;
	}
	public int ascTitle() {
		list.get(0).getTitle();//리스트에서 0번째 인덱스의 title?
		int result = 0;
		try {
			for(int i=0; i<list.size()-1; i++) {
				for(int j=0; j<list.size()-1-i; j++) {
					if(list.get(j).getTitle().compareTo(list.get(j+1).getTitle())>0) {	//오름차순
					//음수가 나오면 바꿀 필요가 없다.
						//if(nameArr[j].compareTo(nameArr[j+1])<0) {	//내림차순
						Music tmp = list.get(j);	//nameArr >> 자료형 String
						list.set(j, list.get(j+1));
						list.set(j+1, tmp);
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	public int descSinger() {
		// list 에서 singer를 가지고? > list에 singer는 없다.
		// list의 1개 객체에 singer가 있다.
		list.get(0).getSinger();//리스트에서 0번째 인덱스의 singer가 누구?
		int result = 0;
		try {
			for(int i=0; i<list.size()-1; i++) {
				for(int j=0; j<list.size()-1-i; j++) {
					if(list.get(j).getSinger().compareTo(list.get(j+1).getSinger())<0) {	
						//if(nameArr[j].compareTo(nameArr[j+1])<0) {	//내림차순
						//정렬기준은 list의 Music 형태의 객제 중 singer 값으로 비교함.
						// SWAP	// list에 있는 Music형태의 객체를 swap
						Music tmp = list.get(j);	//nameArr >> 자료형 String
						list.set(j, list.get(j+1));
						list.set(j+1, tmp);
					}
				}
			}
			result = 1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int ascTitle2() {
		int result = 1;
//		ArrayList arrlist = new ArrayList<Music>();
//		arrlist.add(new Music("a", "vb"));
//		list.removeAll(arrlist);
		//void java util.connlection
		try {
		Collections.sort(list, new Asctitle());
		}catch(Exception e){
			e.printStackTrace();
			result = 0;
		}
		return result;
	}
	public int descSinger2() {
		int result = 1;
		try {
			Collections.sort(list);
			}catch(Exception e){
				e.printStackTrace();
				result = 0;
			}
		Collections.sort(list);
		return result;
	}
	
	public int saveFile(String filePath) {
		int result = 0; // 0:저장실패, 1:저장성공
		 
		//filaPath에 list의 Music 객체들을 저장함.
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(filePath);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(oos);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fos!=null)fos.close();
				if(bos!=null)bos.close();
				if(oos!=null)oos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}
	
}
