package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2_Answer {
	
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("±¹¾î : ");
		double kor = sc.nextDouble();
		System.out.print("¿µ¾î : ");
		double eng = sc.nextDouble();
		System.out.print("¼öÇÐ : ");
		double math = sc.nextDouble();
		
//		double sum = kor + eng + math;
//		double avg = sum / 3;
//		System.out.println("ÃÑÁ¡ : " + sum);
//		System.out.println("Æò±Õ : " + avg);
		int sum = (int)(kor + eng + math);
		int avg = sum / 3;
		System.out.println("ÃÑÁ¡ : " + sum);
		System.out.println("Æò±Õ : " + avg);
	}
	
	
}
