package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
	// 1���� 100 ������ ���� �߿��� ������ ������ ������
	// ����ڴ� ������ ������ ���ߴµ� �� ������ ���ߴ������� ���
	public void whileTrue() {
		Scanner sc = new Scanner(System.in); // ����ڰ� ���� �Է��ؾ��ϴ� Scanner

		// 1. ������ ���� �̱�
		int random = (int) (Math.random() * 100) + 1;
		System.out.println(random);

		// 2. �� ������ ������� ���� ���� ����
		int count = 0;

		while (true) {
			// 3. ����ڿ��� ���� �ޱ�
			System.out.print("1~100 ������ ������ ������ ���纸���� : ");
			int user = sc.nextInt();

			// 4. ����ڰ� �Է��� ���� 1~100 ������ �������� Ȯ��
			if (user >= 1 && user <= 100) {
				// 5. ����ڰ� �Է��� ���� ���� ���� ������ �ٸ��� Ȯ��
				if (user != random) { // 5-1. ���� �ٸ��ٸ�
					// 6. �Է��� ���� random ������ ū�� ������ Ȯ��
					if (user > random) { // 6-1. ����� ���� random ������ Ŭ ��
						System.out.println("DOWN !");
//						count++; // Ʋ�ȱ� ������ Ƚ�� 1 ����
					} else { // 6-2. ����� ���� random ������ ���� ��
						System.out.println("UP !");
//						count++;
					}
					count++;
					// ������ ���� count++�̶�� ���� �������� count++�� �ֵ� ������
				} else { // 5-2. ���� ���ٸ�
					count++; // ���� �͵� Ƚ���� ���� ������
					System.out.println("�����Դϴ� !!");
					System.out.println(count + "ȸ���� ���߼̽��ϴ�.");
					break;
				}

			} else {
				System.out.println("1~100 ������ ���ڸ� �Է����ּ���.");
			} // ������ ���ڸ� �Է����� �ʾ����� �ٽ� �޾ƾ� �ϱ� ������ while���� ��������
		}
	}

	public void whileCondition() {
		Scanner sc = new Scanner(System.in); // ����ڰ� ���� �Է��ؾ��ϴ� Scanner

		// 1. ������ ���� �̱�
		int random = (int) (Math.random() * 100) + 1;
		System.out.println(random);

		// 2. �� ������ ������� ���� ���� ����
		int count = 0;

		// 3. ����ڿ��� ���� ���� ���� �̸� ���� �� �ʱ�ȭ
		int user = 0;

		while (user != random) {
			// 4. ����ڿ��� ���� �ޱ�
			System.out.print("1~100 ������ ������ ������ ���纸���� : ");
			user = sc.nextInt();

			// 5. ����ڰ� �Է��� ���� 1~100 ������ �������� Ȯ��
			if (user >= 1 && user <= 100) {
				// 6. ����ڰ� �Է��� ���� ���� ���� ������ �ٸ��� Ȯ��
				if (user != random) { // 6-1. ���� �ٸ��ٸ�
					// 7. �Է��� ���� random ������ ū�� ������ Ȯ��
					if (user > random) { // 7-1. ����� ���� random ������ Ŭ ��
						System.out.println("DOWN !");
//						count++; // Ʋ�ȱ� ������ Ƚ�� 1 ����
					} else { // 7-2. ����� ���� random ������ ���� ��
						System.out.println("UP !");
//						count++;
					}
					count++;
					// ������ ���� count++�̶�� ���� �������� count++�� �ֵ� ������
				} else {// 6-2. ���� ���ٸ�
					count++; // ���� �͵� Ƚ���� ���� ������
					System.out.println("�����Դϴ� !!");
					System.out.println(count + "ȸ���� ���߼̽��ϴ�.");
				}

			} else {
				System.out.println("1~100 ������ ���ڸ� �Է����ּ���.");
			} // ������ ���ڸ� �Է����� �ʾ����� �ٽ� �޾ƾ� �ϱ� ������ while���� ��������
		}
	}

	public void doWhile() {
		Scanner sc = new Scanner(System.in); // ����ڰ� ���� �Է��ؾ��ϴ� Scanner

		// 1. ������ ���� �̱�
		int random = (int) (Math.random() * 100) + 1;
		System.out.println(random);

		// 2. �� ������ ������� ���� ���� ����
		int count = 0;

		// 3. ����ڿ��� ���� ���� ���� �̸� ���� �� �ʱ�ȭ
		int user = 0;

		do {
			// 4. ����ڿ��� ���� �ޱ�
			System.out.print("1~100 ������ ������ ������ ���纸���� : ");
			user = sc.nextInt();

			// 5. ����ڰ� �Է��� ���� 1~100 ������ �������� Ȯ��
			if (user >= 1 && user <= 100) {
				// 6. ����ڰ� �Է��� ���� ���� ���� ������ �ٸ��� Ȯ��
				if (user != random) { // 6-1. ���� �ٸ��ٸ�
					// 7. �Է��� ���� random ������ ū�� ������ Ȯ��
					if (user > random) { // 7-1. ����� ���� random ������ Ŭ ��
						System.out.println("DOWN !");
//						count++; // Ʋ�ȱ� ������ Ƚ�� 1 ����
					} else { // 7-2. ����� ���� random ������ ���� ��
						System.out.println("UP !");
//						count++;
					}
					count++;
					// ������ ���� count++�̶�� ���� �������� count++�� �ֵ� ������
				} else {// 6-2. ���� ���ٸ�
					count++; // ���� �͵� Ƚ���� ���� ������
					System.out.println("�����Դϴ� !!");
					System.out.println(count + "ȸ���� ���߼̽��ϴ�.");
				}
			} else {
				System.out.println("1~100 ������ ���ڸ� �Է����ּ���.");
			} // ������ ���ڸ� �Է����� �ʾ����� �ٽ� �޾ƾ� �ϱ� ������ while���� ��������
		} while (user != random);
	}
}
