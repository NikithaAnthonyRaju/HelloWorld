
public class swapVowel {
	
	public static void main(String[] args) {
		
		String Word = "Hello";
		String vowels = "";
		String replace = "";
		String swap ="";
		String vowelIndex ="";

		String[] vowel = { "a", "e", "i", "o", "u" };
		
		System.out.println("String - " + Word);

		for (int i = 0; i < vowel.length; i++) {
			if (Word.contains(vowel[i])) {
				vowels = vowels + vowel[i];
			}
		}		
		System.out.println("Vowels - " + vowels);
		System.out.println("vowelIndex - " + vowelIndex);
		

		for (int i = vowels.length() - 1; i >= 0; i--) {
			replace = replace + vowels.charAt(i);
		}
		System.out.println("Replace - " + replace);
		System.out.println(vowelIndex.length());
		
		char[] charArray = Word.toCharArray();
		swap = Word.substring(0, vowelIndex.charAt(1));
		System.out.println("Swap -" + swap );

//		for (int i = 1; i <= vowelIndex.length(); i++) {
//
//			swap = Word.substring(0, vowelIndex.charAt(i));
//			System.out.println("Swap -" + swap );
//			
//		swap = Word.replace(vowels.charAt(i), replace.charAt(i));		
//		}
//		
		
	}
		
	}
