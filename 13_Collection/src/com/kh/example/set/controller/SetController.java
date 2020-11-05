package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;

import com.kh.example.model.compare.DogCompare;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
		HashSet<Dog> set = new HashSet<Dog>();
//		HashSet<Dog> set = new HashSet<>();
//									타입 추론
		
		set.add(new Dog("섭섭이", 3.5));
		set.add(new Dog("복실이", 10.3));
		set.add(new Dog("히릿", 20.8));
		
		System.out.println("set : " + set);
		
		set.add(new Dog("섭섭이", 3.5));
		System.out.println("set : " + set);	
		
		set.add(new Dog("섭섭이", 5.7));
		System.out.println("set : " + set);
		
		// LinkedHashSet
		LinkedHashSet<Dog> set2 = new LinkedHashSet<Dog>();
		set2.add(new Dog("루디", 1.8));
		set2.add(new Dog("깜이", 10.6));
		set2.add(new Dog("화니", 4.7));
		set2.add(new Dog("마츄", 6.3));
		set2.add(new Dog("신디", 1.8));
		set2.add(new Dog("루디", 3.5));
		
		System.out.println("set2 : " + set2);	
		
		TreeSet<Dog> set3 = new TreeSet<Dog>(new DogCompare());
		set3.add(new Dog("루디", 1.8));
		set3.add(new Dog("깜이", 10.6));
		set3.add(new Dog("화니", 4.7));
		set3.add(new Dog("마츄", 6.3));
		set3.add(new Dog("신디", 1.8));
		set3.add(new Dog("루디", 3.5));
		
		System.out.println("set3 : " + set3);	
		
		TreeSet<Dog> set4 = new TreeSet<Dog>(new DogCompare());
		set4.add(new Dog("루디", 1.8));
		set4.add(new Dog("깜이", 10.6));
		set4.add(new Dog("화니", 4.7));
		set4.add(new Dog("마츄", 6.3));
		set4.add(new Dog("신디", 1.8));
		set4.add(new Dog("루디", 3.5));
		
		System.out.println("set4 : " + set4);
		
		// Set 안에 있는 element 접근하기
		// 접근 1. Set을 List로 옮기기
		ArrayList<Dog> list = new ArrayList<Dog>();
		list.addAll(set4);
		System.out.println("list : " + list);
		System.out.println("list.get(4) : " + list.get(4));
		
		// 접근 2. Iterator 사용
		
		Iterator<Dog> it = set4.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		ListIterator<Dog> lit = list.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}		
		
		System.out.println();
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		
		
		
		
	}
	
}




