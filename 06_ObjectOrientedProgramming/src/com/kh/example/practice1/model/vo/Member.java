package com.kh.example.practice1.model.vo;

public class Member {
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() {
	
	}
	
	public Member(String memberId, String memberPwd, String memberName, 
			int age, char gender, String phone, String email) {
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	
	public void changeName(String memberName) {
		this.memberName = memberName;
	}

	public void printName() {
		System.out.println(memberName);
	}
	
	
	public void memberInfo() {
		System.out.println("아이디 : " + memberId + ", 비밀번호 : " + memberPwd + 
				", 이름 : " + memberName + ", 나이 : " + age + ", 성별 : " + gender +
				", 전화번호 : " + phone + ", 이메일 : " + email);
	}
	
}



