package com.rojatech.ch09.others;
import java.util.Scanner;
import java.util.stream.Stream;

interface AdvancedArithmetic {
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisor_sum(int n) {
		int sum = 1;
		for (int i=1; i<=n/2; i++) {
			if (n%i == 0) {
				sum = sum + n/i;
			}	
		}
		return sum;
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		MyCalculator my_calculator = new MyCalculator();
		System.out.println("I implemented: ");
		ImplementedInterfaceNames(my_calculator);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(my_calculator.divisor_sum(n));
		sc.close();

	}

	private static void ImplementedInterfaceNames(MyCalculator my_calculator) {
		Class[] theInterfaces = my_calculator.getClass().getInterfaces();
		
		Stream.of(theInterfaces).forEach(interf -> System.out.println(interf.getName()));
		
	}

}
