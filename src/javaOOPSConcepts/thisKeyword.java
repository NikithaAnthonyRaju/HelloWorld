package javaOOPSConcepts;

public class thisKeyword {
	
	 public static void main(String args[]){
	   account obj = new account();
	   obj.setData(2,3);
	   obj.showData();
	   
	   account obj1 = new account();
	   obj1.setData(2,3);
	   obj1.showData();
	   
//	   Summary
//	   Keyword 'THIS' in Java is a reference variable that refers to the current object.
//	   It can be used to refer current class instance variable
//	   It can be used to invoke or initiate current class constructor
//	   It can be passed as an argument in the method call
//	   It can be passed as argument in the constructor call
//	   It can be used to return the current class instance
//	   "this" is a reference to the current object, whose method is being called upon.
//	   You can use "this" keyword to avoid naming conflicts in the method/constructor of your instance/object.

	   
	 }

}
