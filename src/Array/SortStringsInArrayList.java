package nandu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortStringsInArrayList {
 public static void main(String[] args) {
  List < Integer > li = new ArrayList < Integer > ();
  li.add(50);
  li.add(20);
  li.add(30);
  li.add(40);
  li.add(10);
  li.add(25);
  li.add(70);
  li.add(35);
  Collections.sort(li);

  Iterator < Integer > i = li.iterator();
  while (i.hasNext()) {
   System.out.println(i.next());
  }
 }

}