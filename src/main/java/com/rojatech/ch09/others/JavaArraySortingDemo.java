package com.rojatech.ch09.others;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class JavaArraySortingDemo {
	
	public void sortByBirthday(List<Customer> customersList) {
		
		customersList.sort(new Comparator<Customer>() {

            @Override
            public int compare(Customer cus1, Customer cus2) {
                return cus1.getBirthday().compareTo(cus2.getBirthday());
            }
        });
		
		System.out.println(customersList);
	}

	public static void main(String[] args) throws ParseException {
		List<Customer> customers = Arrays.asList(new Customer(1, "Jack", new SimpleDateFormat("dd-MM-yy").parse("22-03-1989")), 
				new Customer(1, "Jack", new SimpleDateFormat("dd-MM-yy").parse("22-03-1990")), 
						new Customer(1, "Jack", new SimpleDateFormat("dd-MM-yy").parse("22-04-1989")),
								new Customer(1, "Jack", new SimpleDateFormat("dd-MM-yy").parse("15-03-2021")));
		
		JavaArraySortingDemo javaArraySortingDemo = new JavaArraySortingDemo();
		javaArraySortingDemo.sortByBirthday(customers);
	}

}
