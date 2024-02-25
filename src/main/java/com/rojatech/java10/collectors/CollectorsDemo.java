package com.rojatech.java10.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		var list = List.of(12,3,4,7,8,9);
		var filtered = list.stream().filter(n->n%3==0).collect(Collectors.toUnmodifiableList());
		System.out.println(filtered);
	}

}
