import com.rojatech.javachallenges.list.Customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaArraySortingDemo {
	
	public void sortByBirthday(List<Customer> customersList) {
		
		Collections.sort(customersList, new Comparator<Customer>() {

			@Override
			public int compare(Customer cus1, Customer cus2) {
				return cus1.birthday().compareTo(cus2.birthday());
			}
		});
		
		System.out.println(customersList);
	}

	public static void main(String[] args) throws ParseException {
		List<Customer> customers = Arrays.asList(new Customer(1, "Jack", new SimpleDateFormat("dd-MM-yy").parse("22-03-1989")), 
				new Customer(1, "Jack", new SimpleDateFormat("dd-MM-yy").parse("22-03-1990")), 
						new Customer(1, "Jack", new SimpleDateFormat("dd-MM-yy").parse("22-04-1989")),
								new Customer(1, "Jack", new SimpleDateFormat("dd-MM-yy").parse("15-03-2021")),
										new Customer(1, "Jack", new SimpleDateFormat("dd-MM-yy").parse("12-03-1995")),
												new Customer(1, "Jack", new SimpleDateFormat("dd-MM-yy").parse("22-06-1879")));
		
		JavaArraySortingDemo javaArraySortingDemo = new JavaArraySortingDemo();
		javaArraySortingDemo.sortByBirthday(customers);

	}

}
