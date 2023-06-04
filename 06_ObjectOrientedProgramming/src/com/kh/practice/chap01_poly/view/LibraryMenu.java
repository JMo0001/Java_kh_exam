package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		System.out.println("성별(F/M)을 입력하세요.");
		char gender = sc.nextLine().charAt(0);
		
		
		System.out.println();
		System.out.println("==== 메뉴 ====");
		System.out.println("1. 마이페이지");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 대여하기");
		System.out.println("9. 프로그램 종료하기");
		System.out.print("메뉴 번호 : ");
		
	}
	public void selectAll() {}
	public void searchBook() {}
	public void rentBook() {}
}
