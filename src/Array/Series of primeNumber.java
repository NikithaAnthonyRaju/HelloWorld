// Series of primeNumber

public class HelloWorld {

 public static void main(String[] args) {

  int number = 100;
  for (int i = 0; i <= number; i++) {
   isPrime(i);
  }
 }

 public static void isPrime(int n) {


  boolean flag = false;
  for (int i = 2; i <= n / 2; i++) {

   if (n % i == 0) {
    flag = true;
    break;
   }
  }
  if (!flag) {
   System.out.print("Prime Number: " + n);
  }
 }
}