package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
	// 1부터 100 사이의 정수 중에서 임의의 난수가 정해짐
	// 사용자는 임의의 난수를 맞추는데 몇 번만에 맞추는지까지 출력
	public void whileTrue() {
		Scanner sc = new Scanner(System.in); // 사용자가 값을 입력해야하니 Scanner

		// 1. 임의의 난수 뽑기
		int random = (int) (Math.random() * 100) + 1;
		System.out.println(random);

		// 2. 몇 번만에 맞췄는지 담을 변수 생성
		int count = 0;

		while (true) {
			// 3. 사용자에게 값을 받기
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int user = sc.nextInt();

			// 4. 사용자가 입력한 값이 1~100 사이의 숫자인지 확인
			if (user >= 1 && user <= 100) {
				// 5. 사용자가 입력한 값과 랜덤 값이 같은지 다른지 확인
				if (user != random) { // 5-1. 값이 다르다면
					// 6. 입력한 값이 random 값보다 큰지 작은지 확인
					if (user > random) { // 6-1. 사용자 값이 random 값보다 클 때
						System.out.println("DOWN !");
//						count++; // 틀렸기 때문에 횟수 1 증가
					} else { // 6-2. 사용자 값이 random 값보다 작을 때
						System.out.println("UP !");
//						count++;
					}
					count++;
					// 어차피 같은 count++이라면 가장 마지막에 count++을 둬도 괜찮음
				} else { // 5-2. 값이 같다면
					count++; // 맞춘 것도 횟수에 들어가기 때문에
					System.out.println("정답입니다 !!");
					System.out.println(count + "회만에 맞추셨습니다.");
					break;
				}

			} else {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
			} // 사이의 숫자를 입력하지 않았으면 다시 받아야 하기 때문에 while문을 덮어주자
		}
	}

	public void whileCondition() {
		Scanner sc = new Scanner(System.in); // 사용자가 값을 입력해야하니 Scanner

		// 1. 임의의 난수 뽑기
		int random = (int) (Math.random() * 100) + 1;
		System.out.println(random);

		// 2. 몇 번만에 맞췄는지 담을 변수 생성
		int count = 0;

		// 3. 사용자에게 값을 받을 공간 미리 선언 및 초기화
		int user = 0;

		while (user != random) {
			// 4. 사용자에게 값을 받기
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			user = sc.nextInt();

			// 5. 사용자가 입력한 값이 1~100 사이의 숫자인지 확인
			if (user >= 1 && user <= 100) {
				// 6. 사용자가 입력한 값과 랜덤 값이 같은지 다른지 확인
				if (user != random) { // 6-1. 값이 다르다면
					// 7. 입력한 값이 random 값보다 큰지 작은지 확인
					if (user > random) { // 7-1. 사용자 값이 random 값보다 클 때
						System.out.println("DOWN !");
//						count++; // 틀렸기 때문에 횟수 1 증가
					} else { // 7-2. 사용자 값이 random 값보다 작을 때
						System.out.println("UP !");
//						count++;
					}
					count++;
					// 어차피 같은 count++이라면 가장 마지막에 count++을 둬도 괜찮음
				} else {// 6-2. 값이 같다면
					count++; // 맞춘 것도 횟수에 들어가기 때문에
					System.out.println("정답입니다 !!");
					System.out.println(count + "회만에 맞추셨습니다.");
				}

			} else {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
			} // 사이의 숫자를 입력하지 않았으면 다시 받아야 하기 때문에 while문을 덮어주자
		}
	}

	public void doWhile() {
		Scanner sc = new Scanner(System.in); // 사용자가 값을 입력해야하니 Scanner

		// 1. 임의의 난수 뽑기
		int random = (int) (Math.random() * 100) + 1;
		System.out.println(random);

		// 2. 몇 번만에 맞췄는지 담을 변수 생성
		int count = 0;

		// 3. 사용자에게 값을 받을 공간 미리 선언 및 초기화
		int user = 0;

		do {
			// 4. 사용자에게 값을 받기
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			user = sc.nextInt();

			// 5. 사용자가 입력한 값이 1~100 사이의 숫자인지 확인
			if (user >= 1 && user <= 100) {
				// 6. 사용자가 입력한 값과 랜덤 값이 같은지 다른지 확인
				if (user != random) { // 6-1. 값이 다르다면
					// 7. 입력한 값이 random 값보다 큰지 작은지 확인
					if (user > random) { // 7-1. 사용자 값이 random 값보다 클 때
						System.out.println("DOWN !");
//						count++; // 틀렸기 때문에 횟수 1 증가
					} else { // 7-2. 사용자 값이 random 값보다 작을 때
						System.out.println("UP !");
//						count++;
					}
					count++;
					// 어차피 같은 count++이라면 가장 마지막에 count++을 둬도 괜찮음
				} else {// 6-2. 값이 같다면
					count++; // 맞춘 것도 횟수에 들어가기 때문에
					System.out.println("정답입니다 !!");
					System.out.println(count + "회만에 맞추셨습니다.");
				}
			} else {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
			} // 사이의 숫자를 입력하지 않았으면 다시 받아야 하기 때문에 while문을 덮어주자
		} while (user != random);
	}
}
