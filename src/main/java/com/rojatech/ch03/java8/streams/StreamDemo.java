package com.rojatech.ch03.java8.streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	/*
	 * method that returns a comma-separated string based on a given list of
	 * integers. Each element should be preceded by the letter 'e' if the number is
	 * even, and preceded by the letter 'o' if the number is odd. For example, if
	 * the input list is (3,44), the output should be 'o3,e44'.
	 */
	public String getString(List<Integer> list) {
		return list.stream().map(i -> i%2 == 0 ? "e"+i : "o"+i).collect(Collectors.joining(","));
	}
	
	public Double average(List<Integer> list) {
		int min = list.stream().mapToInt(i->i).min().getAsInt();
		int max = list.stream().mapToInt(i->i).max().getAsInt();
		
		System.out.println("min = " + min);
		System.out.println("max = " + max);
		
		return list.stream().mapToInt(i->i).average().getAsDouble();
	}
	
	public List<String> upperCase(List<String> list) {
		return list.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());	
	}
	
	public static void main(String[] args) {
		
		StreamDemo sd = new StreamDemo();
		
		Stream<String> stream2 = Stream.of("a","e","i","o","u");
		stream2.forEach(System.out::println);
		
		// anyMatch() 
		Stream<String> stream3 = Stream.of("a","e","i","o","u");
		boolean res = stream3.anyMatch(e -> e.contains("a"));
		System.out.println(res);
		
		// filter()
		List<String> list = List.of("One", "OneAndOnly", "Derek", "Italy", "Thursday", "");
		Stream<String> stream4 = list.stream().filter(element -> element.contains("d"));
		stream4.forEach(System.out::println);
		
		// find the numbers greater than 15 in a list. Example for Stream filter(), forEach() example
		List<Integer> arList = List.of(15,25,5);
		arList.stream().filter(x -> x>=15).forEach(System.out::println);
		
		// find the String ends with ja
		List<String> names = Arrays.asList("Raja","Avanija", "Saroja", "Jeni", "Mari", "Meena", "Racshana", "Rishanth");
		System.out.println(names.stream().filter(s -> s.endsWith("ja")).collect(Collectors.toList()));
		
		// find the average
		List<Integer> intList = Arrays.asList(4,3,7,4,2,1,9);
		System.out.println("average = " + sd.average(intList));
		System.out.println("transformed = " + sd.getString(intList));
		
		// e.g reduce()
		System.out.println("Sum = " + intList.stream().reduce(0, Integer::sum));
		
		List<String> names1 = Arrays.asList("Raja","Avanija", "Saroja", "Jeni", "Mari", "Meena", "Racshana", "Rishanth");
		System.out.println(sd.upperCase(names1));
		
		// Sort String ArrayList
		List<String> sortedNames = names1.stream().sorted(String::compareTo).toList();
		sortedNames.forEach(System.out::println);
			
		List<Integer> numbers=Arrays.asList(15,2,13,7,6,11,18);
		
		// sum of square of odd numbers 
		int sum = numbers.stream().filter(elem -> (elem %2)==1 ).mapToInt(elem -> elem* elem).sum();
		System.out.println(sum);
		
		// Sort Integer ArrayList
		List<Integer> numList = Arrays.asList(56,34,78,41,14);
		List<Integer> sorted = numList.stream().sorted((a,b) -> a-b).toList();
		sorted.forEach(System.out::println);
		
		// use of flatMap()
		// if I have a list of lists, flatMap() will �flatten� it out into a single-dimension
		List<String> letters1 = Arrays.asList("a", "b");
		List<String> letters2 = Arrays.asList("b", "c", "d");
		List<String> letters3 = Arrays.asList("e", "f");
		
		List<List<String>> listOfLetters = Arrays.asList(letters1, letters2, letters3);
		
		List<String> flatList = listOfLetters.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(flatList);
		
		// use of flatMap() for flattening two dimensional array to single dimensional
		String[] animals = new String[] {"dog", "cat", "cow"};
		String[] birds = new String[] {"sparrow", "crow", "eagle"};
		String[] fish = new String[] {"cod", "tuna", "salmonk"};
		
		String[][] creatures = new String[][] {animals, birds, fish};
		
		String[] flatCreatures = Arrays.stream(creatures).flatMap(Arrays::stream).toArray(String[]::new);
		
		System.out.println(Arrays.toString(flatCreatures));
		
		// Supplier
		Supplier<Date> currentDate = Date::new;
		System.out.println(currentDate.get());
		
		// Biconsumer
		BiConsumer<Integer, Integer> biconsumer = (a,b) -> System.out.println(a + b);
		biconsumer.accept(5, 6);
	}

}
