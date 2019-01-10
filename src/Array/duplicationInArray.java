/* Program to find the duplicate values in an array*/

public class javaProgram {

 public static void main(String args[]) {

  int[] givenArray = {2,2,4,6,6,3,7,8,9,0,9};

  for (int i = 0; i < givenArray.length; i++) {

   for (int j = i + 1; j < givenArray.length; j++) {

    if (givenArray[i] == givenArray[j]) {

     System.out.println(givenArray[j]);
    }
   }
  }

 }
}

public class MainClass 
{   
    public static void main(String[] args) 
    {
        String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
 
        HashSet<String> set = new HashSet<String>();
 
        for (String arrayElement : strArray)
        {
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }
    }    
}