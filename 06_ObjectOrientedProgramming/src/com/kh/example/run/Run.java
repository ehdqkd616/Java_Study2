package com.kh.example.run;

import com.kh.example.chap06_method.controller.NonStaticMethod;
import com.kh.example.chap06_method.model.vo.Trainee;

public class Run {
	public static void main(String[] args) {
		
		NonStaticMethod nsm = new NonStaticMethod();
		
		
		Trainee t = new Trainee("김연우", 'G', "09:00 - 15:30", 100.0);
		
		t.changeName("김바보");
		System.out.println(t.printName());
		t.info();
		
		Trainee t2 = nsm.method6(); // 얕은 복사
		System.out.println("Run t : " + t);
		String name = t2.printName();
		System.out.println(name);
		
		
	}
	
	
	
}
