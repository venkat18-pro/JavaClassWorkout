package com.java.network;

import java.net.Socket;
import java.io.DataOutputStream;

public class SocketClient {

	public static void main(String[] args) throws Throwable{
		Socket socket = new Socket("localhost", 3000);
		DataOutputStream data = new DataOutputStream(socket.getOutputStream());
		data.writeUTF("Hello I am venkat.");
		data.flush();
		data.close();
		socket.close();
		
	}
	
}
