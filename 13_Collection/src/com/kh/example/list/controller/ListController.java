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
		// 컬렉션 장점 3. 여러 개 타입 저장 가능
		list1.add("김연우");
//		list1.add(10);
//		list1.add(new Student("김연우", 99));
		
//		Student s1 = new Student("테스트", 20);
//		list1.add(s1);
		
		ArrayList<Student> list = new ArrayList<Student>(3); //크기가 3인 ArrayList 생성
		
		list.add(new Student("김연우", 10));
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());
		System.out.println("list : " + list);
		
		
		list.add(new Student("김달", 20));
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());
		System.out.println("list : " + list);
		
		list.add(new Student("김별", 30));
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());
		System.out.println("list : " + list);
		// 컬렉션 장점 1. 크기 제약 없음
		
		// 컬렉션 장점 2. 추가/삭제/정렬 등의 기능처리 간단
		// add(int index, E e) : index번째 인덱스에 e 추가
		list.add(0, new Student("김밥", 100));
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());
		System.out.println("list : " + list);
		
		// 3인덱스에 강건강 학생 40점 삽입
		list.add(3, new Student("강건강", 40));
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());
		System.out.println("list : " + list);
		
		// remove(int index) : index번째 객체 삭제
		list.remove(1);
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());
		System.out.println("list : " + list);
		
		// remove(Object obj) Student에서 equals 구현해줘야 함
		list.remove(new Student("강건강", 40));
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());
		System.out.println("list : " + list);
		
		// 정렬 1. Collections 이용
//		list1.add("김바보");
//		list1.add("김밥팅");
//		list1.add("김개똥");
//		System.out.println("list1 정렬 전 : " + list1);
//		Collections.sort(list1);
//		System.out.println("list1 정렬 후 : " + list1);
		
		System.out.println("list 정렬 전(Collections) : " + list);
		Collections.sort(list);
		System.out.println("list 정렬 후(Collections) : " + list);
		
		list.add(new Student("테스트", 85));
				
		
		// 정렬 2. List 안에 있는 sort()메소드 이용
		list.sort(new StudentCompare());
		System.out.println("list 정렬 후(list.sort()) : " + list);
		
		// set(int index, E e) : index번째 인덱스에 있는 요소 E요소 수정
		list.set(2, new Student("김루디", 90));
		System.out.println("list : " + list);
		
		// get(int index) : index번째 인덱스에 있는 요소 가지고 옴
		Student getStudent = list.get(2);
		System.out.println(getStudent);
		System.out.println("list : " + list);
		
		// contains(Objact o) : o가 리스트에 존재한다면 true반환
		// indexOf(Object o) : o가 리스트에 위치하는 인덱스 번호 반환
		boolean bool1 = list.contains(new Student("김루디", 90));
		System.out.println("90점인 김루디 학생이 있습니까? " + bool1);
		boolean bool2 = list.contains(new Student("김루디", 14));
		System.out.println("90점인 김루디 학생이 있습니까? " + bool2);
		
		int index1 = list.indexOf(new Student("김루디", 90));
		System.out.println("90점인 김루디 학생은 몇 번째에 있습니까? " + index1);
		int index2 = list.indexOf(new Student("김루디", 14));
		System.out.println("14점인 김루디 학생은 몇 번째에 있습니까? " + index2);
		
		// clear() : 저장된 모든 객체 삭제
		// isEmpty() : 리스트가 비었을 때 true 반환
		System.out.println("list가 비었습니까? " + list.isEmpty());
		list.clear();
		System.out.println("list가 진짜 비었습니가? " + list.isEmpty());
		System.out.println("list : " + list);
	}
	
}
