package com.rojatech.ch10.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(9090);
			System.out.println("Server is ready to chat:");
			Socket socket = serverSocket.accept();
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			String messageReceived="", messageToSend="";
			while(true) {
				messageReceived = dis.readUTF();
				if(messageReceived != null && messageReceived.equals("exit")) {
					break;
				}
				System.out.println("Client says: " + messageReceived);
				messageToSend = bufferedReader.readLine();
				dos.writeUTF(messageToSend);
				dos.flush();
			}
			bufferedReader.close();
			dis.close();
			dos.close();
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
