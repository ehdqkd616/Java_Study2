package com.kh.example.array;

import java.util.Arrays;

public class C_ArraySort {
	public void method() {
		// 배열 정렬
		int[] iArr = {2, 5, 4, 6, 1, 3};
		for(int i=0; i<iArr.length; i++)
			System.out.println(iArr[i] + " ");
	
	}
	
	public void method2() {
		String[] strArr = {"사과", "딸기", "파인애플", "바나나", "오렌지"};
		
		System.out.println("정렬 전");
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i] + " ");
		}
		
		System.out.println();
		
		Arrays.sort(strArr);
		
		System.out.println("정렬 후");
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i] + " ");
		}
	}
	
}
