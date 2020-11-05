package com.kh.example.education.model.vo;

public class Child extends Academy{
	
	private int age;
	private char gender;
	
	public Child() {
		
	}
	
	public Child(String academy, String acaAddr, String name, 
			char classRoom, int age, char gender) {
		
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String getAcademy() {
		return super.getAcademy();
	}

	@Override
	public void setAcademy(String academy) {
		super.setAcademy(academy);
	}

	@Override
	public String getAcaAddr() {
		return super.getAcaAddr();
	}

	@Override
	public void setAcaAddr(String acaAddr) {
		super.setAcaAddr(acaAddr);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public char getClassRoom() {
		return super.getClassRoom();
	}

	@Override
	public void setClassRoom(char classRoom) {
		super.setClassRoom(classRoom);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Child [age=" + age + ", gender=" + gender + "]";
	}
}


