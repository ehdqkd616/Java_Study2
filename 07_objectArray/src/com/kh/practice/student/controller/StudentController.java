package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	public StudentController() {
		sArr[0] = new Student("�ڽſ�", "�ڹ�", 100);
		sArr[1] = new Student("�鵿��", "���", 50);
		sArr[2] = new Student("������", "ȭ��", 85);
		sArr[3] = new Student("����", "����", 60);
		sArr[4] = new Student("�ڼ���", "�ڹ�", 20);
	}
	
	public Student[] printStudent() {
		return sArr;
	}

	public int sumScore() {
		
		int sum = 0;
		
		for(int i = 0; i < sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		
		return sum;
	}
	
	public double[] avgScore() {
		
		double[] sumAvg = new double[2];
		sumAvg[0] = sumScore();
		sumAvg[1] = sumScore()/sArr.length;
		
		return sumAvg;
	}
}
