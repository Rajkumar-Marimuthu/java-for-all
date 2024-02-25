package com.rojatech.ch03.java8.streams;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

class StoreElementsInCollection {

	final static List<String> preDefSandwiches = Arrays.asList("cheese sandwich", "corn sandwich", "mix veg sandwich");
	
	public static void storeElements(String input) {
		Consumer<String> consumer = (str) -> {
			List<String> sandwiches = Arrays.asList(str.split(","));
			System.out.println(sandwiches.toString());
			
			//System.out.println(sandwiches.stream().filter(sandwich -> preDefSandwiches.contains(sandwich)).count());
			//System.out.println(sandwiches.size());
			
			Supplier<List<String>> supplier = () -> {
				return sandwiches;
			};
			
			System.out.println(supplier.get());
		};
		consumer.accept(input);	
	}
}


public class FunctionalInterfaceDemo5 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// input -> cheese sandwich, corn sandwich, mix veg sandwich
		String input = br.readLine();
		StoreElementsInCollection.storeElements(input);
	}
}
