package com.kh.practice.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a =10;
		int b =20;
		//SWAP
		//a 방에 b 값으로 바꾸고, b방에 a값으로 바꾸기
		
//		int c = 0;	//int temp = a;
//		c = a;		//a=b;
//		a = b;		//b=temp;
//		b = c;
		
		
		System.out.println(a);	//20
		System.out.println(b); 	//10
		
		
		// 버블 정렬
		int [] arr = new int[] {3,2,5,1,6,8};
		System.out.print(Arrays.toString(arr));
		//배열 ==> List
//		System.out.println(Arrays.asList(arr));
		for(int ar : arr) {
			System.out.print(ar);
		}
		System.out.println();
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {	//오름차순
					//if(arr[j]<arr[j+1]){ //내림차순
					//SWAP
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}System.out.print("[");
		for(int ar : arr) {
			System.out.print(ar);
			System.out.print(",");
		}System.out.print("]");
		System.out.println();
		
		String[] nameArr = new String[] {"손범규", "전영준", "유정하", "김민성"};
		System.out.print("[");
		for(String ar : nameArr) {
			System.out.print(ar);
			System.out.print(",");
		}
		/*String a ="김가";
		String b ="김나";
		int result = a.compareTo(b);	//a에서 접근하는 compareTo 메소드. >> 기준이 a
		System.out.println(result);*/
		
		System.out.print("]");
		for(int i=0; i<nameArr.length-1; i++) {
			for(int j=0; j<nameArr.length-1-i; j++) {
				if(nameArr[j].compareTo(nameArr[j+1])>0) {	//오름차순
					//음수가 나오면 바꿀 필요가 없다.
				//if(nameArr[j].compareTo(nameArr[j+1])<0) {	//내림차순
				String tmp = nameArr[j];	//nameArr >> 자료형 String
				nameArr[j] = nameArr[j+1];
				nameArr[j+1] = tmp;
				}
			}
		}System.out.println();
		System.out.print("[");
		for(String ar:nameArr) {
			System.out.print(ar);
			System.out.print(",");
		}System.out.println("]");
		
		
		
		System.out.println("====================");
		System.out.println("이름을 ,로 구분하여 입력해주세요.");
		}
}
