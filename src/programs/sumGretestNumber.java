package programs;

public class sumGretestNumber {

	public static void main(String[] args) {

		int[] A = { 3, 5, 2, 4 };
		SGN(A);	
		
	}

	public static void SGN(int[] number) {

		int outterCount = 0;
		int innerCount;

		for (int i = 0; i < number.length; i++) {

			innerCount = 0;

			for (int j = i + 1; j < number.length; j++) {

				if (number[i] > number[j]) {

					innerCount = innerCount + 0;

				} else {

					innerCount = innerCount + 1;

				}
			}

			System.out.println(innerCount);

			outterCount = innerCount + outterCount;

		}

		System.out.println(outterCount);

	}

}
