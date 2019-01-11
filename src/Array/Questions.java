package nandu;

public class Questions {
 public static void JavaHungry(Object o) {
  System.out.println("Object");
 }
 public static void JavaHungry(String s) {
  System.out.println("String");
 }
 /*public static void JavaHungry(StringBuffer i){
 	System.out.println("Object");
 }*/


 public static void main(String[] args) {
  if (null == null)
   JavaHungry(null);

 }

}