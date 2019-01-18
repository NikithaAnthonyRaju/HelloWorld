import java.util.*;

public class Main {
 public static void main(String args[]) {

  String word = "adarshsrad";
  Character letter = noneRepeatableWord(word);
  System.out.println("First Non Repeatable Word - " + letter);
 }

 public static Character noneRepeatableWord(String word) {

  Set < Character > set1 = new LinkedHashSet < > ();
  for (int i = 0; i < word.length(); i++) {
   if (set1.contains(word.charAt(i))) {
    System.out.println("Its presnt hence removing");
    set1.remove(word.charAt(i));
   } else {
    set1.add(new Character(word.charAt(i)));
   }

  }

  return set1.iterator().next();
 }
}