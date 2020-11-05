package com.kh.practice.practice3.controller;

import com.kh.practice.practice3.model.vo.Animal;
import com.kh.practice.practice3.model.vo.Cat;
import com.kh.practice.practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] a = new Animal[5];
		a[0] = new Dog("모모", "푸들", 2);
		a[1] = new Dog("이든", "푸들", 5);
		a[2] = new Cat("설아", "미정", "미정", "미정");
		a[3] = new Dog("마음", "말티", 3);
		a[4] = new Cat("실버", "모름", "모름", "회색");
		
		for(int i = 0; i < a.length; i++) {
			a[i].speak();
		}
	}
}
