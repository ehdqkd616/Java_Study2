package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member a = new Member("rudy", "1234", "±è¿¬¿ì", 24, '³²', "010-0000-0000", "my4my4@nate.com");
		
		a.memberInfo();
		a.changeName("±è¹Ùº¸");
		a.memberInfo();
		a.printName();
		
		
		
		
	}

}
