/*  Write a java program to check the equality of two arrays? */

public class javaProgram {

 public static void main(String args[]) {

  int[] firstArray = {2,2,4,6,6,3,7,8,9,0};
        
  int[] secondArray = {1,2,3,4,5,6,7,8,9,0};

  if (firstArray.length == secondArray.length) {

   System.out.println("Arrays length are same.");

   for (int i = 0; i < firstArray.length; i++) {

    if (firstArray[i] == secondArray[i]) {

     System.out.println("Values are same - " + secondArray[i]);
    } else {

     System.out.println("Values are different - " + secondArray[i]);
    }
   }

  } else {

   System.out.println("Array length are different.");
  }

 }
}