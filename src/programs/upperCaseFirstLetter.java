package programs;

public class upperCaseFirstLetter {

	public static void main(String[] args) {

		String sentence = "in this universe, we are human beings.";
		System.out.println(sentence);

		String[] words = sentence.split(" ");

		for (String word : words) {

			String newString = word.replaceAll(word.substring(0, 1), word.substring(0, 1).toUpperCase());
			System.out.print(newString + " ");

		}
	}
}
