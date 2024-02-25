package com.rojatech.ch02.collections.map;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastDemo {

	public static void main(String[] args) {
		
		// Fail fast iterator throw ConcurrentModificationException. e.g HashMap
		Map<String,String> citycode = new HashMap<>();
		//Map<String,String> citycode = new ConcurrentHashMap<String, String>();
		
		citycode.put("MAS", "Chennai");
		citycode.put("DEL", "New Delhi");
		citycode.put("MUM", "Mumbai");
		citycode.put("HYD", "Hyderabad");
		citycode.put("BAN", "Bangalore");
		
		// Set<Entry<String, String>> keyset = citycode.entrySet();
		
		Set<String> keyset = citycode.keySet();
		
		for (String key : keyset) {
			System.out.println(citycode.get(key));
			//citycode.put("MAD", "Madurai");  // will throw exception
		}
	}
}
