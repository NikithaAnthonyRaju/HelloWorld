package programs;

public class SpiralForLoop {

	public static void main(String[] args) {

		int rowStart = 0;
		int colStart = 0;
		int rowEnd = 4;
		int colEnd = 3;
		int table[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int i;

		while (rowStart < rowEnd && colStart < colEnd) {

			for (i = colStart; i < colEnd; i++) {
				System.out.print(table[rowStart][i]);
			}

			rowStart++;

			for (i = rowStart; i < rowEnd; i++) {
				System.out.print(table[i][colEnd - 1]);
			}

			colEnd--;

			if (rowStart < rowEnd) {

				for (i = colEnd - 1; i >= colStart; i--) {
					System.out.print(table[rowEnd - 1][i]);
				}
			}

			rowEnd--;

			if (colStart < colEnd) {

				for (i = rowEnd - 1; i >= rowStart; i--) {

					System.out.print(table[i][colStart]);
				}
			}

			colStart++;

		}

	}

}
