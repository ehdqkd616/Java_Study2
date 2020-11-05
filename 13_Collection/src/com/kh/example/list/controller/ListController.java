package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.example.list.model.vo.Student;
import com.kh.example.model.compare.StudentCompare;

public class ListController {
	public void doList() {
		
//		ArrayList<E> list1 = new ArrayList<E>();
//		ArrayList<String> list1 = new ArrayList<String>();
//		ArrayList list1 = new ArrayList(); == ArrayList<Object> list1 = new ArrayList<Object>();
		
		ArrayList<String>list1 = new ArrayList<String>();
		// �÷��� ���� 3. ���� �� Ÿ�� ���� ����
		list1.add("�迬��");
//		list1.add(10);
//		list1.add(new Student("�迬��", 99));
		
//		Student s1 = new Student("�׽�Ʈ", 20);
//		list1.add(s1);
		
		ArrayList<Student> list = new ArrayList<Student>(3); //ũ�Ⱑ 3�� ArrayList ����
		
		list.add(new Student("�迬��", 10));
		System.out.println("���� list�� ��� element ���� : " + list.size());
		System.out.println("list : " + list);
		
		
		list.add(new Student("���", 20));
		System.out.println("���� list�� ��� element ���� : " + list.size());
		System.out.println("list : " + list);
		
		list.add(new Student("�躰", 30));
		System.out.println("���� list�� ��� element ���� : " + list.size());
		System.out.println("list : " + list);
		// �÷��� ���� 1. ũ�� ���� ����
		
		// �÷��� ���� 2. �߰�/����/���� ���� ���ó�� ����
		// add(int index, E e) : index��° �ε����� e �߰�
		list.add(0, new Student("���", 100));
		System.out.println("���� list�� ��� element ���� : " + list.size());
		System.out.println("list : " + list);
		
		// 3�ε����� ���ǰ� �л� 40�� ����
		list.add(3, new Student("���ǰ�", 40));
		System.out.println("���� list�� ��� element ���� : " + list.size());
		System.out.println("list : " + list);
		
		// remove(int index) : index��° ��ü ����
		list.remove(1);
		System.out.println("���� list�� ��� element ���� : " + list.size());
		System.out.println("list : " + list);
		
		// remove(Object obj) Student���� equals ��������� ��
		list.remove(new Student("���ǰ�", 40));
		System.out.println("���� list�� ��� element ���� : " + list.size());
		System.out.println("list : " + list);
		
		// ���� 1. Collections �̿�
//		list1.add("��ٺ�");
//		list1.add("�����");
//		list1.add("�谳��");
//		System.out.println("list1 ���� �� : " + list1);
//		Collections.sort(list1);
//		System.out.println("list1 ���� �� : " + list1);
		
		System.out.println("list ���� ��(Collections) : " + list);
		Collections.sort(list);
		System.out.println("list ���� ��(Collections) : " + list);
		
		list.add(new Student("�׽�Ʈ", 85));
				
		
		// ���� 2. List �ȿ� �ִ� sort()�޼ҵ� �̿�
		list.sort(new StudentCompare());
		System.out.println("list ���� ��(list.sort()) : " + list);
		
		// set(int index, E e) : index��° �ε����� �ִ� ��� E��� ����
		list.set(2, new Student("����", 90));
		System.out.println("list : " + list);
		
		// get(int index) : index��° �ε����� �ִ� ��� ������ ��
		Student getStudent = list.get(2);
		System.out.println(getStudent);
		System.out.println("list : " + list);
		
		// contains(Objact o) : o�� ����Ʈ�� �����Ѵٸ� true��ȯ
		// indexOf(Object o) : o�� ����Ʈ�� ��ġ�ϴ� �ε��� ��ȣ ��ȯ
		boolean bool1 = list.contains(new Student("����", 90));
		System.out.println("90���� ���� �л��� �ֽ��ϱ�? " + bool1);
		boolean bool2 = list.contains(new Student("����", 14));
		System.out.println("90���� ���� �л��� �ֽ��ϱ�? " + bool2);
		
		int index1 = list.indexOf(new Student("����", 90));
		System.out.println("90���� ���� �л��� �� ��°�� �ֽ��ϱ�? " + index1);
		int index2 = list.indexOf(new Student("����", 14));
		System.out.println("14���� ���� �л��� �� ��°�� �ֽ��ϱ�? " + index2);
		
		// clear() : ����� ��� ��ü ����
		// isEmpty() : ����Ʈ�� ����� �� true ��ȯ
		System.out.println("list�� ������ϱ�? " + list.isEmpty());
		list.clear();
		System.out.println("list�� ��¥ ������ϰ�? " + list.isEmpty());
		System.out.println("list : " + list);
	}
	
}
