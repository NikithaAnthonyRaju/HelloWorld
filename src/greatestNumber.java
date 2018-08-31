public class greatestNumber {

//	static String[] A = new String[]{ "1", "2", "3" };
	static int[] count = new int[] { 3, 2, 2, 1, 1, 1, 0 };

	public static void main(String[] args) {

		int A = 0;
		int C = 0;

		for (int j = 1; j < count.length; j++) {
			if (count[A] > count[j]) {
				C = C + 1;
			} else {
				C = C + 0;
			}
			A++;
		}

		System.out.print(C);
	}
}