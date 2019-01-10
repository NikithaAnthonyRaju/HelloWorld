/*  java program to find the intersection of two arrays */

import java.util.Arrays;

public class javaProgram {

 public static void main(String args[]) {

    String firstSentence[] = {"This", "is", "first", "Sentence"};
    String secondSentence[] = {"This", "is", "second", "Sentence"}; 

  for (int i = 0; i < firstSentence.length; i++) {

   for (int j = 0; j < secondSentence.length; j++) {

    if (firstSentence[i].equals(secondSentence[j])) {

     System.out.println(secondSentence[j]);

    }
   }
  }

 }
}