package com.kh.variable;

public class E_PrintMethod {
	
	public void printlnMethod() {
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";		
		System.out.println(str1);
		System.out.println(str2);
	}
	
	public void printMethod() {
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";		
		System.out.print(str1);
		System.out.print(str2);
		
		System.out.printf("%s, 김연우입니다. %s.", str1, str2);
		
		System.out.println();
//		System.out.print();
//		System.out.printf();
		
		// 미니 문제
		// 안녕하세요, 저는 20살 김연우 학생입니다. 만나서 반갑습니다.
		int age = 20;
		String name = "김연우";
		String job = "학생";
		System.out.printf("%s, 저는 %d살 %s %s입니다. 만나서 %s.\n", str1, age, job, name, str2);
	}
	
	
	
}
