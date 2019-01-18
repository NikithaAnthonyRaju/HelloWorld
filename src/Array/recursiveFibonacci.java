public class Main {
 public static int a = 0;
 public static int b = 1;
 public static int c = 0;

 public static void main(String args[]) {
  fibnocci(6);
 }

 public static void fibnocci(int n) {
  if (n > 0) {
   System.out.println(a);
   c = a + b;
   a = b;
   b = c;
   fibnocci(n - 1);
  }
 }
}