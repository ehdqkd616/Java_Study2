package com.kh.example.chap03_sync.run;

import com.kh.example.chap03_sync.resource.Resources;
import com.kh.example.chap03_sync.thread.Consumer;
import com.kh.example.chap03_sync.thread.Producer;

public class Run {
	public static void main(String[] args) {
		Resources resource = new Resources();
		
		Producer p = new Producer(resource);
		Consumer c = new Consumer(resource);
		
		p.start();
		c.start();
		
	}

}
