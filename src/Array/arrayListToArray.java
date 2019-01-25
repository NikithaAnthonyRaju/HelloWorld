//Coversion of ArrayList to Array

import java.util.*;



public class Main

{
	
	public static void arrayListToArray(String[] args) 
	{
		
		List<Integer> ABC = new LinkedList<>();
		
		ABC.add(3);
		
		ABC.add(0);
		
		ABC.add(13);
		
		ABC.add(32);

		
		Object[] number = ABC.toArray();
		
		for(Object obj: number)
		{
		
			System.out.println(obj);
		
		}
	
	}

}