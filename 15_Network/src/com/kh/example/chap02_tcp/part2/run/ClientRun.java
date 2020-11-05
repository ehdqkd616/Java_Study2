package com.kh.example.chap02_tcp.part2.run;

import com.kh.example.chap02_tcp.part2.controller.Client;

public class ClientRun {
	public static void main(String[] args) {
		
		Client client = new Client();
		client.startClient();
	}
}
