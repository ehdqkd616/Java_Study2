package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++	) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++	) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		String[] arr = new String[5];
		arr[0] = "���";
		arr[1] = "��";
		arr[2] = "����";
		arr[3] = "������";
		arr[4] = "����";
		
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] chArr = new char[str.length()];
		int count = 0;
		
		System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");
		for(int i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i);
			
			if(ch == chArr[i]) {
				count++;
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println(ch + " ���� : " + count);
	}
	
	public void practice6() {
		String[] strArr = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		if(num >= 0 && num <= 6) {			
			System.out.println(strArr[num] + "����");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("�� �� : " + sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		while(true) {
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num >= 3 && num % 2 != 0) {
				arr = new int[num];
				int div = num / 2;
				for(int i = 0; i <= div; i++) {
					arr[i] = (i+1);
				}
				for(int i = div+1; i < arr.length; i++) {
					arr[i] = num-i;
				}
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length -1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}
	
	public void practice9() {
		String[] arr = {"�Ķ��̵�", "���", "�Ĵ�", "����", "ġ��", "����"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String chicken = sc.nextLine();
		
		boolean check = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(chicken)) {
				check = true;
				break;
			}
		}
		
		if(check) {
			System.out.println(chicken + "ġŲ ��� ����");
		} else {
			System.out.println(chicken + "ġŲ�� ���� �޴��Դϴ�.");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String id = sc.nextLine();
		
		char[] chArr = new char[id.length()];
		for(int i = 0; i < id.length(); i++) {
			chArr[i] = id.charAt(i);
		}
		
		char[] copyArr = new char[chArr.length];
//		System.arraycopy(chArr, 0, copyArr, 0, 8);
//		for(int i = 8; i < copyArr.length; i++) {
//			copyArr[i] = '*';
//		}
//		
//		for(int i = 0; i < copyArr.length; i++) {
//			System.out.print(copyArr[i]);
//		}
		
		for(int i = 0; i < copyArr.length; i++) {
			if(i >= 8) {
				copyArr[i] = '*';
			} else {
				copyArr[i] = chArr[i];
			}
			
			System.out.print(copyArr[i]);
		}	
	}
	
	public void practice11() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		int[] arr = new int[10];

		int max = 1;
		int min = 10;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}
	
	public void practice13() {
		int[] arr = new int[10];
				
		for(int i = 0; i < arr.length;) {
		
			int random = (int)(Math.random() * 10 + 1);
			boolean check = false;
			
			for(int j = 0; j < i; j++) {
				if(arr[j] == random) {
					check = true;
					break;
				}
			}
			
			if(!check) {
				arr[i] = random;
				System.out.print(arr[i] + " ");
				i++;
			}
		}
	}
	
	public void practice14() {
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length;) {
			int random = (int)(Math.random() * 45 + 1);
			boolean check = false;
			
			for(int j = 0; j < i; j++) {
				if(lotto[j] == random) {
					check = true;
					break;
				}
			}
			
			if(!check) {
				lotto[i] = random;
				i++;
			}
		}
		
		for(int i = 0; i < lotto.length; i++) {
			for(int j = i; j < lotto.length; j++) {				
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
			
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		char[] chArr = new char[str.length()];
		chArr[0] = str.charAt(0);
		
		boolean check = false;
		for(int i = 1; i < str.length(); i++) {
			for(int j = 0; j < chArr.length; j++) {
				if(str.charAt(i) == chArr[j]) {
					check = true;
					break;
				}
			}
			
			if(!check) {				
				for(int k = 1; k < chArr.length; k++) {
					if(chArr[k] == '\u0000') {
						chArr[k] = str.charAt(i);
						break;
					}
				}				
			}
			check = false;
		}
		
		int count = 0;
		System.out.print("���ڿ��� �ִ� ���� : ");
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] != '\u0000') {
				if(i == chArr.length -1) {
					System.out.print(chArr[i]);
					System.out.println();
				} else if(chArr[i+1] == '\u0000') {				
					System.out.print(chArr[i]);
					System.out.println();
				} else {
					System.out.print(chArr[i] + ", ");				
				}
				count++;
			}
		}
		System.out.println("���� ���� : " + count);
	}
	
	public void practice15_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		char[] chArr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			boolean check = false;
			for(int j = 0; j < chArr.length; j++) {
				if(str.charAt(i) == chArr[j]) {
					check = true;
					break;
				}
			}
			
			if(!check) {				
				for(int k = 0; k < chArr.length; k++) {
					if(chArr[k] == '\u0000') {
						chArr[k] = str.charAt(i);
						break;
					}
				}				
			}
		}
		
		int count = 0;
		System.out.print("���ڿ��� �ִ� ���� : ");
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] != '\u0000') {
				if(i == chArr.length -1) {
					System.out.print(chArr[i]);
					System.out.println();
				} else if(chArr[i+1] == '\u0000') {				
					System.out.print(chArr[i]);
					System.out.println();
				} else {
					System.out.print(chArr[i] + ", ");				
				}
				count++;
			}
		}
		System.out.println("���� ���� : " + count);
	}
	
	public void practice15_2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		char[] chArr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			boolean check = false;
			for(int j = 0; j < chArr.length; j++) {
				if(str.charAt(i) == chArr[j]) {
					check = true;
					break;
				}
			}
			
			if(!check) {				
				for(int k = 0; k < chArr.length; k++) {
					if(chArr[k] == '\u0000') {
						chArr[k] = str.charAt(i);
						break;
					}
				}				
			}
		}
		
		int count = 0;
		System.out.print("���ڿ��� �ִ� ���� : ");
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] != '\u0000') {
				if(i == chArr.length -1) {
					System.out.print(chArr[i]);
					System.out.println();
				} else if(chArr[i+1] == '\u0000') {				
					System.out.print(chArr[i]);
					System.out.println();
				} else {
					System.out.print(chArr[i] + ", ");				
				}
				count++;
			}
		}
		System.out.println("���� ���� : " + count);
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		String[] strArr = new String[sc.nextInt()];
		
		sc.nextLine();
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(i+1 + "��° ���ڿ� : ");
			strArr[i] = sc.nextLine();
		}
		
		String user = null;
		do {
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			user = sc.nextLine();
			
			if(user.toUpperCase().equals("Y")) {
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int add = sc.nextInt();
				String[] newArr = new String[strArr.length + add];
				System.arraycopy(strArr, 0, newArr, 0, strArr.length);
				
				sc.nextLine();
				
				for(int i = strArr.length; i < newArr.length; i++) {
					System.out.print(i+1 + "��° ���ڿ� : ");
					newArr[i] = sc.nextLine();
				}
				
				strArr = newArr;
			}
			
		} while(!user.toUpperCase().equals("N"));
		
		System.out.println(Arrays.toString(strArr));
	}
}
