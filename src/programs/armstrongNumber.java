package programs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class armstrongNumber {

	public static void main(String[] args) {
		
//		new ArrayList()[];
//		
//		A
//		
		armsstrongNumber("882");
	

	}
	
	public static void armsstrongNumber(String str){
//		int reminder = 0;
//		while(number>0){
//			reminder = number%10;
//			number/=10;
//			System.out.println(reminder);
//		}
//	}
		
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		
		for(Character ch : charArray){
			System.out.println(Integer.valueOf(ch));
			charMap.put(ch, Integer.valueOf(ch)^3);
		}
		
		/* * Find all duplicate characters in a String and print each of them. */
		
		Set<Character> keySet = charMap.keySet();
		int A = 0;
		for(Character ch : keySet){			
			A = A + charMap.get(ch);
			System.out.println(charMap.get(ch));
		}
		
		System.out.println(A);
	}

}
