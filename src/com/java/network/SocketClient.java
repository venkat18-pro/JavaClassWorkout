package com.java.network;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;

public class SocketClient {

	public static void main(String[] args) throws Throwable{
		Socket socket = new Socket("localhost", 3000);
		DataOutputStream output = new DataOutputStream(socket.getOutputStream());
		DataInputStream input = new DataInputStream(socket.getInputStream());
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		String in = "", out = "";
		while(!out.equals("stop")) {
			out = buf.readLine();
			output.writeUTF(out);
			output.flush();
			
			in = input.readUTF();
			System.out.println("Server: " + in);
		}
		
		output.close();
		socket.close();
		
	}
	
}
