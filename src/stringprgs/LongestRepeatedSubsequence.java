package stringprgs;

//import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

import java.text.ParseException;
import java.util.Comparator;

public class LongestRepeatedSubsequence {

	public static void main(String[] args) throws ParseException {
		//input String
		String str = "AABBCCDDAABB";

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//adding string into hashmap with count
		for (int index = 0; index < str.length() - 1; index++) {
			if (map.containsKey(str.charAt(index) + "")) {
				map.put(str.charAt(index) + "", map.get(str.charAt(index) + "") + 1);
			} else {
				map.put("" + str.charAt(index), 1);
			}
		}

		Set<Entry<String, Integer>> entries = map.entrySet();
		Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
				int v1 = e1.getValue();
				int v2 = e2.getValue();
				// return v1.compareTo(v2); for objects
				if (v1 < v2)
					return v2;
				else if (v1 == v2)
					return 0;
				else
					return -1;

			}
		};
		// Sort method needs a List, so let's first convert Set to List in Java
		List<Entry<String, Integer>> listOfEntries = new ArrayList<Entry<String, Integer>>(entries);
		// sorting HashMap by values using comparator
		Collections.sort(listOfEntries, valueComparator);
		LinkedHashMap<String, Integer> sortedByValue = new LinkedHashMap<String, Integer>(listOfEntries.size());
		// copying entries from List to Map
		for (Entry<String, Integer> entry : listOfEntries) {
			sortedByValue.put(entry.getKey(), entry.getValue());
		}
		System.out.println("HashMap after sorting entries by values ");
		Set<Entry<String, Integer>> entrySetSortedByValue = sortedByValue.entrySet();
		int max = 0;
		for (Entry<String, Integer> mapping : entrySetSortedByValue) {
			if (max < mapping.getValue()) {
				System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
				max = mapping.getValue();
			}

		}
	}

}
