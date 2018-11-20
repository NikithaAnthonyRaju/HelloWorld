package programs;

import java.util.LinkedList;
import java.util.List;

public class primeNumber2 {

	public static void main(String[] args) {

		System.out.println(isPrimeNumber(3));

	}

	private static int isPrimeNumber(int number) {

		int endNumber = 10000;
		List<Integer> primeNumbers = new LinkedList<>();

		for (int i = 0; i <endNumber; i++) {

			for (int j = 2; j <= i / 2; j++) {

				if (j % i == 0) {
					primeNumbers.remove(i);
				} else {
					primeNumbers.add(i);
				}
			}
			primeNumbers.add(i);
		}
		System.out.println(primeNumbers);
		return primeNumbers.get(number);
	}
}
