package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	// && : �׸���, ~�ϸ鼭(~�鼭)
	// || : �Ǵ�, ~�̰ų�(~�ų�)
	
	public void method1() {
		// �Է��� ���� ���� 1 ~ 100 ������ �������� Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		// 1 ~ 100 ������ ����
		// ���ڰ� 1���� ũ�ų� ���� 100���� �۰ų� ����
		boolean result = (num >= 1 && num <= 100);
		System.out.println("1���� 100������ �����Դϱ�? " + result);
			
	}
	
	public void method2() {
		// �Է��� ���� ���� �빮������ Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ϳ� �Է� : ");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		
		// �Է��� ���� ���� �빮�ڴ�
		// ch�� A���� Z ���̿� �ִ�
		// ch�� A���� ũ�ų� ���� ch�� Z���� �۰ų� ����
		boolean result = (ch >= 'A' && ch <= 'Z');
		System.out.println("���� �빮�ڰ� �½��ϱ�? " + result);
				
		System.out.println("��� �Ͻ÷��� y Ȥ�� Y�� �Է��ϼ��� : ");
		// y Ȥ�� Y���� Ȯ��
		str = sc.nextLine();
		ch = str.charAt(0);
		
		boolean result2 = (ch == 'y' || ch == 'Y');
		System.out.println("��� �ϰڴٰ� �ϼ̽��ϱ�? " + result2);
		
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
