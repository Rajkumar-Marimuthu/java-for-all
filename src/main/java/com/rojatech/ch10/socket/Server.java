package com.rojatech.ch10.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(8080);
			System.out.println("waiting for the client to connect on port 8080");
			Socket socket = serverSocket.accept();
			System.out.println("Connection established");
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String data = dis.readUTF();
			System.out.println("Data received: " + data);
			dis.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
		
	}

}
