package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	// 컴퓨터와 가위바위보 하는 게임
	public void rps() {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
//		String userStr = ""; //null로 하면 null.equals가 들어가기 때문에 에러남
		int count = 0;
		int win = 0;
		int draw = 0;
		
		while(true) {
			
			int comInt = (int)(Math.random() * 3); // 0, 1, 2
			String comStr = null;
			switch(comInt) {
			case 0: comStr = "가위"; break;
			case 1: comStr = "바위"; break;
			case 2: comStr = "보"; break;
			}
			
			System.out.print("가위바위보 : ");
			String userStr = sc.nextLine();
			
			
			String result = null;
			String winStr = "이겼습니다 !";
			String loseStr = "졌습니다 ㅠㅠ";
			
			if(userStr.equals("바위") || userStr.equals("가위") || userStr.equals("보")) {				
				if(comStr.equals(userStr)) {
					result = "비겼습니다.";
					draw++;
				} else {
					if(comStr.equals("가위")) {
						switch(userStr) {
						case "바위": result = winStr; win++; break;
						case "보": result = loseStr; break;
						}
					} else if(comStr.equals("바위")) {
						if(userStr.equals("보")) {
							result = winStr;
							win++;
						} else {
							result = loseStr;
						}
					} else {
						result = userStr.equals("가위") ? winStr : loseStr;
						if(result.equals(winStr)) {
							win++;
						}
					}
				}
//				count++;
			} else if(!userStr.equals("exit")){
				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
				continue;
			} else {
				break;
			}
			count++;
			System.out.println("컴퓨터 : " + comStr);
			System.out.println(name + " : " + userStr);
			System.out.println(result);
			System.out.println();
		}
		
//		System.out.println(count + "전 " + win + "승 " + draw + "무 " + (count-win-draw) + "패");
		System.out.printf("%d전 %d승 %d무 %d패", count, win, draw, (count-win-draw));
	}
}
