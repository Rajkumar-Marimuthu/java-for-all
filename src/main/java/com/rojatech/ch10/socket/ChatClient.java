package com.rojatech.ch10.socket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 9090);
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String messageReceived = "", messageToSend="";
			while(true) {
				messageToSend = br.readLine();
				dos.writeUTF(messageToSend);
				dos.flush();
				if (messageToSend.equals("exit")) {
					break;
				}
				messageReceived = dis.readUTF();
				System.out.println("Server says: " + messageReceived);
			}
			br.close();
			socket.close();
			dos.close();
			dis.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
