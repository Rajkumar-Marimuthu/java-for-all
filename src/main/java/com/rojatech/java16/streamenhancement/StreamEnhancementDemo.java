package com.rojatech.java16.streamenhancement;

import java.util.List;

public class StreamEnhancementDemo {

	public static void main(String[] args) {
		var filtered = List.of(2,5,6,7,8,23,12,15).stream().filter(n->n>10).toList();
		System.out.println(filtered);
	}

}
