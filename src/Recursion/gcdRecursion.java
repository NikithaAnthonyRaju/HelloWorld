//GCD
package Recursion;

public class gcdRecursion{
 public static void main(String[] args) {
  System.out.println (gcd(22, 8));
 }

 public static int gcd(int m, int n) {
  if (n == 0) {
	return m;
	}
  else {
	return gcd(n, m%n);
  }
 }
}