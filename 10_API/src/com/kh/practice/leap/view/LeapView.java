package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	public LeapView() {
		Calendar c = new GregorianCalendar();
		int year = c.get(Calendar.YEAR);
		
		LeapController lc = new LeapController();
		boolean leap = lc.isLeapYear(year);
		if(leap) {
			System.out.println(year + "���� �����Դϴ�.");
		} else {
			System.out.println(year + "���� ����Դϴ�.");
		}
		System.out.println("�� ��¥ �� : " + lc.leapDate(c));
	}
}
