package com.kh.example.chap02_control.run;

import com.kh.example.chap02_control.controller.InterruptController;
import com.kh.example.chap02_control.thread.Thread4;
import com.kh.example.chap02_control.thread.Thread5;

public class Run {

	public static void main(String[] args) {
		
//		Thread4 thread4 = new Thread4();
//		Thread thread = new Thread(thread4);
		
//		thread.start();
		
		InterruptController ic = new InterruptController();
		ic.sleepInterrupt();
		
	
	}

}
