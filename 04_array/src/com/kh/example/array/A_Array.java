package com.kh.example.array;

import java.util.Scanner;

import javax.xml.soap.SAAJResult;

public class A_Array {
	
	public void method1() {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		int num6 = 60;
		int num7 = 70;
		int num8 = 80;
		int num9 = 90;
		
		int[] arr = new int[9]; // 배열 할당
		// 인덱스 이용
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		arr[7] = 80;
		arr[8] = 90;
//		arr[9] = 100;
		// java.lang.ArrayIndexOutOfBoundsException : 9
		
		// for문 이용
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10 * (i+1);
		}

		System.out.println(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 선언과 동시에 초기화
		int arr2[] = {1, 2, 3, 4, 5};
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void method2() {
		int[] iArr = new int[5];
		char[] cArr = new char[10];
		
		System.out.println("iArr : " + iArr);
		System.out.println("cArr : " + cArr);
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println("iArr[" + i + "] : 1" + iArr[i] + "1");
		}
		
		for(int i = 0; i < cArr.length; i++) {
			System.out.println("cArr[" + i + "] : 1" + cArr[i] + "1");
		}
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기 : ");
		int size = sc.nextInt();
		
		double[] dArr = new double[size];
		System.out.println(dArr);
//		for(int i = 0; i < dArr.length; i++) {
//			System.out.println("dArr[" + i + "] : 1" + dArr[i]);
//		}
		System.out.println("dArr.length : " + dArr.length);
		
		System.out.println("dArr의 크기를 30으로 변경");
		dArr = new double[30];
		System.out.println("dARr.length : " + dArr.length);
		
	}	
}
