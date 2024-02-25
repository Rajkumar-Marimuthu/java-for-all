package com.rojatech.ch02.collections.map;

import java.util.NavigableMap;
import java.util.TreeMap;


public class NavigableMapDemo {

	public static void main(String[] args) {
		NavigableMap<String, String> map = new TreeMap<>();
        
        map.put("A", "Apple");
        map.put("B", "Boy");
        map.put("C", "Cat");
        map.put("D", "Dog");
        System.out.println(map.floorKey("B"));
        System.out.println(map.lowerKey("B"));
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.pollFirstEntry());
        System.out.println(map.descendingMap());
	}

}
