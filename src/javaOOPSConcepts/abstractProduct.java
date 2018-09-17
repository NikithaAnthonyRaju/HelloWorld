package javaOOPSConcepts;

public abstract class abstractProduct {
	
	static int multipleBy = 9;
	
	public abstractProduct(int multipleBy){
		this.multipleBy = multipleBy;
	}
	
	public static int multiply(int val){
		return multipleBy*val;
	}

}
