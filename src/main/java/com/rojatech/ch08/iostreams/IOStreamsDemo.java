package com.rojatech.ch08.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOStreamsDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File("D:\\javaworkspace\\Ramanujan\\src\\main\\java\\com\\rojatech\\ramanujan\\ch8\\iostreams\\notes.txt"));
			System.out.println("File Opened");
			
			int i;
			while((i=fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				System.out.println("\nFile Closed.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
