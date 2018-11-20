package programs;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class duplicateStrings {

	public static void main(String[] args) {
		duplicateChar("WORDRDSS");
		removeduplicateChar("WORDRDSS");
	}
	
	private static void duplicateChar(String str) {
		
		/* * Find all duplicate characters in a String and print each of them. */

//		HashMap<Character, Integer> harMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		
		for(Character ch : charArray){
			if(charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch)+1);
			} else {
				charMap.put(ch, 1);
			}
		}
		
		/* * Find all duplicate characters in a String and print each of them. */
		
		Set<Character> keySet = charMap.keySet();
		for(Character ch : keySet){
			if(charMap.get(ch)!=1){
				System.out.println("Character " + ch + " occurence is " + charMap.get(ch));
//				System.out.println(ch);
				
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (Character character : keySet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());
	}
	
	/* Convert the string to an array of char, and store it in a LinkedHashSet. That will preserve your ordering, and remove duplicates * */
	
	private static void removeduplicateChar(String string) {
		
		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}
		
		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());
		
	}
}
