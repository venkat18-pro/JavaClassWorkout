package com.java.network;

import java.io.DataInputStream;
import java.net.*;

public class SocketServer {

	public static void main(String[] args) throws Throwable {
		ServerSocket ss = new ServerSocket(3000);
		System.out.println("Server is waiting for the client connection..");
		Socket socket = ss.accept();
		DataInputStream data = new DataInputStream(socket.getInputStream());
		String str = data.readUTF();
		System.out.println("Port Number: "+ ss.getLocalPort());
		System.out.println("User Message: "+ str);
		System.out.println("Buffer size: " + ss.getReceiveBufferSize());
		ss.close();
	}
	
	
}
