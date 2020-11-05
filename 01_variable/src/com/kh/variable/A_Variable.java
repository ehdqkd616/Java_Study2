package com.kh.variable;

public class A_Variable {

	public static void main(String[] args) {
		// 변수 선언 후 초기화
		// A. qustn tjsdjsd
		// 1. 논리형
		boolean isTrue;
		// 2. 문자형
		// 2-1. 문자
		char ch;
		// 2-2. 문자열
		String str;
		// 3. 숫자형
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		
		float fNum;
		double dNum;
		
		
		// B. 초기화
		isTrue = true;
		
		ch = 'A';
		str = "ABC";
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
		fNum = 4.0f;
		dNum = 8.0;
		
		System.out.println("isTrue의 값 : " + isTrue);
		
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		
		System.out.println();
		//변수 선언과 동시에 초기화
		boolean isTrue2 = true;;
		
		char ch2 = 'A';
		String str2 = "ABC";
		
		byte bNum2 = 1;
		short sNum2 = 2;
		int iNum2 = 4;
		long lNum2 = 8L;
		
		float fNum2 = 4.0f;
		double dNum2 = 8.0d;
		
		System.out.println("isTrue2의 값 : " + isTrue);
		
		System.out.println("ch2의 값 : " + ch2);
		System.out.println("str2의 값 : " + str2);
		
		System.out.println("bNum2의 값 : " + bNum2);
		System.out.println("sNum2의 값 : " + sNum2);
		System.out.println("iNum2의 값 : " + iNum2);
		System.out.println("lNum2의 값 : " + lNum2);
		
		System.out.println("fNum2의 값 : " + fNum2);
		System.out.println("dNum2의 값 : " + dNum2);
		
	}

}
