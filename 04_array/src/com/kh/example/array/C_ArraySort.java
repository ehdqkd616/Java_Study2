package com.kh.example.array;

import java.util.Arrays;

public class C_ArraySort {
	public void method() {
		// �迭 ����
		int[] iArr = {2, 5, 4, 6, 1, 3};
		for(int i=0; i<iArr.length; i++)
			System.out.println(iArr[i] + " ");
	
	}
	
	public void method2() {
		String[] strArr = {"���", "����", "���ξ���", "�ٳ���", "������"};
		
		System.out.println("���� ��");
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i] + " ");
		}
		
		System.out.println();
		
		Arrays.sort(strArr);
		
		System.out.println("���� ��");
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i] + " ");
		}
	}
	
}
