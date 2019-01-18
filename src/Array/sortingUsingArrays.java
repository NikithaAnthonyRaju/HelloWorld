// Sorting using Collections

import java.util.*;

public class Main {
 public static void main(String[] args) {
  List < Integer > list = Arrays.asList(3, 4, 5, 6, 1, 2, 9, 8, 7);
  System.out.println("List before sorting" + list);
  Collections.sort(list);
  System.out.println("List after sorting" + list);
  System.out.println("Max of: " + Collections.max(list));
  System.out.println("Second Greatest No: " + list.get(list.size() - 2));
  System.out.println("Min of: " + Collections.min(list));
  System.out.println("Second Minimum No: " + list.get(list.size() - (list.size() - 1)));

  String str[] = {"Apple","Orange","Banana","Mango","Pine"};
  List < String > listStr = Arrays.asList(str);
  System.out.println("List before sorting" + listStr);
  Collections.sort(listStr);
  System.out.println("List after sorting" + listStr);
 }
}