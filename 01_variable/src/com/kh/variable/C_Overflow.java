package com.kh.variable;

public class C_Overflow {
	public void overflow() {
		byte bNum = 127;
		
		bNum = (byte)(bNum + 1); // 128 ---> -128 : 오버플로우
		// Type mismatch : cannot convert from int to byte
		
		System.out.println("bNum : " + bNum);
		
		byte bNum2 = -128;
		bNum2 = (byte)(bNum2 - 1); // 언더플로우
		System.out.println("bNum2 : " + bNum2);
		
		byte bNum3 = 127;
		int iNum;
		iNum = bNum3+1;
		System.out.println("bNum3 : " + bNum3);
		System.out.println("iNum : " + iNum);
	}
	
	
}
