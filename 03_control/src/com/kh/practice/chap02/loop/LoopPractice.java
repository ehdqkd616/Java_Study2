package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int user = sc.nextInt();

		if (user >= 1) {
			for (int i = 1; i <= user; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int user = sc.nextInt();
			if (user >= 1) {
				for (int i = 1; i <= user; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int user = sc.nextInt();

		if (user >= 1) {
			for (int i = user; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int user = sc.nextInt();
			if (user >= 1) {
				for (int i = user; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i <= num){
			sum += i;
			if(i != num) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = " + sum);
			}
			i++;
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) {
			int max = 0;
			int min = 0;
			
			if(num1 > num2) {
				max = num1;
				min = num2;
			} else {
				max = num2;
				min = num1;
			}
			
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}			
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("ù ��° ���� : ");
			int num1 = sc.nextInt();
			System.out.print("�� ��° ���� : ");
			int num2 = sc.nextInt();
			
			if(num1 >= 1 && num2 >= 1) {
				int max = 0;
				int min = 0;
				
				if(num1 > num2) {
					max = num1;
					min = num2;
				} else {
					max = num2;
					min = num1;
				}
				
				for(int i = min; i <= max; i++) {
					System.out.print(i + " ");
				}	
				break;
			} else {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.printf("===== %d�� =====\n", num);
		for(int i = 1; i < 10; i++) {			
			System.out.printf("%d * %d = %d%n", num, i, (num * i));
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num <= 9) {
			for(int i = num; i < 10; i++) {			
				System.out.printf("===== %d�� =====\n", i);
				for(int j = 1; j <= 9; j++) {				
					System.out.printf("%d * %d = %d%n", i, j, (i * j));
				}
				System.out.println();
			}			
		} else {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {			
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num <= 9) {
				for(int i = num; i < 10; i++) {			
					System.out.printf("===== %d�� =====\n", i);
					for(int j = 1; j <= 9; j++) {				
						System.out.printf("%d * %d = %d%n", i, j, (i * j));
					}
					System.out.println();
				}	
				break;
			} else {
				System.out.println("9 ������ ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int start = sc.nextInt();
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(num * i + start + " ");
		}
		
//		int count = 0;
//		for(int i = start; ; i += num) {
//			System.out.print(i + " ");
//			count++;
//			
//			if(count == 10) {
//				break;
//			}
//		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("������(+, -, *, /, %) : ");
			String op = sc.next();
			
			if(op.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			
			if(op.equals("/") && num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.\n");
				continue;
			}
			
			switch(op) {
			case "+":
				System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 + num2));
				break;
			case "-":
				System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 - num2));
				break;
			case "*":
				System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 * num2));
				break;
			case "/":
				System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 / num2));
				break;
			case "%":
				System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 % num2));
				break;
			default:
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.\n");
			}
			System.out.println();
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = num; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
//		for(int i = num; i > 0; i--) {
//			for(int j = num; j > num-i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
	
	///////////////////////////////////////////////////////
	

	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		boolean flag = false;
		
		if(num >= 2) {			
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					flag = true;
					break;
				}
			}
			
			if(flag) {
				System.out.println("�Ҽ��� �ƴմϴ�.");
			} else {
				System.out.println("�Ҽ��Դϴ�.");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			boolean flag = false;
			
			if(num >= 2) {			
				for(int i = 2; i < num; i++) {
					if(num % i == 0) {
						flag = true;
						break;
					}
				}
				
				if(flag) {
					System.out.println("�Ҽ��� �ƴմϴ�.");
				} else {
					System.out.println("�Ҽ��Դϴ�.");
				}
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}	
		}
	}
	
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		boolean flag = false;
		int count = 0;
		if(num >= 2) {
			for(int i = 2; i <= num; i++) {				
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						flag = true;
						break;
					}
				}
				
				if(!flag) {
					System.out.print(i + " ");
					count++;
				}
				
				flag = false;
				// �Ҽ��� �ƴ� �� flag�� true�� �Ǹ鼭 �� ��° for���� ��������
				// �� ��° for���� �������� if���� ������ �ٽ� ù ��° for���� ���ٰ� �� ��
				// �Ҽ��� �����ٰ� �ص� flag�� ������ true�� �Ǿ� �ִ� ���¶� 
				// if���� �ɷ� print���� �ʴ´�, �ٽ� ���� �Ҽ��� �Ÿ��� boolean����
				// ������� �ʱ�ȭ �����ִ� �۾�
			}
			
			System.out.println();
			System.out.println("2���� " + num + "���� �Ҽ��� ������ " + count + "���Դϴ�.");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}	
	}
	
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		int user = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= user; i++) { //1���� ����� ������
			if(i % 2 == 0 || i % 3 == 0) { //2�� ����������ų� 3���� ����������� : 2�� 3�� �����
				System.out.print(i + " ");
			}
			
			if(i % 2 == 0 && i % 3 == 0) { //2�ε� ����������� 3���ε� ����������� : 2�� 3�� �������
				count++;
			}
		}
		System.out.println();
		System.out.println("count : " + count);
	}
	
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int user = sc.nextInt();
		
		for(int i = 0; i < user; i++) {
			for(int j = 0; j < user-i-1; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice20() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int user = sc.nextInt();
		
		for(int i = 0; i < user; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = user-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice21() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int user = sc.nextInt();
		
		for(int i = user, j = 1 ; i > 0 ; i--, j+=2) {
			for(int k = 0 ; k < i ; k++) {
				System.out.print(" ");
			}
			
			for(int k = 0 ; k < j ; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int user = sc.nextInt();
		
		for(int i = 0 ; i < user ; i++) {
			
			for(int j = 0; j < user ; j++) {
				
				// ù ��° �ٰ� ������ ���� ��� "*" ���
				if(i == 0 || i == user-1) {
					System.out.print("*");
				}
				else{
					if(j == 0 || j == user-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
