package nandu;

public class DuplicateElementInIntArray {
 public static void main(String[] args) {
   int [] arr = {1, 6, 3, 1, 3, 6, 6,7};
  int size = arr.length;
  printDuplicate(size, arr);
 }
 public static void printDuplicate(int n, int[] arr) {
  for (int i = 0; i < n; i++) {
   int index = arr[i] % n;
   arr[index] += n;
  }

  // Now check which value exists more
  // than once by dividing with the size
  // of array
  for (int i = 0; i < n; i++) {
   if ((arr[i] / n) > 1)
    System.out.println(i + " ");
  }
 }
}