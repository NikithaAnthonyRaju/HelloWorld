package programs;

public class printPatterns {

	public static void main(String[] args) {

		 pattern(5);
		 patternNum(5);
		 patternNumIncre(5);
		 patterns(5);
		 patternTrian(5);

		patternTrainglewithNumbers();
		patternTrainglewithReverseNumbers();
	}

	public static void pattern(int n) {
		
		System.out.println("Right Angle Traingle with Starts");

		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void patternNum(int n) {
		
		System.out.println("Right Angle Traingle with Number = 1");
		
		int num = 1;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				// num++;
			}
			System.out.println();
		}
	}

	public static void patternNumIncre(int n) {
		
		System.out.println("Right Angle Traingle with Number from 1 to 15");

		int num = 1;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

	public static void patterns(int n) {
		
		System.out.println("Reverse Right Angle Traingle with Starts");

		int i, j, k = 2 * n - 2;

		for (i = 0; i < n; i++) {

			for (j = 0; j < k; j++) {
				System.out.print(" ");
			}

			k = k - 2;

			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void patternTrian(int n) {
		
		System.out.println("Traingle with Starts");

		int i, j, k = 2 * n - 2;

		for (i = 0; i < n; i++) {

			for (j = 0; j < k; j++) {
				System.out.print(" ");
			}

			k = k - 1;

			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void patternTrainglewithStars() {

		int rowCount = 5;
		int colCount = 1;
		int spaceCount = rowCount - 1;

		for (int i = 0; i < rowCount; i++) {

			for (int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < colCount; j++) {
				System.out.print("* ");
			}

			System.out.println();
			spaceCount = spaceCount - 1;
			colCount = colCount + 1;

		}
	}

	public static void patternTrainglewithNumbers() {

		int rowCount = 5;
		int colCount = 1;
		int spaceCount = rowCount - 1;

		for (int i = 0; i < rowCount; i++) {

			int k = 0;

			for (int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < colCount; j++) {

				if (j <= i) {

					k = k + 1;
				} else {
					k = k - 1;
				}

				System.out.print(k + " ");
			}

			System.out.println();
			spaceCount = spaceCount - 1;
			colCount = colCount + 1;

		}
	}

	public static void patternTrainglewithReverseNumbers() {

		int rowCount = 5;
		int colCount = 1;
		int spaceCount = rowCount - 1;

		for (int i = 0; i < rowCount; i++) {

			int k = 0;

			for (int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < colCount; j++) {

				if (j <= i) {

					k = k + 1;
				} else {
					k = k - 1;
				}

				System.out.print(k);
			}

			System.out.println();
			spaceCount = spaceCount - 1;
			colCount = colCount + 2;

		}

	}
}