package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int user = sc.nextInt();

		if (user >= 1) {
			for (int i = 1; i <= user; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int user = sc.nextInt();
			if (user >= 1) {
				for (int i = 1; i <= user; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int user = sc.nextInt();

		if (user >= 1) {
			for (int i = user; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int user = sc.nextInt();
			if (user >= 1) {
				for (int i = user; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
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
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
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
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
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
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.printf("===== %d단 =====\n", num);
		for(int i = 1; i < 10; i++) {			
			System.out.printf("%d * %d = %d%n", num, i, (num * i));
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num <= 9) {
			for(int i = num; i < 10; i++) {			
				System.out.printf("===== %d단 =====\n", i);
				for(int j = 1; j <= 9; j++) {				
					System.out.printf("%d * %d = %d%n", i, j, (i * j));
				}
				System.out.println();
			}			
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {			
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num <= 9) {
				for(int i = num; i < 10; i++) {			
					System.out.printf("===== %d단 =====\n", i);
					for(int j = 1; j <= 9; j++) {				
						System.out.printf("%d * %d = %d%n", i, j, (i * j));
					}
					System.out.println();
				}	
				break;
			} else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
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
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.next();
			
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			if(op.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
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
				System.out.println("없는 연산자입니다. 다시 입력해주세요.\n");
			}
			System.out.println();
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
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
		System.out.print("정수 입력 : ");
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
		System.out.print("숫자 : ");
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
				System.out.println("소수가 아닙니다.");
			} else {
				System.out.println("소수입니다.");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 : ");
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
					System.out.println("소수가 아닙니다.");
				} else {
					System.out.println("소수입니다.");
				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}	
		}
	}
	
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
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
				// 소수가 아닐 때 flag는 true가 되면서 두 번째 for문을 빠져나옴
				// 두 번째 for문을 빠져나와 if문을 지나고 다시 첫 번째 for문을 돈다고 할 때
				// 소수를 만났다고 해도 flag는 여전히 true가 되어 있는 상태라 
				// if문에 걸려 print되지 않는다, 다시 말해 소수를 거르는 boolean값을
				// 원래대로 초기화 시켜주는 작업
			}
			
			System.out.println();
			System.out.println("2부터 " + num + "까지 소수의 개수는 " + count + "개입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}	
	}
	
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int user = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= user; i++) { //1부터 사용자 수까지
			if(i % 2 == 0 || i % 3 == 0) { //2로 나누어떨어지거나 3으로 나누어떨어지면 : 2와 3의 배수면
				System.out.print(i + " ");
			}
			
			if(i % 2 == 0 && i % 3 == 0) { //2로도 나누어떨어지고 3으로도 나누어떨어지면 : 2와 3의 공배수면
				count++;
			}
		}
		System.out.println();
		System.out.println("count : " + count);
	}
	
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
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
		
		System.out.print("정수 입력 : ");
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
		
		System.out.print("정수 입력 : ");
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
		
		System.out.print("정수 입력 : ");
		int user = sc.nextInt();
		
		for(int i = 0 ; i < user ; i++) {
			
			for(int j = 0; j < user ; j++) {
				
				// 첫 번째 줄과 마지막 줄은 모두 "*" 출력
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
