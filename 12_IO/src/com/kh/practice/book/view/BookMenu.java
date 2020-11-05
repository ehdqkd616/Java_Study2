package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	private Book[] bArr;
	public BookMenu() {
		bc.makeFile();
		bArr = bc.fileRead();
	}
	public void mainMenu() {
		while(true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			switch(menuNum) {
			case 1:
				fileSave();
				break;
			case 2:
				fileRead();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
	}
	public void fileSave() {
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("출판 날짜(yyyy-mm-dd) :");
		String[] str = sc.nextLine().split("-");
		int[] time = {Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2])};
		Calendar date = Calendar.getInstance();
		date.set(time[0], time[1], time[2]);
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();
		sc.nextLine();
		Book b = new Book(title,author,price,date,discount);
//		여기 부분을 bArr[i] 이 null이면 값을 넣게 변경하기 그리고 outputStream에 true없애기
		for(int i = 0;i < bArr.length;i++) {
			if(bArr[i] == null) {
				bArr[i] = b;
				break;
			}
		}
		bc.fileSave(bArr);
	}
	public void fileRead() {
		for(int i = 0;i < bc.fileRead().length;i++) {
			if(bc.fileRead()[i] != null) {
				System.out.println(bc.fileRead()[i]);
			}
		}
	}
}
