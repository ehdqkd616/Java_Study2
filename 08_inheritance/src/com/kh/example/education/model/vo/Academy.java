package com.kh.example.education.model.vo;

public class Academy {
	
	private String academy;
	private String acaAddr;
	private String name;
	private char classRoom;
	
	
	public Academy() {
		
	}
	
	public Academy(String academy, String acaAddr, String name, char classRoom) {
		this.academy = academy;
		this.acaAddr = acaAddr;
		this.name = name;
		this.classRoom = classRoom;
	}

	
	@Override
	public String toString() {
		return "Academy [academy=" + academy + ", acaAddr=" + acaAddr + ", name=" + name + ", classRoom=" + classRoom
				+ "]";
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
	
	
}


