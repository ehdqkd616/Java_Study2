package com.kh.example.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;

public class StudentCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// 점수 오름차순 정렬
		
		int standard = o1.getScore();
		int object = o2.getScore();
		
		String standardName = o1.getName();
		String objectName = o2.getName();
		
		if(standard > object) {
			return 1;
		} else if(standard == object) {
//			return 0;
			return standardName.compareTo(objectName);
		} else {
			return -1;
		}
	}
}



