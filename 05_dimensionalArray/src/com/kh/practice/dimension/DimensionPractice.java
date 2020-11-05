package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d, %d)", i, j);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		int count = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		int[][] arr = new int[4][4];
		int count = 16;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count--;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		int[][] arr = new int[4][4];
		int sum = 0;
		
		//�����
		for(int i = 0; i < arr.length-1; i++){
			for(int j = 0; j < arr[i].length-1; j++){
				arr[i][j] = (int)(Math.random() * 10) + 1; 
			}
		}

		//���ó��	
		for(int i = 0; i < arr.length-1; i++){
			for(int j = 0; j < arr[i].length-1; j++){
				arr[i][3] += arr[i][j];
				arr[3][i] += arr[i][j];
			}
			
		}
		for(int i = 0; i < arr.length-1; i++) {
			arr[3][3] += arr[i][3] + arr[3][i];
		}
		
		//���Ȯ��
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice5(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ũ�� : ");
		int row = sc.nextInt();
		System.out.print("�� ũ�� : ");
		int col = sc.nextInt();

		char[][] arr = new char[row][col];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char)(65 + (int)(Math.random() * 26));
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"��", "��", "��", "��", "��"}, {"��", "��", "��", "��", "��"}, {"��", "��", "��", "��", "��"}, {"��", "��", "��", "��", "��"}, {"��", "��", "! ", "��", "!! "}};
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				// ���ݱ��� �о�Դ� �帧��
				// (0,1) (0, 1), (0, 2), (0, 3), (0, 4), // (1, 0), (1, 1), (1, 2), (1, 3), (1,
				// 4), // (2, 0), ....
				// ���� �� �� ���ϰ� ���� ��� �ٲ�� �帧

				// ���� �о���ϴ� �帧��
				// (0,0) (1, 0), (2, 0), (3, 0), (4, 0), // (0, 1), (1, 1), (2, 1), (3, 1), (4,
				// 1), // (0, 2), ....
				// ���� �ѹ� ���ϰ� ���� ��� �ٲ�� �帧

				System.out.print(strArr[j][i] + " ");
				// ���� ��� �ȿ��� �����ִ� j�� �տ� �ּ� ������, j�� �� ���� �ٲ�� i�� �ڿ� �ּ� ���� �д�.
			}
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ũ�� : ");
		int row = sc.nextInt(); // �� ũ�� ����

		char[][] charArr = new char[row][]; // ������ ���� �迭 ����
		for (int i = 0; i < row; i++) {
			System.out.print(i + "���� �� ũ�� : ");
			charArr[i] = new char[sc.nextInt()];
		}

		char data = 'a'; // ó�� �Է��� ��
		for (int i = 0; i < charArr.length; i++) {
			for (int j = 0; j < charArr[i].length; j++) {
				charArr[i][j] = data;
				data++;
				// ���� �� ���� �Ʒ� �� �ٷ� �ٲ� �� ����
				// charArr[i][j] = data++;

				System.out.print(charArr[i][j] + " ");
			}
			System.out.println(); // ���� ������ �ֱ� ���� ����
		}
	}
	
	public void practice8() {
		String[] student = {"���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����"};
		String[][] seat1 = new String[3][2]; // 1�д�
		String[][] seat2 = new String[3][2]; // 2�д�
		
		int count = 0;
		// 1�д��� ������ 2�д��� ���۵� ���� �̾ �����ϱ� ������
		// �л��� �̾ �� �� �ֵ��� count ���� ����
		
		System.out.println("== 1�д� ==");
		for(int i = 0; i < seat1.length; i++){
			for(int j = 0; j < seat1[i].length; j++){
				seat1[i][j] = student[count];
				count++;
				System.out.print(seat1[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("== 2�д� ==");
		for(int i = 0; i < seat2.length; i++){
			for(int j = 0; j <seat2[i].length; j++){
				seat2[i][j] = student[count];
				count++;
				System.out.print(seat2[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		String[] student = {"���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����"};
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		int count = 0;
		
		System.out.println("== 1�д� ==");
		for(int i = 0; i < seat1.length; i++){
			for(int j = 0; j <seat1[i].length; j++){
				seat1[i][j] = student[count];
				count++;
				System.out.print(seat1[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("== 2�д� ==");
		for(int i = 0; i < seat2.length; i++){
			for(int j = 0; j <seat2[i].length; j++){
				seat2[i][j] = student[count];
				count++;
				System.out.print(seat2[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		Scanner sc = new Scanner(System.in);

		System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		String partName = ""; // �д�
		String rowName = ""; // �� ��° ��
		String colName = ""; // ���� ������
		
		for(int i = 0; i < seat1.length; i++){
			for(int j = 0; j < seat1[i].length; j++){
				if(seat1[i][j].equals(name)) {
					partName = "1�д�";
					if(i == 0){
						rowName = "ù ��° ��";
					}else if(i == 1){
						rowName = "�� ��° ��";
					}else{
						rowName = "�� ��° ��";
					}
					if(j == 0){
						colName = "����";
					}else{
						colName = "������";
					}
					
					break;
				}
			}
		}
		
		for(int i = 0; i < seat2.length; i++){
			for (int j = 0; j < seat2[i].length; j++){
				if(seat2[i][j].equals(name)){
					partName = "2�д�";
					if(i == 0){
						rowName = "ù ��° ��";
					}else if(i == 1){
						rowName = "�� ��° ��";
					}else{
						rowName = "�� ��° ��";
					}
					if(j == 0){
						colName = "����";
					}else{
						colName = "������";
					}
					
					break;
				}
			}
		}
		
		System.out.println("�˻��Ͻ� " + name + " �л��� " + partName + " " + rowName + " " + colName + "�� �ֽ��ϴ�.");
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		String[][] board = new String[6][6]; // String�� 6�� 6�� 2���� �迭 ����
		
		// null�� �ʱ�ȭ �Ǿ� �ִ� ��� ���� " "�� ����
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = " ";
			}
		}
		
		// ���� �־��ֱ�
		/***
		 	     0 1 2 3 4 5 (���� �迭 �� �ε���)
		 	   0   0 1 2 3 4 (��� �迭 �� �ε���)
		 	   1 0
		 	   2 1       
		 	   3 2
		 	   4 3
		 	   5 4
		   (�ǿ�) (�⿭) 
		 	
		 */
		for(int i = 0; i < board.length-1; i++) {
			board[0][i+1] = i + "";
			board[i+1][0] = i + "";
			// "" �� �������� �ؼ� i�� String ���� ��
		}
		
		System.out.print("�� �ε��� �Է� : ");
		int row = sc.nextInt();

		System.out.print("�� �ε��� �Է� : ");
		int column = sc.nextInt();
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i == row && j == column) { // ����ڰ� �Է��� ��� ���� �ε��� ���� ���� ��
					board[i+1][j+1] = "X";
				}
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		String[][] board = new String[6][6]; // String�� 6�� 6�� 2���� �迭 ����
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = " ";
			}
		}
		
		for(int i = 0; i < board.length-1; i++) {
			board[0][i+1] = i + "";
			board[i+1][0] = i + "";
		}
		
		int row = 0;
		int column = 0;
		do {
			System.out.print("�� �ε��� �Է� : ");
			row = sc.nextInt();
			
			if(row != 99) {				
				System.out.print("�� �ε��� �Է� : ");
				column = sc.nextInt();
				
				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[i].length; j++) {
						if (i == row && j == column) { // ����ڰ� �Է��� ��� ���� �ε��� ���� ���� ��
							board[i+1][j+1] = "X";
						}
						System.out.print(board[i][j] + " ");
					}
					System.out.println();
				}
			}
		} while(row != 99);
		System.out.println("���α׷� ����");
	}
}
