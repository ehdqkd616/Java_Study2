package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public FileController() {}
	public void method1() {
		try {
			File f1 = new File("text.txt");
			f1.createNewFile();
			
			File f2 = new File("c:/test/test.txt");
			f2.createNewFile();
			
			File f3 = new File("c:\\temp3\\temp2");
			File f4 = new File("c:\\temp3\\temp2\\text.txt");
			f3.mkdirs();
			f4.createNewFile();
			f4.delete();
			
			System.out.println(f2.exists()); // true 파일or폴더가 존재하냐
			System.out.println(f3.exists()); // true 파일or폴더가 존재하냐
			System.out.println(f3.isFile()); // false 이거 파일이냐 아니냐
			//그 외 메소드들
			System.out.println("파일 명 : " + f1.getName());
			System.out.println("저장 절대 경로 : " + f1.getAbsolutePath());
			System.out.println("저장 상대 경로 : " + f1.getPath());
//			절대 경로 : 변하지 않는 경로
//			상대 경로 : 내 위치에 따라 변하는 경로
//			ex) "c:\\temp3\\temp2\\text.txt" 일때
//			temp2폴더에서 text.txt의 경로를 불러올경우 
//			절대 경로는 c:\temp3\temp2\text.txt 이고
//			상대 경로는 text.txt이다.
			System.out.println("파일 용량 : " + f1.length());
			System.out.println("파일 용량 : " + f2.length());
			System.out.println("f1 상위 폴더 : " + f1.getParent());
			System.out.println("f4 상위 폴더 : " + f4.getParent());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
