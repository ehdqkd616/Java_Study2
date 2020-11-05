package com.kh.example.list.model.vo;

public class Student implements Comparable<Student> {
	
	private String name;
	private int score;
	
	public Student() {
		
	}
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return name + "(" + score + ")";
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// 객체 자체 비교
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		// 필드 값 비교
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}

//	@Override
//	public int compareTo(Object o) {
//		
//		// 이름 오름차순
//		String otherName = ((Student)o).getName();
//		
//		return 0;
//		
//	}
	
	@Override
	public int compareTo(Student o) {
		
		String otherName = o.getName();
		
		// (this.)name	VS	otherName
		//		String		String
		// ArrayList<String> list1 ==> sort()
		//		String 안에 정렬 기준 세워져있기 때문에 오름차순 정렬 가능
		
//		int result = name.compareTo(otherName);
		// 비교 주체.comareTo(비교대상)
		// 비교 주체가 비교 대상과 같으면 0
		// 비교 주체가 비교 대상보다 크면 1
		// 비교 주체가 비교 대상보다 작으면 -1 ==> 오름차순
		
//		return 0;
		
		return name.compareTo(otherName);
		
		// 만일 내림차순을 원하면 결과 값을 반대로만 뒤집으면 됨 ==> - (마이너스) 붙이기
//		return -name.compareTo(otherName);
		
	}
	
}


