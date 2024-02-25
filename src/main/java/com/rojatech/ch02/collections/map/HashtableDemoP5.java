package com.rojatech.ch02.collections.map;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableDemoP5 {

	/* A hash table (old) is an unordered collection of key-value pairs, with a unique key for each value. 
	 * In a hash table, data is stored in an array of list format, with a distinct index value for each data value.
	 * It is Synchronized, meaning that it is thread-safe for use in multi-threaded environments.
	 * Low performance
	 * Neither keys nor values can be null in a Hashtable. Attempting to insert a null key or value will result in a NullPointerException.
	 * In most cases, HashMap is preferred over Hashtable due to its better performance and flexibility. 
	 * If you need thread-safe behavior, you might consider using ConcurrentHashMap instead of Hashtable as it provides better concurrency control without the global synchronization of Hashtable.
	 * */
	public static void main(String[] args) {
		
		Map<String, String> phoneBook = new Hashtable<>();
		
		phoneBook.put("Rajkumar", "9876543210");
		phoneBook.put("Marimuthu", "8765432109");
		phoneBook.put("Racshana", "8765432108");
		phoneBook.put("Risanth", "8765432107");
		phoneBook.put("Avanija", "8765432106");
		
		System.out.println(phoneBook);
		
		System.out.println(phoneBook.get("Avanija"));
		
		Set<String> keys = phoneBook.keySet();
		
		keys.forEach(k->System.out.println(phoneBook.get(k)));
		
		Set<Map.Entry<String, String>> values = phoneBook.entrySet();
		
		for (Map.Entry<String, String> entry : values) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}

}