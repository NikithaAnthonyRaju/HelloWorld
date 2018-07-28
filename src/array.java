/**
 * 
 */

/**
 * @author aniki
 *
 */
public class array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int array[] = new int[7];
//        for (int count=0;count<7;count++){
//           array[count]=count+1;
//       }
//       for (int count=0;count<7;count++){
//           System.out.println("array["+count+"] = "+array[count]);
//       }
//       
//      System.out.println("Length of Array  =  "+array.length);
//      array[8] =10;
		
		String []b={"Apple","Mango","Orange"};
	    System.out.println("Before Function Call    "+b[0]);
	    passByReference(b);
	    System.out.println("After Function Call    "+b[0]);
		
	}
	
	 public static void passByReference(String a[]){
	     a[0] = "Changed";
	   }

}
