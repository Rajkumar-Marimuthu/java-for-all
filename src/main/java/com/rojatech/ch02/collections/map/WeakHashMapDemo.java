package com.rojatech.ch02.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		Map<User,String> map = new WeakHashMap<>();
		
		User u = new User();
		map.put(u, "Tom");
		
		System.out.println(map);
		
		u = null;
		System.out.println(map);
	}

}
