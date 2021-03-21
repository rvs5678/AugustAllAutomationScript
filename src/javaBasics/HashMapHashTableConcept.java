package javaBasics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapHashTableConcept {

	public static void main(String[] args) {
		
//		 HashMap - keeps data in key and value pair
//		 one null key and multiple null value allowed
//		 duplicate values are allowed
//		
//		HashMap vs HashTable
//		1. HashMap is non synchronized. It is not-thread safe and can't be shared between many threads
//		2. HashMap allows one null key and multiple null values whereas HashTable doesn't allow any null key or value.
//		3. HashMap is generally preferred over HashTable if thread synchronization is not needed.
//		
//		Why HashTable doesn't allow null and HashMap does?
//		To successfully store and retrieve objects from a HashTable, the objects used as keys must implement the hash code method and equals method. Since null is not an object so it cannot be implemented
//		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "java"); // put() - inserting key & values
		hm.put(5, "selenium");
		hm.put(3, "TestNg");
		hm.put(9,"cucumnber"); // values gets inserted according to hashCode of key
		
		System.out.println("1.Size of hashMap: "+hm.size());
	
		System.out.println("2.Value pointed by key-3: "+hm.get(3)); // 3 is not an index but a key
		System.out.println("3.Entry set of hashMap: "+hm.entrySet()); //entrySet() - return key to value
		System.out.println("4.key set of hashMap: "+hm.keySet());
		
		hm.put(null, "Maven");
		System.out.println("5.Entry set of hashMap: "+hm.entrySet());
		System.out.println("6.We will get the value of Key'null': "+hm.get(null));
		hm.put(null, "Appium");
		System.out.println("7.EntrySet of hashMap: "+hm.entrySet());
		hm.put(9, "Jira");
		System.out.println("8.EntrySet of hashMap: "+hm.entrySet());
		hm.put(null, null);
		hm.put(10, null);
		hm.put(11, null);
		System.out.println("9.Size of hashMap: "+hm.size());
		System.out.println("10.Entryset of hashMap: "+hm.entrySet());
		
		System.out.println("11.If null key is present: "+hm.containsKey(null)); // containsKey() - checking if key is present 
		System.out.println("12.If java as a value is present: "+hm.containsValue("java")); // contains() - contains will check if value is present and its also case sensitive.
		
		System.out.println("13.Check the hashcode for this table: "+hm.hashCode());
		hm.remove(null); // remove() - will remove the value pointed by that specific key
		System.out.println("14.EntrySet of hashmap to check if null is removed: "+hm.entrySet());
		
		hm.replace(10,"HP ALM"); // replace() - will replace value from the specific key provided
		System.out.println("15.Entryset of hashmap to check if the value is Replaced in a specfic key: "+hm.entrySet());
		
		System.out.println("16.Check All values in hashMap: "+hm.values()); // values() - will return all the values
		
//		Iterator<Integer> it  = hm.keySet().iterator();
////		while(it.hasNext()) {
////			int key = it.next();
////			String value = hm.get(key);
////			System.out.print(value+ " ");
//	}
//			
			Iterator<Entry<Integer, String>> it1 = hm.entrySet().iterator();
			while(it1.hasNext()) {
				Entry<Integer, String> entry = it1.next();
				int key = entry.getKey();
				String value = entry.getValue();
				System.out.println("Key is "+key+" and value pointed is "+value);
				
			}
			
			Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
			ht.put(1, "Tom");
			ht.put(2, "Jerry");
			ht.put(3, "Henry");
			System.out.println(ht.entrySet());
			System.out.println(ht.keySet());
			
//			ht.put(null, null); // Null pointer exception - null values is not allowed in hashTable. null values is not allowed in either key or value
			ht.put(null, "John"); // Null pointer exception - not allowed in HashTable 
			System.out.println(ht.entrySet()); 
		
		
		
	
		
		
		
		
		
		
		
 		
		
		
		
	}

}
