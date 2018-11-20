package programs;

public class reverseNumber {

	public static void main(String[] args) {

		int number = 123456;

		while (number > 0) {

			int quotient = number / 10;
			int reminder = number % 10;

			System.out.print(reminder);
			number = quotient;
		}

	}

}
