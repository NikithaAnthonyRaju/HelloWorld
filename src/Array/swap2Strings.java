public class Main {
 public static void main(String args[]) {

  String word1 = "Nikitha";
  String word2 = "Anthony";

  method1(word1, word2);
  method2(word1, word2);
  method3(word1, word2);
 }

 public static void method1(String A, String B) {

  System.out.println("1st Method - Swap using temp variable");

  String temp = "";

  temp = A;
  A = B;
  B = temp;

  System.out.println(A);
  System.out.println(B);
  System.out.println("***************************************");
 }

 public static void method2(String A, String B) {

  System.out.println("2nd Method - Swaping without temp variable");

  A = A + B;
  B = A.substring(0, A.length() - B.length());
  A = A.substring(B.length());

  System.out.println(A);
  System.out.println(B);
  System.out.println("***************************************");
 }

 public static void method3(String A, String B) {

  System.out.println("3rd Method - Swaping using function");

  A = returnFirst(B, B = A);

  System.out.println(A);
  System.out.println(B);
  System.out.println("***************************************");
 }
 static String returnFirst(String A, String B) {
  return A;
 }
}