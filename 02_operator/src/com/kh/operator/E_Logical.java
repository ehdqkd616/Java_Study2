package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	// && : 그리고, ~하면서(~면서)
	// || : 또는, ~이거나(~거나)
	
	public void method1() {
		// 입력한 정수 값이 1 ~ 100 사이의 숫자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		// 1 ~ 100 사이의 숫자
		// 숫자가 1보다 크거나 같고 100보다 작거나 같다
		boolean result = (num >= 1 && num <= 100);
		System.out.println("1부터 100사이의 숫자입니까? " + result);
			
	}
	
	public void method2() {
		// 입력한 문자 값이 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 하나 입력 : ");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		
		// 입력한 문자 값이 대문자다
		// ch가 A부터 Z 사이에 있다
		// ch가 A보다 크거나 같고 ch가 Z보다 작거나 같다
		boolean result = (ch >= 'A' && ch <= 'Z');
		System.out.println("영어 대문자가 맞습니까? " + result);
				
		System.out.println("계속 하시려면 y 혹은 Y를 입력하세요 : ");
		// y 혹은 Y인지 확인
		str = sc.nextLine();
		ch = str.charAt(0);
		
		boolean result2 = (ch == 'y' || ch == 'Y');
		System.out.println("계속 하겠다고 하셨습니까? " + result2);
		
	}
	
	public void method3() {
		int a = 2;
		int b = 3;
		
		boolean c = a> b;
		boolean d = ++a <= b++;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		
		System.out.println();
		
		System.out.println("!c : " + !c); // !false = true
		System.out.println("c !=d : " + (c != d)); // true
		
		System.out.println();
		
		System.out.println("(a % b) == 1 : " + ((a % b) == 1)); // false
		System.out.println("(a == 3) && (b == 4) : " + ((a == 3) && (b == 4))); // true
		System.out.println("!d || (a-b) > 0 : " + (!d || (a-b) > 0)); // fasle
		// d == true
		// !d = false
		// a - b == -1 > 0 ? false
				
		System.out.println();
		
		System.out.println("!(c == d) && ((a * b == 10) || (b % 2 == 0)) : "
				+ (!(c == d) & ((a * b == 10) || (b % 2 == 0))));
		// !(c == d) -> !(false == true) --> !(false) --> ture
		// (a* b == 10) --> false
		// (b % 2 == 0) --> true
		// true && (flase || true)
		// true &&		true
		// true
		
	}
	
	
	
}
