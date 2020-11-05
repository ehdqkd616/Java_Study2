package com.kh.example.chap03_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.example.chap03_assist.part02_object.model.vo.Member;
public class ObjectDAO {
	public void fileSave() {
		Member[] m = {new Member("user01","pass01", "홍길동", "hong777@kh.org", 25, '남', 1250.7),
					  new Member("user02","pass02", "유관순", "you31@kh.org", 17, '여', 1221.6),
					  new Member("user03","pass03", "이순신", "lee888@kh.org", 22, '남', 1234.6)};
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object_member.txt"));){
			for(int i = 0; i < m.length; i++) {
				oos.writeObject(m[i]);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void fileOpen() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object_member.txt"));){
			
			Member[] m = new Member[3];
			
			for(int i = 0;i < m.length;i++) {
				m[i] = (Member)ois.readObject();
			}
			for(Member m2 : m) {
				System.out.println(m2);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
