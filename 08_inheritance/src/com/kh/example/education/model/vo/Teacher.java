package com.kh.example.education.model.vo;

public class Teacher {

	private String academy;
	private String acaAddr;
	private String name;
	private char classRoom;
	private String subject;
	private int career;
	
	public Teacher() {
		
	}
	
	public Teacher(String academy, String acaAddr, String name, 
			char classRoom, String subject, int career) {
		this.academy = academy;
		this.acaAddr = acaAddr;
		this.name = name;
		this.classRoom = classRoom;
		this.subject = subject;
		this.career = career;
	}
	

	@Override
	public String toString() {
		return "Teacher [academy=" + academy + ", acaAddr=" + acaAddr + ", name=" + name + ", classRoom=" + classRoom
				+ ", subject=" + subject + ", career=" + career + "]";
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}
	
	
	
}


