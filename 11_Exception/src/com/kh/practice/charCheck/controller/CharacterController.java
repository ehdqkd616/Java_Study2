package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {}
	public int countAlpha(String s) throws CharCheckException{
		char ch = 0;
		int count = 0;
		for(int i = 0;i < s.length();i++) {
			ch = s.charAt(i);
			if(ch >= 65 && ch <= 122) {
				count++;
			}else if(ch == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			}
		}
		return count;
	}
}
