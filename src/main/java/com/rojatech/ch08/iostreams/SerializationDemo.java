package com.rojatech.ch08.iostreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("Employee.ser");
			oos = new ObjectOutputStream(fos);
			Employee employee = new Employee(100,"Raj",10000,123456);
			oos.writeObject(employee);
			System.out.println("Object serialized.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
