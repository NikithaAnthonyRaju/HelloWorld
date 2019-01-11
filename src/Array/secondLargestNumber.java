public class arrayss {

 public static void main(String args[]) {

 int givenNo[] = {22,44,55};

 int firstNo, secondNo = 0;

  if (givenNo.length < 2) {

   System.out.println("Array is lesser than 2 values");
  } else {

   firstNo = givenNo[0];

   for (int i = 1; i < givenNo.length; i++) {

    if (firstNo < givenNo[i]) {

     secondNo = firstNo;
     firstNo = givenNo[i];

    }

   }
  }

  System.out.println(secondNo);
 }
}