package com.kh.practice.chap01.condition;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("�Է� �޴��Դϴ�.");
			break;
		case 2:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 3:
			System.out.println("��ȸ �޴��Դϴ�.");
			break;
		case 4:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 7:
			System.out.println("���α׷��� ����˴ϴ�.");
			break;
		default:
			System.out.println("�߸��Է��Ͽ����ϴ�.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("¦����");
			} else {
				System.out.println("Ȧ����");
			}
		} else {
			System.out.println("����� �Է����ּ���.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� : ");
		int kor = sc.nextInt();
		System.out.print("�������� : ");
		int math = sc.nextInt();
		System.out.print("�������� : ");
		int eng = sc.nextInt();

		int sum = kor + math + eng;
		double avg = sum / 3.0;

		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + math);
			System.out.println("���� : " + eng);
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + avg);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է� : ");
		int num = sc.nextInt();
		String season = null;

		switch (num) {
		case 12:
		case 1:
		case 2:
			season = "�ܿ�";
			break;
		case 3:
		case 4:
		case 5:
			season = "��";
			break;
		case 6:
		case 7:
		case 8:
			season = "����";
			break;
		case 9:
		case 10:
		case 11:
			season = "����";
			break;
		default:
			season = "�߸� �Էµ� ��";
		}

		System.out.println(num + "���� " + season + "�Դϴ�.");
	}

	public void practice5() {
		String id = "myId";
		String pw = "myPassword12";

		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : ");
		String userId = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String userPw = sc.nextLine();

//		if(id.equals(userId) && pw.equals(userPw)) {
//			System.out.println("�α��� ����");
//		} else if(id.equals(userId)) {
//			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
//		} else if(pw.equals(userPw)) {
//			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
//		}

		if (id.equals(userId)) {
			if (pw.equals(userPw)) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");

		switch (sc.nextLine()) {
		case "������":
			System.out.print("ȸ������, �Խñ� ���� ");
		case "ȸ��":
			System.out.print("�Խñ� �ۼ�, ��� �ۼ� ");
		case "��ȸ��":
			System.out.print("�Խñ� ��ȸ ");
			break;
		// �������� ���� ������ ��ɺ��� ��ȸ�� ��ɱ��� ��� ����� �����ϰ�
		// ȸ���� ���� ȸ�� ��ɺ��� ��ȸ�� ��ɱ���,
		// ��ȸ���� ���� ��ȸ�� ��ɸ� �����ϵ��� ���� switch��
		// ������ ��ȸ���� break�� �ɾ��� ������ default������ �Ѿ�� �ʰ� �ϱ� ���ؼ��̴�.
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();

		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();

		double bmi = weight / (height * height);

		System.out.println("BMI ���� : " + bmi);

		if (bmi < 18.5) {
			System.out.println("��ü��");
		} else if (bmi < 23) {
			System.out.println("����ü��");
		} else if (bmi < 25) {
			System.out.println("��ü��");
		} else if (bmi < 30) {
			System.out.println("��");
		} else {
			System.out.println("�� ��");
		}

		if (bmi >= 30) {
			System.out.println("�� ��");
		} else if (bmi >= 25) {
			System.out.println("��");
		} else if (bmi >= 23) {
			System.out.println("��ü��");
		} else if (bmi >= 18.5) {
			System.out.println("���� ü��");
		} else {
			System.out.println("��ü��");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);

		double result = 0;
		
		// ��ø if��
		if (num1 > 0 && num2 > 0) { // ����� ����
			
			switch(ch) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = (double)num1 / num2; break;
			case '%': result = num1 % num2; break;
			default: System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
			
			if(ch == '/')
				System.out.printf("%d %c %d = %f", num1, ch, num2, result);
			else if(ch == '+' || ch == '-' || ch == '*' || ch == '%')
				System.out.printf("%d %c %d = %d", num1, ch, num2, (int)result);
		} else {
			System.out.println("������� �Է����ּ���. ���α׷��� �����մϴ�.");
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�߰� ��� ���� : ");
		int midTerm = sc.nextInt();

		System.out.print("�⸻ ��� ���� : ");
		int finalTerm = sc.nextInt();

		System.out.print("����  ���� : ");
		int homework = sc.nextInt();

		System.out.print("�⼮ ȸ�� : ");
		int attendance = sc.nextInt();

		System.out.println("================= ��� =================");
		if (!(attendance < 20 * 0.7)) { // 30% �̻� �Ἦ �� Fail�̹Ƿ�

			System.out.println("�߰� ��� ����(20) : " + midTerm * 0.2);
			System.out.println("�⸻ ��� ����(30) : " + finalTerm * 0.3);
			System.out.println("���� ����       (30) : " + homework * 0.3);
			System.out.println("�⼮ ����       (20) : " + (attendance / 20.0 * 100 * 0.2));

			double sum = midTerm * 0.2 + finalTerm * 0.3 + homework * 0.3 + (attendance / 20.0 * 100 * 0.2);
			// attendance / 20.0 * 100 �� �� �⼮�� ��¥�� ������ 100�� �������� ȯ���ϴ� ���

			System.out.println("���� : " + sum);

			if (sum >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [���� �̴�]");
			}
		} else {
			System.out.println("Fail [�⼮ ȸ�� ���� (" + attendance + "/20)]");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);

		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");

		System.out.print("���� : ");
		switch (sc.nextInt()) { //���� ������ ���� �ʾƵ� �ȴ�.

		case 1:	practice1(); break;
		case 2:	practice2(); break;
		case 3:	practice3(); break;
		case 4:	practice4(); break;
		case 5:	practice5(); break;
		case 6:	practice6(); break;
		case 7:	practice7(); break;
		case 8:	practice8(); break;
		case 9:	practice9(); break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		int pwd;

		System.out.print("��й�ȣ �Է�(1000~9999) : ");
		pwd = sc.nextInt();
		
		// 1) �ڸ��� �˻�
		if (pwd >= 1000 && pwd <= 9999) { // 4�ڸ� ������ ���
			
			String stringPw = String.valueOf(pwd);
			
			// 2) �� �ڸ����� ���� ������ ���� ����
			String pw1 = stringPw.substring(0, 1);
			String pw2 = stringPw.substring(1, 2);
			String pw3 = stringPw.substring(2, 3);
			String pw4 = stringPw.substring(3, 4);

			// 3) �ߺ� �˻�
			// �ߺ� �˻�� �ӽ� ����
			boolean check = false;

			// �ߺ��Ǵ� ���� ���� �� check = false, ���� ��� true
			if (!pw1.equals(pw2) && !pw1.equals(pw3) && !pw1.equals(pw4)) {
				if (!pw2.equals(pw3) && !pw2.equals(pw4)) {
					if (!pw3.equals(pw4)) {
						check = true;
					}
				}
			}

			// 4) ��� ���
			if (check)
				System.out.println("����");
			else
				System.out.println("����");

		} else {
			System.out.println("�ڸ��� �ȸ���");
		}

	}
	
	public void practice12() { // baek
		Scanner sc = new Scanner(System.in);
		int pwd;

		System.out.print("��й�ȣ �Է�(1000~9999) : ");
		pwd = sc.nextInt();

		// 1) �ڸ��� �˻�
		// (pwd/1000) > 0 --> 3�ڸ� �ʰ�
		// (pwd/1000) < 10) --> 5�ڸ� �̸�
		if ((pwd / 1000) > 0 && (pwd / 1000) < 10) { // 4�ڸ� ������ ���

			// 2) �� �ڸ����� ���� ������ ���� ����
			int num1000, num100, num10, num1;

			num1000 = pwd / 1000;
			num100 = pwd % 1000 / 100;
			num10 = pwd % 100 / 10;
			num1 = pwd % 10;

			// 3) �ߺ� �˻�
			// �ߺ� �˻�� �ӽ� ����
			boolean check = false;

			// �ߺ��Ǵ� ���� ���� �� check = false, ���� ��� true
			if ((num1000 != num100) && (num1000 != num10) && (num1000 != num1)) {
				if ((num100 != num10) && (num100 != num1)) {
					if (num10 != num1) {
						check = true;
					}
				}
			}

			// 4) ��� ���
			if (check)
				System.out.println("����");
			else
				System.out.println("����");

		} else {
			System.out.println("�ڸ��� �ȸ���");
		}
	}
	
	public void practice13() { // ��� �͸����� �غ���
		Scanner sc = new Scanner(System.in);
		System.out.print("��й�ȣ �Է�(1000~9999) : ");
		String pwd = sc.nextLine();
		char first = pwd.charAt(0);
		
		if(first == '0') {
			System.out.println("�ڸ��� �� ����");
		} else {
			char second = pwd.charAt(1);
			char third = pwd.charAt(2);
			char fourth = pwd.charAt(3);
			
			if(first != second && first != third && first != fourth
					&& second != third && second != fourth
					&& third != fourth) {
				System.out.println("����");
			} else {
				System.out.println("����");
			}
		}
		
	}
}
