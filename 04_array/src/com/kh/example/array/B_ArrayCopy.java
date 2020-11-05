package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// ���� ���� : �迭�� �ּҸ� ����
	// ���� ���� : ������ ���ο� �迭�� �ϳ� �����Ͽ� ���� ���� �� ����	
	
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
		
		System.out.println("originArr[0]�� ���� 99�� ����");	
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
		
		// ���� ����
		// 1. for���� �̿��� ����
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
		
		System.out.println("originArr[0]�� ���� 99�� ����");	
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
		// ���� ����
		// 2. SystemŬ�����ֿ� �� arraycopy()�޼ҵ带 �̿��� ����
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		//										���� �迭
		//										���� ��ġ
		// system.arraycop(src, srcPos, dest, destPos, length);
		//				���� �迭	���� �迭					���� ����
		//						���� ��ġ
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
		// ���� ����
		// 3. ArraysŬ������ �ִ� copyOf()�޼ҵ带 �̿��� ����
		
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
