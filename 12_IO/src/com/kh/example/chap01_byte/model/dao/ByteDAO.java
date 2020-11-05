package com.kh.example.chap01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteDAO {
	public ByteDAO() {}
	public void fileOpen() {
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("a_byte.txt");
//			while(fis.read() != -1) {
//				System.out.print((char)fis.read() + " ");
//				while문에서 이미 한번 read()를 실행했기때문에 출력이 반씩만됨
//			}
			int value;
			while((value = fis.read()) != -1) {
				System.out.print((char)value + " ");
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void fileSave() {
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream("a_byte.txt");
//			└얘는 덮어쓰기
//			fos = new FileOutputStream("a_byte.txt",true);
//			└얘는 이어쓰기 메소드 매개변수에 true도 넣으면 오버로딩해서 이어쓰기메소드가됨
			
//			write(int b):void
			fos.write(97);
//			           a
//			write(byte[] b):void
			byte[] bArr = {98,99,100,101,102,103}; 
//							b  c  d   e   f   g
			fos.write(bArr);
//			write(byte[] b, int off, int len)
			fos.write(bArr,1,3); // 1 index부터 3개
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
//		try(FileOutputStream fos2 = new FileOutputStream("a_byte.txt")){
//			fos2.write(97);
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		close 생략방법
	}
}
