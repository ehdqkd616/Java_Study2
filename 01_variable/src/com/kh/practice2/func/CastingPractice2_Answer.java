package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2_Answer {
	
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
//		double sum = kor + eng + math;
//		double avg = sum / 3;
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + avg);
		int sum = (int)(kor + eng + math);
		int avg = sum / 3;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
	
	
}
