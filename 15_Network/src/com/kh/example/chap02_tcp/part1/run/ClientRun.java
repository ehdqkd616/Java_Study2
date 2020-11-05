package com.kh.example.chap02_tcp.part1.run;

import com.kh.example.chap02_tcp.part1.controller.Client;

public class ClientRun {
	public static void main(String[] args) {
		Client client = new Client();
		client.startClient();
	}
}
