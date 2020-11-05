package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		File f = new File(file);
		if(f.exists() == true) {
			return true;
		}else {
			return false;
		}
	}
	public void fileSave(String file, String s) {
		try (FileWriter fw = new FileWriter(file);){
			fw.write(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try (FileReader fr = new FileReader(file);){
			int value;
			while(true) {
				if((value = fr.read()) != -1) {
					sb.append((char)value);
				}else {
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb;
	}
	public void fileEdit(String file,String s) {
		try (FileWriter fw = new FileWriter(file,true);){
			fw.write(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
