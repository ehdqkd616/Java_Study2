package com.kh.example.chap02_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileSave() {
//		FileWriter fw = null;
//		try {
//			fw = new FileWriter("b_char.txt");
//			
//			fw.write("와, IO 정말 재ㅁ...");
//			fw.write('A');
//			fw.write(' ');
//			char[] cArr = {'a','p','p','l','e'};
//			fw.write(cArr);
//		}catch(IOException e) {
//			e.printStackTrace();
//		}finally {
//			if(fw != null) {
//				try {
//					fw.close();
//				}catch(IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
		try (FileWriter fw = new FileWriter("b_char.txt")){
			fw.write("와, IO 정말 재ㅁ...");
			fw.write('A');
			fw.write(' ');
			char[] cArr = {'a','p','p','l','e'};
			fw.write(cArr);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void fileOpen() {
//		FileReader fr = null;
//		try {
//			fr = new FileReader("b_char.txt");
//			
//			
//			int value;
//			while((value = fr.read()) != -1) {
//				System.out.print((char)value + " ");
//			}
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				fr.close();
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
		try (FileReader fr = new FileReader("b_char.txt")){
			int value;
			while((value = fr.read()) != -1) {
				System.out.print((char)value + " ");
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
