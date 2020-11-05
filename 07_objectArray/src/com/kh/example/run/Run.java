package com.kh.example.run;

import com.kh.example.person.controller.PersonController;
import com.kh.example.person.model.vo.Person;

public class Run {

	public static void main(String[] args) {
	
		Person p1 = new Person("±è¿¬¿ì", 24, 'M', 180.1, 65.6);
		
		System.out.println(p1.personInfo());
	
		PersonController pc = new PersonController();
		pc.method1();
		pc.method2();
	}

}
