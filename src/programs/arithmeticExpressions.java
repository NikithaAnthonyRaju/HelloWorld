package programs;

public class arithmeticExpressions {
	
	public static void main(String[] args) {
		int x = 5;
		    x = 3;
		    System.out.println("Assignment (x = 3) : " + x);

		    x = 5;
		    x += 5;
		    System.out.println("Assign x plus another integer to itself (x += 5): " + x);

		    x = 5;
		    x -= 4;
		    System.out.println("Assign x minus another integer to itself (x -= 4): " + x);

		    x = 5;
		    x *= 6;
		    System.out.println("Assign x multiplied by another integer to itself (x *= 6): " + x);

		    x = 5;
		    x /= 5;
		    System.out.println("Assign x divided by another integer to itself (x /= 5): " + x);
		    
		    x = 5;
		    x |= 3;
		    System.out.println("Assignment (x = 3) : " + x);
		    
		    String A = "Nikitha";
		    String B = "Anthony";
		    System.out.println(A+B);
		    System.out.println(A+=B);
		    System.out.println(A.concat(B));
		    System.out.println(A+B);
		    System.out.println(B+=B);
		    System.out.println(B.concat(B));
		    
		    System.out.println(-10/-7*-10);
		    
	}

}
