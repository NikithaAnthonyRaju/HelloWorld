//Find the highest series of Number in a given Array 

import java.util.*;

public class seriesOfNumberInAnArray {
 public static void main(String[] args) {

    int arr[] =
      { 1, 2, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 4, 8,
      8, 8, 8, 8, 7, 7, 7, 7, 7, 8, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7
    };
    
  int greatestCount = 0;
  Map < Integer, Integer > map = new HashMap < > ();

  for (int i = 0; i < arr.length; i++) {
   int j = i;
   int count = 1;
   while (j < arr.length - 1) {
    if (arr[j] != arr[j + 1]) {
     break;
    }
    count++;
    j++;
   }
   if (count > greatestCount) {
    greatestCount = count;
    map.put(arr[i], greatestCount);
   }
  }
  for (Map.Entry < Integer, Integer > e: map.entrySet()) {
   if (e.getValue() == Collections.max(map.values())) {
    System.out.println(e.getKey() + " is repeated for " +
     e.getValue());
   }
  }
 }
}