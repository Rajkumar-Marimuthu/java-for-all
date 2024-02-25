package com.rojatech.ch08.iostreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriterDemo {

	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("D:\\javaworkspace\\Ramanujan\\src\\main\\java\\com\\rojatech\\ramanujan\\ch8\\iostreams\\notes.txt");
			fw = new FileWriter("D:\\javaworkspace\\Ramanujan\\src\\main\\java\\com\\rojatech\\ramanujan\\ch8\\iostreams\\notes_copy.txt");
			
			int ch;
			while ((ch=fr.read()) != -1) {
				fw.write(ch);
			}
			System.out.println("File copy completed.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
