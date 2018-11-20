package programs;

public class bubbleSort {

	public static void main(String[] args) {

		int[] Number = { 12, 33, 1, 12, 88, 44, 88 };

		BubbleSort(Number);
		for(int i=0; i < Number.length; i++){  
            System.out.print(Number[i] + " ");  
    }  
	}

	static void BubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}
}