package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void practiceMethod() {
		
	// 키보드로 가로, 세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
	
		Scanner sc = new Scanner(System.in);
		
		double horizontal;
		double vertical;
		
		System.out.println("가로 : ");
		horizontal = sc.nextDouble();
		
		System.out.println("새로 : ");
		vertical = sc.nextDouble();
		
		double area = horizontal*vertical;
		double circum = 2*(horizontal+vertical);
		
		System.out.printf("면적 : %.2f\n", area);
		System.out.printf("둘레 : %.2f\n", circum);
	}
	
}
