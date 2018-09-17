
public class swapVowel {

	public static void main(String[] args) {

		String Word = "Hello";
		String vowels = "";
		String replace = "";
		String swap = "";
		String subString = "";
		String vowelIndex = "";
		String valueOf = "";

		String[] vowel = { "a", "e", "i", "o", "u" };
		String aeiou = "aeiou";

		char[] charArray2 = aeiou.toCharArray();

		System.out.println("String - " + Word);

		for (int i = 0; i < vowel.length; i++) {
			if (Word.contains(vowel[i])) {
				vowels = vowels + vowel[i];
				vowelIndex = vowelIndex + i;
			}
		}
		System.out.println("Vowels - " + vowels);
		System.out.println("vowelIndex - " + vowelIndex);

		for (int i = vowels.length() - 1; i >= 0; i--) {
			replace = replace + vowels.charAt(i);
		}
		System.out.println("Replace - " + replace);
		char[] charArray3 = replace.toCharArray();

		char[] charArray = Word.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			// valueOf = String.valueOf();
			// System.out.println("string - "+ String.valueOf(j));
			System.out.println("CharArray - " + charArray[i]);

			if (charArray[i] == charArray2[1]) {

				char ABC;
				ABC = charArray[i];
				ABC = (char) (ABC + charArray[i]);
				System.out.println(ABC);

				// System.out.println("Values - "+ charArray[i] + "==" +
				// Integer.parseInt(valueOf));

			}

		}
		// swap = Word.substring(0, );

//		for (int i = 0; i < vowelIndex.length(); i++) {
//
//			valueOf = String.valueOf(i);
//			System.out.println("Value of - " + valueOf);
//			System.out.println("Integer of - " + Integer.parseInt(valueOf));
//			subString = Word.substring(1, 2);
//			// swap = Word.replaceAll(subString, charArray3[i]);
//			System.out.println("subString - " + subString);
//		}

		// System.out.println(Integer.parseInt(valueOf));
		// System.out.println("Swap -" + Word.substring(0,
		// Integer.parseInt(valueOf)));

		// for (int i = 1; i <= vowelIndex.length(); i++) {
		//
		// swap = Word.substring(0, vowelIndex.charAt(i));
		// System.out.println("Swap -" + swap );
		//
		// swap = Word.replace(vowels.charAt(i), replace.charAt(i));
		// }
		//

	}

}
