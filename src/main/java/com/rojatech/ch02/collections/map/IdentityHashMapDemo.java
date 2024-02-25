package com.rojatech.ch02.collections.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new IdentityHashMap<>();
		map.put(Integer.valueOf(100), "Raj");
		map.put(Integer.valueOf(100), "Kumar");

		System.out.println(map);

	}

}
