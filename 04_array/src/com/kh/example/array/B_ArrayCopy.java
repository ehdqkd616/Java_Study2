package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// 얕은 복사 : 배열의 주소만 복사
	// 깊은 복사 : 동일한 새로운 배열을 하나 생성하여 실제 내부 값 복사	
	
	public void method1() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = originArr;
		
		System.out.println(originArr);
		System.out.println(copyArr);
		
		System.out.println("originArr : ");
		for(int i = 0; i < originArr.length; i++) {
			System.out.println(originArr[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("copyArr : ");
		for(int i = 0; i < copyArr.length; i++) {
			System.out.println(copyArr[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("originArr[0]의 값을 99로 변경");	
		originArr[0] = 99;
		
		System.out.print("originArr : ");
		for(int i = 0; i < originArr.length; i++) {
			System.out.println(originArr[i] + " ");	
		}
		
		System.out.println();
		
		System.out.print("copyArr : ");
		for(int i = 0; i < copyArr.length; i++) {
			System.out.println(copyArr[i] + " ");
		}
	}
	
	public void method2() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		System.out.println("originArr : " + originArr);
		System.out.println("copyArr : " + copyArr);
		
		// 깊은 복사
		// 1. for문을 이용한 복사
		for(int i = 0; i < originArr.length; i++) {
			copyArr[i] = originArr[i];
		}
		
		System.out.println("originArr : ");
		for(int i = 0; i < originArr.length; i++) {
			System.out.println(originArr[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("copyArr : ");
		for(int i = 0; i < copyArr.length; i++) {
			System.out.println(copyArr[i] + " ");
			
		}
		
		System.out.println();
		
		System.out.println("originArr[0]의 값을 99로 변경");	
		originArr[0] = 99;
		
		System.out.print("originArr : ");
		for(int i = 0; i < originArr.length; i++) {
			System.out.println(originArr[i] + " ");	
		}
		
		System.out.println();
		
		System.out.print("copyArr : ");
		for(int i = 0; i < copyArr.length; i++) {
			System.out.println(copyArr[i] + " ");	
		}
	}
	
	public void method3() {
		// 깊은 복사
		// 2. System클래스있에 는 arraycopy()메소드를 이용한 복사
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		//										복사 배열
		//										복사 위치
		// system.arraycop(src, srcPos, dest, destPos, length);
		//				원본 배열	원본 배열					복사 길이
		//						복사 위치
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
				
		System.out.print("originArr : ");
		for(int i = 0; i < originArr.length; i++) {
			System.out.println(originArr[i] + " ");	
		}
		
		System.out.println();
		
		System.out.print("copyArr : ");
		for(int i = 0; i < copyArr.length; i++) {
			System.out.println(copyArr[i] + " ");	
		}
		
	}
	
	
	
	public void method4() {
		// 깊은 복사
		// 3. Arrays클래스에 있는 copyOf()메소드를 이용한 복사
		
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		// Arrays.copyOf(original, newLength)
		copyArr = Arrays.copyOf(originArr, originArr.length);
		
		System.out.println("originArr : ");
		for(int i = 0; i < originArr.length; i++) {
			System.out.println(originArr[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("copyArr : ");
		System.out.println("originArr : ");
		for(int i = 0; i < copyArr.length; i++) {
			System.out.println(copyArr[i] + " ");
		}
	}
}
