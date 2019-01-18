import java.util.*;

public class Main {
 public static void main(String[] args) {
  List < Integer > list = Arrays.asList(3, 4, 5, 6, 1, 2, 9, 8, 7);
  System.out.println("List before reverse" + list);
  Collections.reverse(list);
  System.out.println("List after reverse" + list);


String str[] = {"Apple","Orange","Banana","Mango","Pine"};
  List < String > listStr = Arrays.asList(str);
  System.out.println("List before sorting" + listStr);
  Collections.sort(listStr);
  System.out.println("List after sorting" + listStr);
  Collections.reverse(listStr);
  System.out.println("List after reversing the sorting" + listStr);
 }
}