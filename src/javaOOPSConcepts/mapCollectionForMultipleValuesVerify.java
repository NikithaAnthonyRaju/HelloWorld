package javaOOPSConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapCollectionForMultipleValuesVerify {

	public static void main(String[] args) {

		Map<String, List<String>> map = new HashMap<String, List<String>>();

		List<String> valSetOne = new ArrayList<String>();
		valSetOne.add("Apple");
		valSetOne.add("Aeroplane");
		valSetOne.add("Asia");

		List<String> valSetTwo = new ArrayList<String>();
		valSetTwo.add("Bat");
		valSetTwo.add("Banana");
		valSetTwo.add(null);

		List<String> valSetThree = new ArrayList<String>();
		valSetThree.add("Cat");
		valSetThree.add("Car");
		valSetThree.add(null);

		map.put("A", valSetOne);
		map.put("B", valSetTwo);
		map.put("C", valSetThree);

		Map<String, List<String>> map2 = new HashMap<String, List<String>>();

		List<String> valSetOne2 = new ArrayList<String>();
		valSetOne2.add("Apple");
		valSetOne2.add("Aeroplane");
		valSetOne2.add("Asia");

		List<String> valSetTwo2 = new ArrayList<String>();
		valSetTwo2.add("Bat");
		valSetTwo2.add("Banana");
		valSetTwo2.add("Bar");

		List<String> valSetThree2 = new ArrayList<String>();
		valSetThree2.add("Cat");
		valSetThree2.add("Car");
		valSetThree2.add("Call");
		valSetThree2.add("Cal");

		map2.put("B", valSetTwo2);
		map2.put("A", valSetOne2);
		map2.put("C", valSetThree2);

		if (map.keySet().equals(map2.keySet()) && map.size() == map2.size()) {
			for (String aKey : map.keySet()) {
				if (map.get(aKey).containsAll(map2.get(aKey))) {
					System.out.println("Values are perfect for - " + aKey);
				} else {
					System.out.println("Values are different for - " + aKey);
				}
			}
		} else {
			System.out.println("Key are different or size is different");
		}

		if (map.entrySet().equals(map2.entrySet())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
