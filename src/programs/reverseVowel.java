package programs;

public class reverseVowel {

	public static void main(String[] args) {

		String Word = "Nikitha";
		String vowels = "";
		String replace = "";

		String[] vowel = new String[] { "a", "e", "i", "o", "u" };

		for (int i = 0; i < vowel.length; i++) {
			if (Word.contains(vowel[i])) {
				vowels = vowels + vowel[i];
			}
		}

		System.out.println("Vowels - " + vowels);

		for (int i = vowels.length() - 1; i >= 0; i--) {
			replace = replace + vowels.charAt(i);
		}
		System.out.println("Replace - " + replace);

	}

}
