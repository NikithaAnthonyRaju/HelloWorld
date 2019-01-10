/*  java program to find all pairs of elements in an integer array whose sum is equal to a given number */

public class javaProgram {

 public static void main(String args[]) {

  int givenSum = 10;

  int[] givenArray = {1,2,3,4,5,6,7,8,9,0};

  for (int i = 0; i < givenArray.length; i++) {

   for (int j = i + 1; j < givenArray.length; j++) {

    if (givenArray[i] + givenArray[j] == givenSum) {

     System.out.println(givenArray[i] + "+" + givenArray[j] + "=" + givenSum);

    }
   }
  }


 }
}