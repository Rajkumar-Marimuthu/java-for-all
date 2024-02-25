package com.rojatech.ch03.java8.streams;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import java.util.function.Predicate;

class PrimeCompositeFactorial {

	public void primeOrComposite(int num) {
		assert (num >=0 && num <=20);
		Predicate<Integer> primeCheck = n -> {
			if (n <=1) {
				return false;
			} else {
				for (int i=2; i<=n/2; i++) {
					if (n%i == 0) {
						return false;
					}
				}
				return true;
			}
		};
		
		Predicate<Integer> compositeCheck = n -> {
			int div = 0;
			if (n <=1) {
				return false;
			} else {
				for (int i=2; i<=n/2; i++) {
					if (n%i == 0) {
						div++;
					}
				}
				if (div>=1) {
					return true;
				} else {
					return false;
				}
			}
		};
		
		if(primeCheck.test(num)) {
			System.out.println("Prime");
		} else if (compositeCheck.test(num)) {
			System.out.println("Composite");
		} else {
			System.out.println("Neither Prime nor composite");
		}
	}

	public void findFactorial(int n) {
		assert (n >=0 && n <=20):"Not Valid";
		Consumer<Integer> fact = (num) -> {
			int ans = num;
			for (int i=num; i>1; i--) {
				ans = ans*(i-1);
			}
			System.out.println(ans);
		};
		fact.accept(n);
	}
	
}

public class PrimeCompositeFactorialTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		
		
		PrimeCompositeFactorial xyz = new PrimeCompositeFactorial();
		xyz.primeOrComposite(n);
		xyz.findFactorial(n);

	}

}
