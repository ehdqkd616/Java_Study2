package com.kh.example.chap06_method.model.vo;

public class Trainee {
	
	private String name;
	private final String ACADEMY = "KH";
	private char classRoom;
	private String time;
	private static double score;
	
	public Trainee(String name, char classRoom, String time, double score) {
		this.name = name;
		this.classRoom = classRoom;
		this.time = time;
		Trainee.score = score;
	}
	
	public void changeName(String name) {
		this.name = name;
	}
	
	public String printName() {
		return name;
	}

	public String getACADEMY() {
		return ACADEMY;
	}

	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}

	public char showClassRoom() {
		return classRoom;
	}
	
	public void info() {
		System.out.println("이름 : " + name + ", 강의실 : " + classRoom + 
				", 학원 : " + ACADEMY + ", 수업 시간 : " + time + ", 점수 : " +score);
	}
	
	
}
