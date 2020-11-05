package com.kh.practice.date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {

	public int calcDDay(int year, int month, int date) {
		Calendar c = new GregorianCalendar();
		int todayYear = c.get(Calendar.YEAR);
		int todayMonth = c.get(Calendar.MONTH) + 1;
		int todayDate = c.get(Calendar.DATE);
		
		int pYear = 0;
		int fYear = 0;
		int pMonth = 0;
		int fMonth = 0;
		int pDate = 0;
		int fDate = 0;
		if(todayYear > year) {
			pYear = year;
			fYear = todayYear;
			
			pMonth = month;
			fMonth = todayMonth;
			
			pDate = date;
			fDate = todayDate;
		} else if(todayYear < year) {
			pYear = todayYear;
			fYear = year;
			
			pMonth = todayMonth;
			fMonth = month;
			
			pDate = todayDate;
			fDate = date;
		} else {
			if(todayMonth > month) {
				pYear = year;
				fYear = todayYear;
				
				pMonth = month;
				fMonth = todayMonth;
				
				pDate = date;
				fDate = todayDate;
//			} else if()
		}
		
		
		int sumDays = 0;
		
		for(int i = year; i < todayYear; i++) {
			if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				sumDays += 366;
			} else {
				sumDays += 365;
			}
		}
		
		if(todayYear % 4 == 0 && todayYear % 100 != 0 || todayYear % 400 == 0) {
			for(int i = 1; i < todayMonth; i++) {
				switch(i) {
				case 1: case 3: case 5: case 7:
				case 8: case 10: case 12:
					sumDays += 31;
					break;
				case 2:
					sumDays += 29;
					break;
				default:
					sumDays += 30;
				}
			}
		} else {
			for(int i = 1; i < todayMonth; i++) {
				switch(i) {
				case 1: case 3: case 5: case 7:
				case 8: case 10: case 12:
					sumDays += 31;
					break;
				case 2:
					sumDays += 28;
					break;
				default:
					sumDays += 30;
				}
			}
		}
		}
		
//		return sumDays += day;
		return 0;
	}

	public int calcDDay(int sYear, int sMonth, int sDay, int eYear, int eMonth, int eDay) {
		int sumDays = 0;
		
		for(int i = sYear; i < eYear; i++) {
			if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				sumDays += 366;
			} else {
				sumDays += 365;
			}
		}
		
		if(eYear % 4 == 0 && eYear % 100 != 0 || eYear % 400 == 0) {
			for(int i = 1; i < eMonth; i++) {
				switch(i) {
				case 1: case 3: case 5: case 7:
				case 8: case 10: case 12:
					sumDays += 31;
					break;
				case 2:
					sumDays += 29;
					break;
				default:
					sumDays += 30;
				}
			}
		} else {
			for(int i = 1; i < eMonth; i++) {
				switch(i) {
				case 1: case 3: case 5: case 7:
				case 8: case 10: case 12:
					sumDays += 31;
					break;
				case 2:
					sumDays += 28;
					break;
				default:
					sumDays += 30;
				}
			}
		}
		
		return sumDays += eDay;
	}

	public Date calcDay(int year, int month, int day, int num) {
		Calendar standard = new GregorianCalendar(year, month, day);
		long calcResult = standard.getTimeInMillis() + (num * 60 * 60 * 24 * 1000);
		Date d = new Date(calcResult);
		return d;
	}

	public String printDate(int year, int month, int day) {
		Calendar c = new GregorianCalendar(year, month, day);
		SimpleDateFormat sdf = new SimpleDateFormat("E요일");
		String result = sdf.format(c);
		return result;
	}

	public String printToday() {
		Calendar c = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 E요일");
		String result = sdf.format(c);
		return result;
	}
}
