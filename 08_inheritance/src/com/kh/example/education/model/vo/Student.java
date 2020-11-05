package com.kh.example.education.model.vo;

public class Student {

	private String academy;
	private String acaAddr;
	private String name;
	private char classRoom;
	private String course;
	private int money;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String academy, String acaAddr, String name, 
			char classRoom, String course, int money) {
		this.academy = academy;
		this.acaAddr = acaAddr;
		this.name = name;
		this.classRoom = classRoom;
		this.course = course;
		this.money = money;
	}
	
	
	@Override
	public String toString() {
		return "Student [academy=" + academy + ", acaAddr=" + acaAddr + ", name=" + name + ", classRoom=" + classRoom
				+ ", course=" + course + ", money=" + money + "]";
	}

	public String getAcademy() {
		return academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}

	public String getAcaAddr() {
		return acaAddr;
	}

	public void setAcaAddr(String acaAddr) {
		this.acaAddr = acaAddr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
	
}


