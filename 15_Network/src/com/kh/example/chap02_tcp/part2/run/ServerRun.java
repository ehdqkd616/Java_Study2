package com.kh.example.chap02_tcp.part2.run;

import com.kh.example.chap02_tcp.part2.controller.Server;

public class ServerRun {
	public static void main(String[] args) {
		
		Server server = new Server();		
		server.serverStart();
		
	}
}
