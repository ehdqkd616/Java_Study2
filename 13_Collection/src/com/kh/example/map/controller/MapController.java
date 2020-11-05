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
		
		// put( : 키와 값 추가
		map.put("새우깡", new Snack("짠맛", 1500));
		map.put("다이제", new Snack("단맛", 2500));
		map.put("포테토칩", new Snack("짠맛", 1500));
		map.put("고소미", new Snack("고소한맛", 1000));
		
		System.out.println("map : " + map);
		
		map.put("새우깡", new Snack("매운맛", 1500));
		
		System.out.println("map : " + map);
		
		// containsKey(Object key)
		// containsValue(Object value)
		System.out.println(map.containsKey("새우깡"));
		System.out.println(map.containsValue(new Snack("짠맛", 1500)));
		
		System.out.println(map.get("새우깡"));
		System.out.println(map.get("홈런볼"));
		
		// map 엘리먼트 접근하기
		// 1. values() : 모든 value들을 Collection에 담아 반환
		System.out.println(map.values());

		// 2-1. keySet() : 모든 key를 set에 담아 반환
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
        
		// 3. entrySet() : 모든 entry(키+값의 쌍)객체를 set에 담아 반환
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
		
		// size() : map에 저장된 entry 수 반환
		System.out.println(map.size());
		
		// remove(Object key) : key에 해당하는 객체 삭제, 해당 값 반환
		System.out.println(map.remove("다이제"));
		
		// remove(Object key, Object value) : 해당 키와 값이 맞으면 삭제 후 true 반환
		System.out.println(map.remove("고소미", new Snack("고소한맛",1000)));
		System.out.println(map.remove("포테이토", new Snack("짠맛",1500)));
		
		System.out.println("map : " + map);
		
		// clear() : 모든 entry 삭제
		// isEmpty() : map이 비어있으면 true 반환
		map.clear();
		System.out.println(map);
		System.out.println(map.isEmpty());
	}	
	
	public void doProperties() {
		Properties prop = new Properties();
//		prop.put(1, 10);
//		System.out.println(prop);
//		Properties는 HashTable을 상속받아서 put메서드를 사용하면 키,값이 String으로 셋팅되지 않는다
		
		prop.setProperty("채소", "오이");
		prop.setProperty("과일", "사과");
		prop.setProperty("간식", "젤리");
		
		System.out.println(prop);
		
		prop.setProperty("채소", "피망");
		
		System.out.println(prop);
		
		// getProperty(String key) : key를 통해 value 반환
		System.out.println(prop.getProperty("채소"));
		System.out.println(prop.getProperty("견과"));
		
		
//		prop.getProperty(String key, String defaultValue)
//		: key를 통해 value를 반환하는데 이 때 해당 key가 없으면 지정 defaultValue 반환
		System.out.println(prop.getProperty("채소", "땅꽁"));
		System.out.println(prop.getProperty("견과", "땅꽁"));
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
			// : 저장된 정보를 바이트/문자 스트림으로 출력 저장, comments는 주석으로 저장
			prop.store(fos, "Properties Test File");
			
			// prop.storeToXML(OutputStream os, String comment);
			// : 저장된 정보를 바이트 스트림으로 xml로 출력 저장
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
			
			// loadFromXML (InputStream in) : 바이트스트림으로 저장된 xml파일의 내용을 읽어와서 propertis객체에 저장
//			prop.loadFromXML(fis);			
			
			// load(InputStream in)
			// load(Reader reader)
			// : 바이트/문자 스트림으로 저장된 파일의 내용을 읽어와서 properties객체에 저장
			prop.load(fis);
			
			System.out.println(prop);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
}



