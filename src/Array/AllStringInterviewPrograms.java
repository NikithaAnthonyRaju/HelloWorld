package nandu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
/*
 * This program contain all string related interview programs.
 * 1.Reverse a char array
 * 2.Reverse a string using stack
 * 3.Reverse a string using recursion
 * 4.Reverse string word by word
 * 5.Reverse a string word by word using string buffer reverse method
 * 6.Reverse each alternate character of a string
 * 7.Check duplicate character in a string using ASCII code of char. 
 * 8.Check duplicate character in string using HashSet
 * 9.Check duplicate char in string using Sort technique
 * 10.Check duplicate char in string with using only loops
 * 11.Find no of duplicate elements in a string
 * 12.find a character how many time present in the string
 * 13.Remove duplicate using loop
 * 14.Remove duplicate using hashset
 */
public class AllStringInterviewPrograms {
 public static String reverse = "";
 public static void main(String[] args) {
  String str = "Ramesh Babu Gummadi";
  char[] c = str.toCharArray();
  /*reverseCharArray(c);
  reverseStringStack(c);
  String revStr = reverseStringRecursion(str);
  System.out.println();
  System.out.println("Reverse String Recursion : "+revStr);
  System.out.println();
  System.out.println("Reverse Word By Word:::::");
  System.out.println(revWordByWord(str));
  System.out.println("Reverse Word By Word Reverse Method:::::");
  System.out.println(revWordByWordReverseMethod(str));
  System.out.println("Swap Alternate chars of a string:");
  swapEverAlternateChar(str);
  boolean dupChar = checkDupCharInString(str);
  System.out.println("This String Unique characters : "+dupChar);	
  boolean dupCharSortTechnique = sortAndCheckDupChars("ABCDEFGHIF");
  System.out.println("It contain no duplicates : "+dupCharSortTechnique);
  boolean dupCharSortTechnique1 = sortAndCheckDupChars(str);
  System.out.println("It contain no duplicates : "+dupCharSortTechnique1);
  boolean findDupWithOnlyArrays = findDupWithOnlyArrays("ABCDEFGHIF");
  System.out.println("It contain no duplicates : "+dupCharSortTechnique);
  boolean findDupWithOnlyArrays1 = findDupWithOnlyArrays(str);
  System.out.println("It contain no duplicates : "+dupCharSortTechnique1);
  countNoOfDupElement(str);
  findHowmanyTimesAcharPresentInString(str,"u");
  */
  removeDuplicateChars(str);
  //removeDupHasSet(str);
  //findDupUsingHashMap(str);
  countNoOfDupElement(str);
 }
 public static void reverseCharArray(char[] c) {
  System.out.println("reverseCharArray:");
  System.out.println(c.length - 1);
  for (int i = c.length - 1; i >= 0; i--) {
   System.out.print(c[i]);
  }
  System.out.println();
 }

 public static void reverseStringStack(char[] c) {
  System.out.println("reverseStringStack:");
  Stack s = new Stack();
  for (int i = 0; i <= c.length - 1; i++) {
   s.push(c[i]);
  }
  System.out.println(s.size());
  System.out.println(s);
  while (s.size() > 0) {
   System.out.print(s.pop());
  }
 }
 public static String reverseStringRecursion(String str) {
  StringBuffer sb = new StringBuffer();

  if (str.length() == 0)
   return str;
  else {
   reverse = str.charAt(str.length() - 1) + reverseStringRecursion(str.substring(0, str.length() - 1));
   return reverse;
  }
 }
 public static String revWordByWord(String str) {
  StringTokenizer tokens = new StringTokenizer(str);
  StringBuffer sbf = new StringBuffer();
  int i = 0;
  while (tokens.hasMoreTokens()) {
   i++;
   String strToken = tokens.nextToken();
   String temp = "";
   if (i % 2 == 1) {
    char[] charArr = strToken.toCharArray();
    for (int j = charArr.length - 1; j >= 0; j--) {
     temp += charArr[j];
    }
    sbf.append(temp + " ");
   } else {
    sbf.append(strToken + " ");
   }
  }
  return sbf.toString();
 }
 public static String revWordByWordReverseMethod(String str) {
  StringTokenizer tokens = new StringTokenizer(str);
  StringBuffer sbf = new StringBuffer();
  int i = 0;
  while (tokens.hasMoreTokens()) {
   i++;
   String strToken = tokens.nextToken();
   String temp = "";
   if (i % 2 == 0) {

    sbf.append(new StringBuffer(strToken).reverse());
   } else {
    sbf.append(strToken);
   }
  }
  return sbf.toString();
 }
 public static void swapEverAlternateChar(String st) {
  st = st.replaceAll("\\s+", "");
  System.out.println(st);
  char[] c = st.toCharArray();
  char temp;
  for (int i = 0; i < c.length - 1; i++) {
   if (i % 2 == 0) {
    temp = c[i + 1];
    c[i + 1] = c[i];
    c[i] = temp;
   }
  }
  System.out.println(c);
 }


 //ABABA
 public static boolean checkDupCharInString(String str) {
  boolean[] ascii = new boolean[255];
  for (int i = 0; i < str.length() - 1; i++) {
   int charVal = str.charAt(i);
   if (ascii[charVal]) return false;
   ascii[charVal] = true;
  }
  return true;
 }
 //while adding element to Set, it will return false if the element exists already.
 //This is the best and quick way to find.Time complexity O(n)

 public static boolean checkUniqueCharsUsingHashSet(String str) {
  boolean result = false;
  HashSet < Character > uniqueSet = new HashSet < Character > ();
  for (char c: str.toCharArray()) {
   result = uniqueSet.add(c);
   if (result == false) return result;
   //System.out.println(result);
  }
  return true;
 }
 public static boolean sortAndCheckDupChars(String str) {
  List < Character > list = new ArrayList < Character > ();
  char[] c = str.toCharArray();
  for (int i = 0; i < c.length - 1; i++) {
   list.add(c[i]);
  }
  Collections.sort(list);
  for (int j = 0; j < list.size(); j++) {
   if (c[j] == c[j + 1]) return false;
  }
  return true;
 }
 public static boolean findDupWithOnlyArrays(String str) {
  for (int i = 0; i < str.length() - 1; i++) {
   for (int j = i + 1; j < str.length() - 1; j++) {
    if (str.charAt(i) == str.charAt(j)) return false;
   }
  }
  return true;
 }

 public static void countNoOfDupElement(String str) {
  int stLen = str.length() - 1;
  str = str.replaceAll("\\s", "");
  int stLen1 = str.length() - 1;
  int count = stLen - stLen1;
  System.out.println("Count : " + count);
  System.out.println(str);
 }

 public static void findHowmanyTimesAcharPresentInString(String s, String c) {
  int count = (s.length() - s.replaceAll(c, "").length());
  System.out.println(count);
 }

 public static void removeDuplicateChars(String str) {
  char ch = ' ';
  String ans = "";
  for (int i = 0; i < str.length() - 1; i++) {
   ch = str.charAt(i);
   ans = ans + ch;
   if (ch != ' ') {
    str = str.replace(ch, ' ');
   }
  }
  System.out.println(ans.length());
  System.out.println("String after removing duplicate : " + ans.replaceAll("\\s", ""));
 }
 //Remove duplicate using hashset
 public static void removeDupHasSet(String str) {
  Set < Character > s = new HashSet < Character > ();
  for (int i = 0; i < str.length(); i++) {
   s.add(str.charAt(i));
  }
  System.out.println("HashSet remove duplicate " + s);
 }

 //find duplicate character in string using map
 public static void findDupUsingHashMap(String str) {
  Map < Character, Integer > dupMap = new HashMap < Character, Integer > ();
  char[] c = str.toCharArray();
  for (Character ch: c) {
   if (dupMap.containsKey(ch)) {
    dupMap.put(ch, dupMap.get(ch) + 1);
   } else {
    dupMap.put(ch, 1);
   }
  }
  Set < Character > s = dupMap.keySet();
  for (Character cha: s) {
   if (dupMap.get(cha) > 1) {
    System.out.println(cha + "--->" + dupMap.get(cha));
   }
  }
 }
}