package com.Socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	private static Socket client;
	private static PrintWriter pw;
	
	public static void main(String[] args) throws IOException {
		client = new Socket("localhost",8889);
		System.out.println("connect server Success!");
		OutputStream out = client.getOutputStream();
		 pw = new PrintWriter(out); 
			pw.write("ÄãºÃ,·þÎñÆ÷");
			System.out.println("message already send");
		 
	}
}
