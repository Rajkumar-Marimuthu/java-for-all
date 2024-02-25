package com.rojatech.ch02.collections.map;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemoP4 {

	/* Storing and retrieving key-value pairs
	 * Not synchronized by default
	 * This means that it is not thread-safe for concurrent access without external synchronization. 
	 * better performance in single-threaded scenarios.
	 * Both keys and values can be null in a HashMap.
	 * It's generally recommended to use ConcurrentHashMap for better performance in concurrent applications.
	 * */
	
	public static void main(String[] args) {
		Map<String, String> phoneBook = new HashMap<>();
		
		phoneBook.put("Rajkumar", "9876543210");
		phoneBook.put("Marimuthu", "8765432109");
		phoneBook.put("Racshana", "8765432108");
		phoneBook.put("Risanth", "8765432107");
		phoneBook.put("Avanija", "8765432106");
		
		System.out.println(phoneBook); // {Rajkumar=9876543210, Risanth=8765432107, Avanija=8765432106, Racshana=8765432108, Marimuthu=8765432109}
		System.out.println(phoneBook.get("Avanija")); // 8765432106
		
		Set<String> keys = phoneBook.keySet();
		
		/*
		 * for (String str : keys) { System.out.println(phoneBook.get(str)); }
		 */
		keys.forEach(k->System.out.println(phoneBook.get(k)));
		
		Set<Map.Entry<String, String>> entries = phoneBook.entrySet();
		
		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println(phoneBook.values()); // [9876543210, 8765432107, 8765432106, 8765432108, 8765432109]
	}
}
 