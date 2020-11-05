package com.kh.variable;

import java.util.Scanner;

public class F_KeyboardInput {
	
	public void inputScanner1() {
		// 이름, 나이, 키(소수점)를 받아와 출력함
		Scanner sc = new Scanner(System.in);
		
		
		String name = "김연우";
		int age = 24;
		double height = 172.1;
		
		System.out.println(name + "님은" + age + "세이며, 키는" + height + "cm입니다.");
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.next();
		
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		System.out.println("키를 입력하세요 : ");
		height = sc.nextDouble();
				
		System.out.println(name + "님은 " + age + "세이며, 키는" + height + "cm입니다.");
		
		sc.close();
		
	}
	
	public void inputScanner2() {
	
		Scanner sc = new Scanner(System.in);
		
//		String name;
//		int age = 0;
//		String address;
//		
//		System.out.println("이름을 입력하세요 : ");
//		name = sc.next();
//		
//		System.out.println("나이를 입력하세요 : ");
//		age = sc.nextInt();
//		
//		System.out.println("주소를 입력하세요 : ");
//		address = sc.next(); // 강남구 역삼동이라고 하면 강남구만 나옴(띄어쓰기로 구분짓기 때문에)
//		address = sc.nextLine();
		
		
		/** 
		next()
			띄어쓰기 불가(띄어쓰기를 구분자로 받음)
		nextLine()
			띄어쓰기 가능(띄어쓰기까지 모두 문자열로 받아서 가지고 옴)		
		*/
		
		// 주소를 받을 때 nextLine() 살리기
		// 살리기 1. nextLine() 추가
//		String name;
//		int age = 0;
//		String address;
//		
//		System.out.println("이름을 입력하세요 : ");
//		name = sc.next();
//		
//		System.out.println("나이를 입력하세요 : ");
//		age = sc.nextInt();
//		
//		sc.nextLine();
//		
//		System.out.println("주소를 입력하세요 : ");
//		address = sc.nextLine();
		
		// 살리기 2. age를 받을 때 엔터가 남지 않도록 nextLine()을 쓴 후 파싱하기
		// 파싱(parsing) : 문자열(String)로 받아온 것을 다른 형으로 바꿔주는 것
//		String name;
//		String stringAge;
//		int age;
//		String address;
//		
//		System.out.println("이름을 입력하세요 : ");
//		name = sc.next();
//		
//		System.out.println("나이를 입력하세요 : ");
//		stringAge = sc.nextLine();
//		age = Integer.parseInt(stringAge);
//		
//		System.out.println("주소를 입력하세요 : ");
//		address = sc.nextLine();
		
//		String name;
//		int age = 0;
//		String address;
//		
//		System.out.println("이름을 입력하세요 : ");
//		name = sc.nextLine();
//		
//		System.out.println("나이를 입력하세요 : ");
//		try { 
//			age = Integer.parseInt(sc.nextLine());
//		} catch(NumberFormatException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("주소를 입력하세요 : ");
//		address = sc.nextLine();
		
		
		
//		System.out.println(name + "님은 " + age + "세이며, 사는 곳은 " + address + "입니다.");
		
		
		String name;
		String stringAge;
		int age;
		String address;
		char gender;
		String stringGender;
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.next();
		
		System.out.println("나이를 입력하세요 : ");
		stringAge = sc.nextLine();
		age = Integer.parseInt(stringAge);
		
		System.out.println("주소를 입력하세요 : ");
		address = sc.nextLine();
		
		System.out.println("성별을 입력하세요 : ");
//		gender = sc.nextLine().charAt(0);
		stringGender = sc.nextLine();
		gender = stringGender.charAt(0);
		
		System.out.println(name + "님은 " + age + "세이며, 성별은  " + gender + "입니다.");
		
		sc.close();
		
	}
}
