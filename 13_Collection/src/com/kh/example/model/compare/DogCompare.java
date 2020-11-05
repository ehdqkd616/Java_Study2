package com.kh.example.model.compare;

import java.util.Comparator;

import com.kh.example.set.model.vo.Dog;

public class DogCompare implements Comparator<Dog>{

	@Override
	public int compare(Dog o1, Dog o2) {
		
		double standard = o1.getWeight();
		double object = o2.getWeight();
		
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



