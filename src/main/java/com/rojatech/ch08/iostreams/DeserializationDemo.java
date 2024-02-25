package com.rojatech.ch08.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputFilter.Status;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("D:\\javaworkspace\\Ramanujan\\src\\main\\java\\com\\rojatech\\ramanujan\\ch08\\iostreams\\Employee.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ObjectInputFilter oif1 = ObjectInputFilter.Config.createFilter("com.rojatech.ramanujan.ch08.iostreams.Employee;"
					+ "java.base/*;!*");
			//ois.setObjectInputFilter(oif1);
			
			ObjectInputFilter oif2 = ObjectInputFilter.allowFilter(cl->cl.equals(Employee.class), Status.REJECTED);
			//ois.setObjectInputFilter(oif2);
			
			ObjectInputFilter merged = ObjectInputFilter.merge(oif1, oif2);
			ois.setObjectInputFilter(merged);
			Object obj = ois.readObject();
			Employee emp = (Employee)obj;
			System.out.println(emp.id);
			System.out.println(emp.name);
			System.out.println(emp.salary);
			System.out.println(emp.ssn);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
