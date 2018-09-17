package javaOOPSConcepts;

public class abstractClassWithConstructor extends abstractProduct{

	public abstractClassWithConstructor() {
		super(2);
	}
	
	public static void main (string args[]){
		
		System.out.println("Constuctor is successful");
		
		multiply(10);
		
	}
}
