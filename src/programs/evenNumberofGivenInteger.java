package programs;

public class evenNumberofGivenInteger {

	public static void main(String[] args) {

		int number = 245687278;

		while (number > 0) {

			int quotient = number / 10;
			int reminder = number % 10;

			if (reminder % 2 == 0) {
				System.out.println("Number is Even - " + reminder);
			} else {
				System.out.println("Number is Odd - " + reminder);
			}

			number = quotient;
		}
	}
}