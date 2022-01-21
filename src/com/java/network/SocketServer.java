package com.java.network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.*;

public class SocketServer {

	public static void main(String[] args) throws Throwable {
		ServerSocket ss = new ServerSocket(3000);
		System.out.println("Server is waiting for the client connection..");
		Socket socket = ss.accept();
		DataInputStream input = new DataInputStream(socket.getInputStream());
		DataOutputStream output = new DataOutputStream(socket.getOutputStream());
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		String out = "", in = "";
		while(!out.equals("stop")) {
			out = input.readUTF();
			System.out.println("Client: " + out);
			in = buf.readLine();
			output.writeUTF("Hello venkat.");
			output.flush();
		}
		
		input.close();
		socket.close();
		ss.close();
	}
	
	
}
