package javaOOPSConcepts;

import java.util.LinkedList;
import java.util.List;

public class modifyList {
	
	public static void main(String[] args) {
		List<String> list2 = new LinkedList<>();
		String A = "";
		String B = "ABC";
		A = "AAAAA";
		
		list2.add(A);
		list2.add(B);
		
		String AB = "ABCD";
//		if(list2.contains(A)){
//			list2.set(list2.indexOf(A), AB);
//			System.out.println(list2);
//		}
		
		System.out.println(list2);
		
		 List<String> list = new LinkedList<>();
		 list.add("A");
		 list.add("");
		 list.add(" ");
		 list.add("B");
		 System.out.println(list);
		 
		 if(list.contains("")){

			 list.set(list.indexOf(""), "BC");
		 }
		 System.out.println(list);
		 
		
	}

}
