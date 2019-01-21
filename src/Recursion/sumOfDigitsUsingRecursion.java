//Sum of digits of a number using Recursion in java
package Recursion;

public class sumOfDigitsUsingRecursion{
 public static void main(String[] args) {
  System.out.println("Sum = " + sum(100));
 }

 public static int sum(int n) {
  if (n == 0) {
   return 0;
  } else {
   return n % 10 + sum(n / 10);
  }
 }
}