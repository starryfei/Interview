package com.Socket;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
	private ServerSocket server;
	private Socket socket;
	private InputStreamReader isr;
	private BufferedReader br;
	private InputStream in;

	public Server() throws IOException {
		server = new ServerSocket(8889);
	}

	@Override
	public void run() {
		try {
	        	
				System.out.println("waiting client connect..");
				socket = server.accept();
				in = socket.getInputStream();
				isr = new InputStreamReader(in);
				br = new BufferedReader(isr);
				String info = null;
//				if ((info = br.readLine()) != null) {
//					System.out.println("接收客户端发过来的信息！");
					System.out.println(br.readLine());
//					}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}/* finally {
				
					try {
						br.close();
						isr.close();
						in.close();
						socket.close();
						server.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}*/ 
			}
	
	public static void main(String[] args) throws IOException {
		Server se = new Server();
		Thread t = new Thread(se);
		t.start();
	}
}
