package com.kh.example.chap02_control.controller;

import java.util.Scanner;

import com.kh.example.chap02_control.thread.Thread5;

public class InterruptController {
	
	public void sleepInterrupt() {
		Thread5 thread5 = new Thread5();
		Thread thread = new Thread(thread5);
		thread.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ƹ� ���̳� �Է��ϼ��� : ");
		String input = sc.nextLine();
		System.out.println("�Է��� �� : " + input);
		thread.interrupt();
		
	}
	
}
