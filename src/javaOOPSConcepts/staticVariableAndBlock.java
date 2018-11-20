package javaOOPSConcepts;

public class staticVariableAndBlock {

	public static String A;
	public static int B;
	

	// Static Block used to initialize the variable
	static {

		A = "Aphabets";
		B = 24;
		int C = 10;
		System.out.println("Static Block " + B+C);
	}

	// This is Static Method and needs to be called in Main Method.
	static void methodA() {
		System.out.println(A);

	}

	public static void main(String[] args) {
		
		B = +1;
		System.out.println("Value After exceuting Static Block " + B);

//		We can't call C value as its not a static variable.
//		System.out.println("To check the Int value of C in Static Block " + C);
		
	}

}
