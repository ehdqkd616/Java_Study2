package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	// 객체 배열 == 객체(레퍼런스 변수)에 대한 배열
	
	public void method1() {
		Person[] pArr = new Person[5];
		// Person객체가 들어갈 수 있는 5개의 공간 생성
		
		pArr[0] = new Person("김연우", 24, 'M', 180.1, 65.6);
		pArr[1] = new Person("김바보", 24, 'W', 185.2, 50.7);
		pArr[2] = new Person("김똥개", 24, 'M', 175.3, 70.8);
		pArr[3] = new Person("김루디", 24, 'M', 170.4, 75.9);
		pArr[4] = new Person("김연아", 24, 'W', 160.5, 45.1);
		
		System.out.println("pArr : " + pArr);
		
		System.out.println();
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i]);
		}
		
		// 인덱스 별로 객체를 생성해서 대입해야 함
		
		System.out.println();
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i].personInfo());
		}
		
		System.out.println();
		
	}
	
	public void method2() {
		Person[] pArr = {
				new Person("신유섭", 27, 'W', 173.1, 60.4),
				new Person("신섭섭", 7, 'W', 50.2, 6.5),
				new Person("신짱구", 17, 'W', 170.3, 65.6)};
		
		System.out.println("pArr : " + pArr);
		
		System.out.println();
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i]);
		}
		
		// 인덱스 별로 객체를 생성해서 대입해야 함
		
		System.out.println();
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i].personInfo());
		}
		
		System.out.println();
		
	}	
	
}
