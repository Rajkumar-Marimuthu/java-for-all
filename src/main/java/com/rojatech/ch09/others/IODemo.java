package com.rojatech.ch09.others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IODemo {

	public static void main(String[] args) {
		int j;
		String str = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			j = Integer.parseInt(br.readLine());
			str = br.readLine();
			
			System.out.println("typed : " + 10/j);
			System.out.println("end statement : " + str);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally 
		{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Done!");
		}
		

	}

}
