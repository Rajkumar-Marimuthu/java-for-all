package com.rojatech.ch02.collections.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemoP2 {

	public static void main(String[] args) {

		// How the LinkedList works?
		// The LinkedList stores its items in "containers."
		// The list has a link to the first container and each container has a link to the next container in the list.
		// To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ram");
		ll.add("Kumar");
		ll.addFirst("Mr.");
		ll.addLast("B.E");

		ll.forEach(v -> System.out.println(v));

		// List of String definition
		List<String> words = Arrays.asList("Hello", "how", "are");
		System.out.println(words); // [Hello, how, are]

		// LinkedList
		words = new LinkedList<String>(words);
		words.add("you?");
		System.out.println(words); // [Hello, how, are, you?]

		// When To Use
		// Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
		
		// LinkedList Methods
		// addFirst()	Adds an item to the beginning of the list.
		// addLast()	Add an item to the end of the list
		// removeFirst()	Remove an item from the beginning of the list.
		// removeLast()	Remove an item from the end of the list
		// getFirst()	Get the item at the beginning of the list
		// getLast()	Get the item at the end of the list
	}
}
