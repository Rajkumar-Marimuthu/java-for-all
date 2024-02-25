package com.rojatech.ch09.others;
import java.util.ArrayList;
import java.util.List;

public class FinalDemoOne {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		a = a + 5;
		b = b + 5;
		
		System.out.println(a);
		System.out.println(b);
		
		String myName = "Rajkumar";
		myName = "Rajkumar Marimuthu";
		
		System.out.println(myName);
		
		final List<String> nameList = new ArrayList<String>();
		nameList.add("Mr. ");
		nameList.add("Rajkumar");
		nameList.add("Marimuthu");
		
		System.out.println(nameList);

		List<String> nameList1 = new ArrayList<String>();
		nameList1.add("Raja");
		nameList1.add("Raju");
		
		
		
		

	}

}
