package javaOOPSConcepts;

import java.util.HashMap;

public class hashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		new HashMap<Object, Object>();
//		new HashMap<String, Object>();
		HashMap<String, String> hashMap = new HashMap<String, String>();
		System.out.println("Entry Key - " + hashMap.entrySet());
		System.out.println("Empty - " + hashMap.isEmpty());
		hashMap.put("Name", "Nikitha");
		hashMap.put("Project", "PPS");
		hashMap.put("Comapany", "DXC");
		hashMap.put("Name", "Usha");
		System.out.println("Entry Key - " + hashMap.entrySet());
		System.out.println("Size - " + hashMap.size());
		hashMap.remove("Name", "Usha");
		System.out.println("Size - " + hashMap.size());
		System.out.println("Entry Key - " + hashMap.entrySet());
		System.out.println("Key Set - " + hashMap.keySet());
		System.out.println("Values - " + hashMap.values());
		System.out.println("Contains Keys - " + hashMap.containsKey("Name"));
		System.out.println("Contains Values - " + hashMap.containsValue("DXC"));

		
	}

}
