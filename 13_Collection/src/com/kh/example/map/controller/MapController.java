package com.kh.example.map.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.model.vo.Snack;
import com.kh.example.model.compare.SnackCompare;

public class MapController {
	public void doMap() {
		
		HashMap<String, Snack> map = new HashMap<String, Snack>();
		
		// put( : Ű�� �� �߰�
		map.put("�����", new Snack("§��", 1500));
		map.put("������", new Snack("�ܸ�", 2500));
		map.put("������Ĩ", new Snack("§��", 1500));
		map.put("��ҹ�", new Snack("����Ѹ�", 1000));
		
		System.out.println("map : " + map);
		
		map.put("�����", new Snack("�ſ��", 1500));
		
		System.out.println("map : " + map);
		
		// containsKey(Object key)
		// containsValue(Object value)
		System.out.println(map.containsKey("�����"));
		System.out.println(map.containsValue(new Snack("§��", 1500)));
		
		System.out.println(map.get("�����"));
		System.out.println(map.get("Ȩ����"));
		
		// map ������Ʈ �����ϱ�
		// 1. values() : ��� value���� Collection�� ��� ��ȯ
		System.out.println(map.values());

		// 2-1. keySet() : ��� key�� set�� ��� ��ȯ
		Set<String> set1 = map.keySet();
		System.out.println("set1 : " + set1);
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			System.out.println(key + " - " + map.get(key));
		}
		
		System.out.println();
		
		for(String key : map.keySet()) {
			System.out.println(key + " - " + map.get(key));
		}
		
		System.out.println();
		
		 // 2-2 keySet() 
        for (String key : map.keySet()) {
            Snack value = map.get(key);
            System.out.println("[key]:" + key + ", [value]:" + value);
        }
		
		System.out.println();
        
		// 3. entrySet() : ��� entry(Ű+���� ��)��ü�� set�� ��� ��ȯ
		Set<Entry<String, Snack>> set2 = map.entrySet();
		Iterator<Entry<String, Snack>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		System.out.println();
		
		for(Entry<String, Snack> e : map.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		
		System.out.println();
		
		// 4. TreeMap()
		TreeMap<String, Snack> map2 = new TreeMap<String, Snack>();
		map2.putAll(map);
		System.out.println(map2);
		
		System.out.println();
		
		TreeMap<String, Snack> map3 = new TreeMap<String, Snack>(new SnackCompare());
		map3.putAll(map);
		System.out.println(map3);
		
		// size() : map�� ����� entry �� ��ȯ
		System.out.println(map.size());
		
		// remove(Object key) : key�� �ش��ϴ� ��ü ����, �ش� �� ��ȯ
		System.out.println(map.remove("������"));
		
		// remove(Object key, Object value) : �ش� Ű�� ���� ������ ���� �� true ��ȯ
		System.out.println(map.remove("��ҹ�", new Snack("����Ѹ�",1000)));
		System.out.println(map.remove("��������", new Snack("§��",1500)));
		
		System.out.println("map : " + map);
		
		// clear() : ��� entry ����
		// isEmpty() : map�� ��������� true ��ȯ
		map.clear();
		System.out.println(map);
		System.out.println(map.isEmpty());
	}	
	
	public void doProperties() {
		Properties prop = new Properties();
//		prop.put(1, 10);
//		System.out.println(prop);
//		Properties�� HashTable�� ��ӹ޾Ƽ� put�޼��带 ����ϸ� Ű,���� String���� ���õ��� �ʴ´�
		
		prop.setProperty("ä��", "����");
		prop.setProperty("����", "���");
		prop.setProperty("����", "����");
		
		System.out.println(prop);
		
		prop.setProperty("ä��", "�Ǹ�");
		
		System.out.println(prop);
		
		// getProperty(String key) : key�� ���� value ��ȯ
		System.out.println(prop.getProperty("ä��"));
		System.out.println(prop.getProperty("�߰�"));
		
		
//		prop.getProperty(String key, String defaultValue)
//		: key�� ���� value�� ��ȯ�ϴµ� �� �� �ش� key�� ������ ���� defaultValue ��ȯ
		System.out.println(prop.getProperty("ä��", "����"));
		System.out.println(prop.getProperty("�߰�", "����"));
	}
	
	public void fileSave() {
		try (FileOutputStream fos = new FileOutputStream("test.properties");) {
//		try (FileOutputStream fos = new FileOutputStream("test.xml");) {
			
			Properties prop = new Properties();
			prop.setProperty("title", "Properties Practice");
			prop.setProperty("width", "1920");
			prop.setProperty("height", "1080");
			prop.setProperty("language", "kor");
			
			// store(OuputStream out, String comments)
			// store(Writer writer, String comments)
			// : ����� ������ ����Ʈ/���� ��Ʈ������ ��� ����, comments�� �ּ����� ����
			prop.store(fos, "Properties Test File");
			
			// prop.storeToXML(OutputStream os, String comment);
			// : ����� ������ ����Ʈ ��Ʈ������ xml�� ��� ����
//			prop.storeToXML(fos, "storeToXML Test");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
				
	}
	
	public void fileOpen() {
		
//		try (FileInputStream fis = new FileInputStream("test.xml");) {
		try (FileInputStream fis = new FileInputStream("test.properties");) {
			
			Properties prop = new Properties();
			
			// loadFromXML (InputStream in) : ����Ʈ��Ʈ������ ����� xml������ ������ �о�ͼ� propertis��ü�� ����
//			prop.loadFromXML(fis);			
			
			// load(InputStream in)
			// load(Reader reader)
			// : ����Ʈ/���� ��Ʈ������ ����� ������ ������ �о�ͼ� properties��ü�� ����
			prop.load(fis);
			
			System.out.println(prop);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
}



