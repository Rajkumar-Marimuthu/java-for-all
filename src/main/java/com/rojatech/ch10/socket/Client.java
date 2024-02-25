package com.rojatech.ch10.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String args[]) {
		try {
			Socket socket = new Socket("localhost",8080);
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF("Java sockets are cool");
			dos.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
