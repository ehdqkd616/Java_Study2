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
		
		//값기록
		for(int i = 0; i < arr.length-1; i++){
			for(int j = 0; j < arr[i].length-1; j++){
				arr[i][j] = (int)(Math.random() * 10) + 1; 
			}
		}

		//계산처리	
		for(int i = 0; i < arr.length-1; i++){
			for(int j = 0; j < arr[i].length-1; j++){
				arr[i][3] += arr[i][j];
				arr[3][i] += arr[i][j];
			}
			
		}
		for(int i = 0; i < arr.length-1; i++) {
			arr[3][3] += arr[i][3] + arr[3][i];
		}
		
		//출력확인
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice5(){
		Scanner sc = new Scanner(System.in);
		System.out.print("행 크기 : ");
		int row = sc.nextInt();
		System.out.print("열 크기 : ");
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
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원", "열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				// 지금까지 읽어왔던 흐름은
				// (0,1) (0, 1), (0, 2), (0, 3), (0, 4), // (1, 0), (1, 1), (1, 2), (1, 3), (1,
				// 4), // (2, 0), ....
				// 행이 한 번 변하고 열이 계속 바뀌는 흐름

				// 현재 읽어야하는 흐름은
				// (0,0) (1, 0), (2, 0), (3, 0), (4, 0), // (0, 1), (1, 1), (2, 1), (3, 1), (4,
				// 1), // (0, 2), ....
				// 열이 한번 변하고 행이 계속 바뀌는 흐름

				System.out.print(strArr[j][i] + " ");
				// 따라서 계속 안에서 돌고있는 j를 앞에 둬서 행으로, j가 다 돌면 바뀌는 i를 뒤에 둬서 열로 둔다.
			}
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 : ");
		int row = sc.nextInt(); // 행 크기 대입

		char[][] charArr = new char[row][]; // 문자형 가변 배열 생성
		for (int i = 0; i < row; i++) {
			System.out.print(i + "행의 열 크기 : ");
			charArr[i] = new char[sc.nextInt()];
		}

		char data = 'a'; // 처음 입력할 값
		for (int i = 0; i < charArr.length; i++) {
			for (int j = 0; j < charArr[i].length; j++) {
				charArr[i][j] = data;
				data++;
				// 위의 두 줄을 아래 한 줄로 바꿀 수 있음
				// charArr[i][j] = data++;

				System.out.print(charArr[i][j] + " ");
			}
			System.out.println(); // 행의 구분을 주기 위한 개행
		}
	}
	
	public void practice8() {
		String[] student = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String[][] seat1 = new String[3][2]; // 1분단
		String[][] seat2 = new String[3][2]; // 2분단
		
		int count = 0;
		// 1분단이 끝나고 2분단이 시작될 때도 이어서 들어가야하기 때문에
		// 학생을 이어서 셀 수 있도록 count 변수 생성
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < seat1.length; i++){
			for(int j = 0; j < seat1[i].length; j++){
				seat1[i][j] = student[count];
				count++;
				System.out.print(seat1[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
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
		String[] student = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		int count = 0;
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < seat1.length; i++){
			for(int j = 0; j <seat1[i].length; j++){
				seat1[i][j] = student[count];
				count++;
				System.out.print(seat1[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
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

		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		String partName = ""; // 분단
		String rowName = ""; // 몇 번째 줄
		String colName = ""; // 왼쪽 오른쪽
		
		for(int i = 0; i < seat1.length; i++){
			for(int j = 0; j < seat1[i].length; j++){
				if(seat1[i][j].equals(name)) {
					partName = "1분단";
					if(i == 0){
						rowName = "첫 번째 줄";
					}else if(i == 1){
						rowName = "두 번째 줄";
					}else{
						rowName = "세 번째 줄";
					}
					if(j == 0){
						colName = "왼쪽";
					}else{
						colName = "오른쪽";
					}
					
					break;
				}
			}
		}
		
		for(int i = 0; i < seat2.length; i++){
			for (int j = 0; j < seat2[i].length; j++){
				if(seat2[i][j].equals(name)){
					partName = "2분단";
					if(i == 0){
						rowName = "첫 번째 줄";
					}else if(i == 1){
						rowName = "두 번째 줄";
					}else{
						rowName = "세 번째 줄";
					}
					if(j == 0){
						colName = "왼쪽";
					}else{
						colName = "오른쪽";
					}
					
					break;
				}
			}
		}
		
		System.out.println("검색하신 " + name + " 학생은 " + partName + " " + rowName + " " + colName + "에 있습니다.");
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		String[][] board = new String[6][6]; // String형 6행 6열 2차원 배열 생성
		
		// null로 초기화 되어 있는 모든 값을 " "로 변경
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = " ";
			}
		}
		
		// 숫자 넣어주기
		/***
		 	     0 1 2 3 4 5 (실제 배열 행 인덱스)
		 	   0   0 1 2 3 4 (출력 배열 행 인덱스)
		 	   1 0
		 	   2 1       
		 	   3 2
		 	   4 3
		 	   5 4
		   (실열) (출열) 
		 	
		 */
		for(int i = 0; i < board.length-1; i++) {
			board[0][i+1] = i + "";
			board[i+1][0] = i + "";
			// "" 를 붙임으로 해서 i가 String 값이 됨
		}
		
		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();

		System.out.print("열 인덱스 입력 : ");
		int column = sc.nextInt();
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i == row && j == column) { // 사용자가 입력한 행과 열의 인덱스 값이 같을 때
					board[i+1][j+1] = "X";
				}
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		String[][] board = new String[6][6]; // String형 6행 6열 2차원 배열 생성
		
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
			System.out.print("행 인덱스 입력 : ");
			row = sc.nextInt();
			
			if(row != 99) {				
				System.out.print("열 인덱스 입력 : ");
				column = sc.nextInt();
				
				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[i].length; j++) {
						if (i == row && j == column) { // 사용자가 입력한 행과 열의 인덱스 값이 같을 때
							board[i+1][j+1] = "X";
						}
						System.out.print(board[i][j] + " ");
					}
					System.out.println();
				}
			}
		} while(row != 99);
		System.out.println("프로그램 종료");
	}
}
