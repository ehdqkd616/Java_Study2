package com.kh.example.chap03_sync.thread;

import com.kh.example.chap03_sync.resource.Resources;

public class Producer extends Thread {
	
	private Resources criticalData;
	
	public Producer() {}
	public Producer(Resources resources) {
		criticalData = resources;
	}
		
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			criticalData.setData(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
	}
	
}
