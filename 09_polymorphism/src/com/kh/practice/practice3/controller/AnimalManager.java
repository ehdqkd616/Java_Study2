package com.kh.practice.practice3.controller;

import com.kh.practice.practice3.model.vo.Animal;
import com.kh.practice.practice3.model.vo.Cat;
import com.kh.practice.practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] a = new Animal[5];
		a[0] = new Dog("���", "Ǫ��", 2);
		a[1] = new Dog("�̵�", "Ǫ��", 5);
		a[2] = new Cat("����", "����", "����", "����");
		a[3] = new Dog("����", "��Ƽ", 3);
		a[4] = new Cat("�ǹ�", "��", "��", "ȸ��");
		
		for(int i = 0; i < a.length; i++) {
			a[i].speak();
		}
	}
}
