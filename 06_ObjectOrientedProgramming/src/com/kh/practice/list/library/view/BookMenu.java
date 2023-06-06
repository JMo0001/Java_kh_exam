package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.mode.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("***** 메인 메뉴 *****");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 명 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 입력 : ");
		int num = sc.nextInt();
		switch(num) {
		case 1 : 
			insertBook();
			break;
		case 2 :
			selectList();
			break;
		case 3 : 
			searchBook();
			break;
		case 4 : 
			deleteBook();
			break;
		case 5 : 
			ascBook();
			break;
		case 9 :
			System.out.println("프로그램을 종료합니다.");
			break;
		default :
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			mainMenu();
		}
		System.out.println("");
	}
	
	public void insertBook() {
		System.out.println("=== 새 도서 추가 ===");
		System.out.println("1. 도서명 : ");
		sc.nextLine();
		String title = sc.nextLine();
		System.out.println("2. 저자명 : ");
		String author = sc.nextLine();
		System.out.println("3. 장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타)");
		int category = sc.nextInt();
		System.out.println("4. 가격 : ");
		int price = sc.nextInt();
		switch(category) {
		case 1:
			bc.insertBook(new Book(title, author, "인문", price));
			break;
		case 2:
			bc.insertBook(new Book(title, author, "과학", price));
			break;
		case 3:
			bc.insertBook(new Book(title, author, "외국어", price));
			break;
		case 4:
			bc.insertBook(new Book(title, author, "기타", price));
			break;
		}
		
		
	}
	
	public void selectList() {
	}
	
	public void searchBook() {
	}
	
	public void deleteBook() {
	}  
	
	public void ascBook() {
	}
}
