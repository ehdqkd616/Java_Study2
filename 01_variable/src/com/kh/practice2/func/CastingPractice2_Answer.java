package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2_Answer {
	
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double kor = sc.nextDouble();
		System.out.print("���� : ");
		double eng = sc.nextDouble();
		System.out.print("���� : ");
		double math = sc.nextDouble();
		
//		double sum = kor + eng + math;
//		double avg = sum / 3;
//		System.out.println("���� : " + sum);
//		System.out.println("��� : " + avg);
		int sum = (int)(kor + eng + math);
		int avg = sum / 3;
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
	}
	
	
}
