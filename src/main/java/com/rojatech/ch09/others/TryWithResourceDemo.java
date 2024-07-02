package com.rojatech.ch09.others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// used for auto close of resources. no need to specify closing statement explicitly
public class TryWithResourceDemo {

	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			String str = "";
			str = br.readLine();
			
			System.out.println("end statement : " + str);
			
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
	}
}
