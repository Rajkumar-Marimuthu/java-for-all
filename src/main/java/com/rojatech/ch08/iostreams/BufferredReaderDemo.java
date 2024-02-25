package com.rojatech.ch08.iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferredReaderDemo {

	public static void main(String[] args) {

		int count = 0;
		
		try (
				FileReader fr = new FileReader("D:\\javaworkspace\\Ramanujan\\src\\main\\java\\com\\rojatech\\ramanujan\\ch8\\iostreams\\notes.txt");	
				BufferedReader br = new BufferedReader(fr);
				) {
			String line;
			while ( (line = br.readLine()) != null ) {
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					count++;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Count = " + count);
	}
}
