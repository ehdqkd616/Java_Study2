package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();

		String str = num > 0 ? "�����" : "����� �ƴϴ�";
		System.out.println(str);
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();

		String str = num > 0 ? "�����" : (num == 0 ? "0�̴�" : "������");
		System.out.println(str);
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();

		String str = num % 2 == 0 ? "¦����" : "Ȧ����";
		System.out.println(str);
	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);
		int people;
		int candy;

		System.out.print("�ο� �� : ");
		people = sc.nextInt();

		System.out.print("���� ���� : ");
		candy = sc.nextInt();

		System.out.println("1�δ� ���� ���� : " + candy / people);
		System.out.println("���� ���� ���� : " + candy % people);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		System.out.print("��(���ڸ�) : ");
		int classNum = sc.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		System.out.print("����(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double score = sc.nextDouble();

		String student = gender == 'M' ? "���л�" : "���л�";

		System.out.println();
		System.out.println(
				grade + "�г� " + classNum + "�� " + num + "�� " + name + " " + student + "�� ������ " + score + "�̴�.");

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();

		String str = age <= 13 ? "���" : (age > 19 ? "����" : "û�ҳ�");
		System.out.println(str);
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();

		System.out.println();

		int sum = kor + eng + math;
		double avg = sum / 3.0;
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);

		String result = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "�հ�" : "���հ�";
		System.out.println(result);
		// System.out.println(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "�հ�" : "���հ�");
		
//		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60){
//			System.out.println("�հ�"); }else{ System.out.println("���հ�");
//		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		char pId = sc.nextLine().charAt(7);

		String gender = pId == '1' || pId == '3' ? "����" : "����";
		System.out.println(gender);
	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int input;

		System.out.print("����1 : ");
		num1 = sc.nextInt();

		System.out.print("����2 : ");
		num2 = sc.nextInt();

		System.out.print("�Է� : ");
		input = sc.nextInt();

		System.out.println((input <= num1) || (input > num2));

	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);
	

		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();

		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();

		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();

		boolean isTrue = (num1 == num2) && (num2 == num3);
		System.out.println(isTrue);

	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A����� ���� : ");
		int a = sc.nextInt();
		System.out.print("B����� ���� : ");
		int b = sc.nextInt();
		System.out.print("C����� ���� : ");
		int c = sc.nextInt();

		double aIncen = a * 1.4;
		double bIncen = b;
		double cIncen = c * 1.15;
		// double cIncen = c + c * 0.15;
		/***
		 	float, double�� �Ǽ��� �ε��Ҽ��� ������� �����ϴµ� �� �� �ٻ� ������ ����
		 		�ε��Ҽ� 2��ȭ ���� ==> �Ҽ� ���� ��� x2�� �ؼ� ���� 0.���� 1.������ 2���� ǥ��
		 		ex. 0.1234567
		 			x2 = 0.2469134  --- 0
		 			x2 = 0.4938268  --- 0
		 			x2 = 0.9876536  --- 0
		 			x2 = 1.9753072  --- 1
		 			-1 = 0.9753072
		 			x2 = 1.9506144  --- 1 ....
		 	==> �Ҽ��� �Ʒ� �κ��� ����ȭ �� �� �������� ���� ��� 
		 	      ���� �Ҽ��� �Ǿ� �����θ� ������� ä��ٰ� �������� �뷮(float : 23bit / double : 52bit)������ ���� ����
		 	    --> �� �� 1�������� ���� �߻�
		 	
		 	���� float, double ��� �� ǥ���Ǵ� ���� �ٻ� ������ ǥ��
		 	
		 	0.15�� double�� ������ �ε��Ҽ��� ������� ���� ��
			[�ε� �Ҽ��� ǥ��]
				��ȣ 1,         ���� 11, 
				  0          011 1111 1100 
				                                            ���� 52
				0011 0011 0011 0011 0011 0011 0011 0011 0011 0011 0011 0011
				
				�̿Ͱ��� ǥ���ǰ�
				
				�̰� �ٽ� ���������� ��ȯ�ϸ�
				
				0.14999999999998858690730685339076
				
				������ �߻��� ���� Ȯ�� ����
				
				double 0.15 ���� �� : 0.1499999999999999944488848768742172978818416595458984375
				double 1.15 ���� �� : 1.149999999999999911182158029987476766109466552734375
			
		 */

		System.out.println();

		String s1 = "3000 �̻�";
		String s2 = "3000 �̸�";

		System.out.println("A��� ����/����+a : " + a + "/" + aIncen);
		System.out.println(aIncen >= 3000 ? s1 : s2);
		System.out.println("B��� ����/����+a : " + b + "/" + bIncen);
		System.out.println(bIncen >= 3000 ? s1 : s2);
		System.out.println("C��� ����/����+a : " + c + "/" + cIncen);
		System.out.println(cIncen >= 3000 ? s1 : s2);

	}

}
