package com.rojatech.java11.files;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class FilesUpdateDemo {

	public static void main(String[] args) {
		try {
			Path path = Files.writeString(Files.createTempFile("test", ".txt"), "Java 11 is cool.");
			System.out.println(path);
			String str = Files.readString(path);
			System.out.println(str);
		} catch (IOException e) {
			log.info("Exception: ", e);

		}
	}

}
