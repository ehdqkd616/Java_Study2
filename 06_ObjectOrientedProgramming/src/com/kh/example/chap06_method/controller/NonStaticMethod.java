package com.kh.example.chap06_method.controller;

import com.kh.example.chap06_method.model.vo.Trainee;

public class NonStaticMethod {
	
	
	
	
	public Trainee method6() {
		Trainee t = new Trainee("김연우", 'G', "오전", 90.0);
		System.out.println("NonStaticMethod t : " + t);
		
		return t;
	}
	
	
}
