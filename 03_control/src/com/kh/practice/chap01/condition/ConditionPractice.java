package com.kh.practice.chap01.condition;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default:
			System.out.println("잘못입력하였습니다.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();

		int sum = kor + math + eng;
		double avg = sum / 3.0;

		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		String season = null;

		switch (num) {
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:
			season = "잘못 입력된 달";
		}

		System.out.println(num + "월은 " + season + "입니다.");
	}

	public void practice5() {
		String id = "myId";
		String pw = "myPassword12";

		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String userPw = sc.nextLine();

//		if(id.equals(userId) && pw.equals(userPw)) {
//			System.out.println("로그인 성공");
//		} else if(id.equals(userId)) {
//			System.out.println("비밀번호가 틀렸습니다.");
//		} else if(pw.equals(userPw)) {
//			System.out.println("아이디가 틀렸습니다.");
//		}

		if (id.equals(userId)) {
			if (pw.equals(userPw)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");

		switch (sc.nextLine()) {
		case "관리자":
			System.out.print("회원관리, 게시글 관리 ");
		case "회원":
			System.out.print("게시글 작성, 댓글 작성 ");
		case "비회원":
			System.out.print("게시글 조회 ");
			break;
		// 관리자일 때는 관리자 기능부터 비회원 기능까지 모두 기능이 가능하고
		// 회원일 때는 회원 기능부터 비회원 기능까지,
		// 비회원일 때는 비회원 기능만 가능하도록 만든 switch문
		// 마지막 비회원에 break를 걸어준 이유는 default문까지 넘어가지 않게 하기 위해서이다.
		default:
			System.out.println("잘못입력하셨습니다.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();

		double bmi = weight / (height * height);

		System.out.println("BMI 지수 : " + bmi);

		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi < 25) {
			System.out.println("과체중");
		} else if (bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도 비만");
		}

		if (bmi >= 30) {
			System.out.println("고도 비만");
		} else if (bmi >= 25) {
			System.out.println("비만");
		} else if (bmi >= 23) {
			System.out.println("과체중");
		} else if (bmi >= 18.5) {
			System.out.println("정상 체중");
		} else {
			System.out.println("저체중");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);

		double result = 0;
		
		// 중첩 if문
		if (num1 > 0 && num2 > 0) { // 공통된 조건
			
			switch(ch) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = (double)num1 / num2; break;
			case '%': result = num1 % num2; break;
			default: System.out.println("연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
			
			if(ch == '/')
				System.out.printf("%d %c %d = %f", num1, ch, num2, result);
			else if(ch == '+' || ch == '-' || ch == '*' || ch == '%')
				System.out.printf("%d %c %d = %d", num1, ch, num2, (int)result);
		} else {
			System.out.println("양수만을 입력해주세요. 프로그램을 종료합니다.");
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("중간 고사 점수 : ");
		int midTerm = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		int finalTerm = sc.nextInt();

		System.out.print("과제  점수 : ");
		int homework = sc.nextInt();

		System.out.print("출석 회수 : ");
		int attendance = sc.nextInt();

		System.out.println("================= 결과 =================");
		if (!(attendance < 20 * 0.7)) { // 30% 이상 결석 시 Fail이므로

			System.out.println("중간 고사 점수(20) : " + midTerm * 0.2);
			System.out.println("기말 고사 점수(30) : " + finalTerm * 0.3);
			System.out.println("과제 점수       (30) : " + homework * 0.3);
			System.out.println("출석 점수       (20) : " + (attendance / 20.0 * 100 * 0.2));

			double sum = midTerm * 0.2 + finalTerm * 0.3 + homework * 0.3 + (attendance / 20.0 * 100 * 0.2);
			// attendance / 20.0 * 100 은 총 출석한 날짜를 가지고 100점 만점으로 환산하는 계산

			System.out.println("총점 : " + sum);

			if (sum >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
		} else {
			System.out.println("Fail [출석 회수 부족 (" + attendance + "/20)]");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);

		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");

		System.out.print("선택 : ");
		switch (sc.nextInt()) { //굳이 변수에 넣지 않아도 된다.

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
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		int pwd;

		System.out.print("비밀번호 입력(1000~9999) : ");
		pwd = sc.nextInt();
		
		// 1) 자리수 검사
		if (pwd >= 1000 && pwd <= 9999) { // 4자리 정수일 경우
			
			String stringPw = String.valueOf(pwd);
			
			// 2) 각 자리수의 값을 저장할 변수 선언
			String pw1 = stringPw.substring(0, 1);
			String pw2 = stringPw.substring(1, 2);
			String pw3 = stringPw.substring(2, 3);
			String pw4 = stringPw.substring(3, 4);

			// 3) 중복 검사
			// 중복 검사용 임시 변수
			boolean check = false;

			// 중복되는 값이 있을 시 check = false, 없을 경우 true
			if (!pw1.equals(pw2) && !pw1.equals(pw3) && !pw1.equals(pw4)) {
				if (!pw2.equals(pw3) && !pw2.equals(pw4)) {
					if (!pw3.equals(pw4)) {
						check = true;
					}
				}
			}

			// 4) 결과 출력
			if (check)
				System.out.println("성공");
			else
				System.out.println("실패");

		} else {
			System.out.println("자리수 안맞음");
		}

	}
	
	public void practice12() { // baek
		Scanner sc = new Scanner(System.in);
		int pwd;

		System.out.print("비밀번호 입력(1000~9999) : ");
		pwd = sc.nextInt();

		// 1) 자리수 검사
		// (pwd/1000) > 0 --> 3자리 초과
		// (pwd/1000) < 10) --> 5자리 미만
		if ((pwd / 1000) > 0 && (pwd / 1000) < 10) { // 4자리 정수일 경우

			// 2) 각 자리수의 값을 저장할 변수 선언
			int num1000, num100, num10, num1;

			num1000 = pwd / 1000;
			num100 = pwd % 1000 / 100;
			num10 = pwd % 100 / 10;
			num1 = pwd % 10;

			// 3) 중복 검사
			// 중복 검사용 임시 변수
			boolean check = false;

			// 중복되는 값이 있을 시 check = false, 없을 경우 true
			if ((num1000 != num100) && (num1000 != num10) && (num1000 != num1)) {
				if ((num100 != num10) && (num100 != num1)) {
					if (num10 != num1) {
						check = true;
					}
				}
			}

			// 4) 결과 출력
			if (check)
				System.out.println("성공");
			else
				System.out.println("실패");

		} else {
			System.out.println("자리수 안맞음");
		}
	}
	
	public void practice13() { // 배운 것만으로 해보자
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999) : ");
		String pwd = sc.nextLine();
		char first = pwd.charAt(0);
		
		if(first == '0') {
			System.out.println("자리수 안 맞음");
		} else {
			char second = pwd.charAt(1);
			char third = pwd.charAt(2);
			char fourth = pwd.charAt(3);
			
			if(first != second && first != third && first != fourth
					&& second != third && second != fourth
					&& third != fourth) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
		}
		
	}
}
