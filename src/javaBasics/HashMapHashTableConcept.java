package javaBasics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapHashTableConcept {
	// Data -> key-value pair
	// HashMap & HashTable -> class
	

	public static void main(String[] args) {
		// Creating HashMap
//		HashMap hm = new HashMap(); // non-parameterized
		HashMap<Integer, String> hm = new HashMap<Integer, String>(); // <Integer, String> -> Integer=>key | String=>value
		// inserting data - creating entries
		hm.put(5, "Marcello");
		hm.put(7, "Ronaldo");
		hm.put(10, "Messi");
		hm.put(9, "Salah");
		//extract value
		System.out.println(hm.get(10));
		System.out.println(hm.get(7));
		// checking for key or value
		System.out.println(hm.containsKey(11));
		System.out.println(hm.containsKey(7));
		System.out.println(hm.containsValue("Neymar"));
		System.out.println(hm.containsValue("Salah"));
		// number of entries
		System.out.println(hm.size());
		
		hm.replace(5, "Mudrich");
		System.out.println(hm);
		hm.remove(5);
		System.out.println(hm);
		
		// get all keys
		Set<Integer> allKeys = hm.keySet();
		System.out.println(allKeys);
		// get all value
		Collection<String> allValues = hm.values();
		System.out.println(allValues);
		// get all entries
		Set<Entry<Integer, String>> allEntries = hm.entrySet();
		System.out.println(allEntries);
		
		// traversing through HashMap
		// for each
//		for(Integer key: allKeys) {
//			System.out.println("Player: "+hm.get(key));
//		}
		
		// iterator
		Iterator<Integer> it = allKeys.iterator();
		while(it.hasNext()) {
			System.out.println("Player: "+hm.get(it.next()));
		}
		
		// reusing key
		hm.put(5, "Ronaldino");
		System.out.println(hm);
		hm.put(5, "Martinez"); // same key, value replaced
		System.out.println(hm);
		
		// dealing with Null
		hm.put(null, "Ronaldino");
		hm.put(1, null);
		System.out.println(hm);
		hm.put(null, null);
		System.out.println(hm);
		
		
		// creating Hashtable
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>(); // <Integer, String> -> Integer=>key | String=>value
		// inserting data - creating entries
		ht.put(5, "Marcello");
		ht.put(7, "Ronaldo");
		ht.put(10, "Messi");
		ht.put(9, "Salah");
		//extract value
		System.out.println(ht.get(10));
		System.out.println(ht.get(7));
		// checking for key or value
		System.out.println(ht.containsKey(11));
		System.out.println(ht.containsKey(7));
		System.out.println(ht.containsValue("Neymar"));
		System.out.println(ht.containsValue("Salah"));
		// number of entries
		System.out.println(ht.size());
		
		ht.replace(5, "Mudrich");
		System.out.println(ht);
		ht.remove(5);
		System.out.println(ht);
		
		// get all keys
		Set<Integer> allKeysHt = ht.keySet();
		System.out.println(allKeysHt);
		// get all value
		Collection<String> allValuesHt = ht.values();
		System.out.println(allValuesHt);
		// get all entries
		Set<Entry<Integer, String>> allEntriesHt = ht.entrySet();
		System.out.println(allEntriesHt);
		
		// traversing through HashMap
		// for each
//		for(Integer keyHt: allKeysHt) {
//			System.out.println("Player: "+ht.get(keyHt));
//		}
		
		// iterator
		Iterator<Integer> itHT = allKeysHt.iterator();
		while(itHT.hasNext()) {
			System.out.println("Player: "+ht.get(itHT.next()));
		}
		
		// reusing key
		ht.put(5, "Ronaldino");
		System.out.println(ht);
		ht.put(5, "Martinez"); // same key, value replaced
		System.out.println(ht);
		
		// dealing with Null
//		ht.put(null, "Ronaldino"); // java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
//		ht.put(1, null); // NullPointerException
//		System.out.println(ht);
//		ht.put(null, null); // NullPointerException
		System.out.println(ht);
	}

}
