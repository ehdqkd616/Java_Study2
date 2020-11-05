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
		// ��ü ��ü ��
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		// �ʵ� �� ��
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
//		// �̸� ��������
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
		//		String �ȿ� ���� ���� �������ֱ� ������ �������� ���� ����
		
//		int result = name.compareTo(otherName);
		// �� ��ü.comareTo(�񱳴��)
		// �� ��ü�� �� ���� ������ 0
		// �� ��ü�� �� ��󺸴� ũ�� 1
		// �� ��ü�� �� ��󺸴� ������ -1 ==> ��������
		
//		return 0;
		
		return name.compareTo(otherName);
		
		// ���� ���������� ���ϸ� ��� ���� �ݴ�θ� �������� �� ==> - (���̳ʽ�) ���̱�
//		return -name.compareTo(otherName);
		
	}
	
}


