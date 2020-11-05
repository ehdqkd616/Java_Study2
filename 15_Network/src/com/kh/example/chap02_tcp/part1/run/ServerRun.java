package com.kh.example.chap02_tcp.part1.run;

import com.kh.example.chap02_tcp.part1.controller.Server;

public class ServerRun {
	public static void main(String[] args) {
		
		Server server = new Server();		
		server.serverStart();
		
	}
}
