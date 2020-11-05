package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	
	public void practiceMethod() {
		
		// 술수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
		// 이 때 총점과 평균은 정수형으로 처리하세요.
		
		Scanner sc = new Scanner(System.in);
		
		double korean;
		double math;
		double english;
		int sum;
		int avg;
		
		System.out.println("국어 : ");
		korean = sc.nextDouble();
		
		System.out.println("영어 : ");
		english = sc.nextDouble();
		
		System.out.println("수학 : ");
		math = sc.nextDouble();
		
		sum = (int)(korean+math+english);
		avg = (int)(korean+math+english)/3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
	
}
