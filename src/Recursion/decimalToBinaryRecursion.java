//Conversion of decimal to binary using Recursion in java
package Recursion;

public class decimalToBinaryRecursion{
 public static void main(String[] args) {
  decToBin(22);
 }

 public static void decToBin(int n) {
  if (n > 0) {
   decToBin(n / 2);
   System.out.printf("%d", n % 2);
  }
 }
}