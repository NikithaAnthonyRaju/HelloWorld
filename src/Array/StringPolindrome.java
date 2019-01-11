package nandu;

public class StringPolindrome {
 public static void main(String[] args) {
  //checkStringPolindromeByCharArr("Ramesh Babu Gummadi");
  //checkStringPolindromeByCharArr("Madam");
  checkStringPolindrome("Ramesh Babu Gummadi");
  checkStringPolindrome("madam");

 }
 public static void checkStringPolindromeByCharArr(String str) {
  char charArr[] = str.toCharArray();
  boolean flag = true;
  char[] tempArr = new char[charArr.length];
  for (int i = charArr.length - 1; i > 0; i--) {
   tempArr[i] = charArr[i];
  }
  for (int i = charArr.length - 1; i > 0; i--) {
   if (tempArr[i] != charArr[i]) {
    flag = false;
    break;
   }
  }
  if (flag) {
   System.out.println("Given String " + str + " is polindrome");
  } else {
   System.out.println("Given String " + str + " is not polindrome");
  }
 }

 public static void checkStringPolindrome(String str) {
  boolean flag = true;
  StringBuffer sbf = new StringBuffer();
  for (int i = str.length() - 1; i >= 0; i--) {
   sbf.append(str.charAt(i));
  }
  if (str.equals(sbf.toString())) {
   System.out.println("String Polindrome");
  } else {
   System.out.println("Not polindrome");
  }
 }


}