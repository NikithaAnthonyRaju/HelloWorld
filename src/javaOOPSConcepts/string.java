package javaOOPSConcepts;

public class string {

	public static void main(String[] args) {

		String one = "Rock";
		String two = "Star";
		
//		Concatenation
		String output1 = one.concat(two);
		String output2 = one + two ;
		
//		Length		
		System.out.println("Length - "+ one.length());
		
//		Index of
		System.out.println("Index - "+output1.indexOf("t"));
		System.out.println("Char - "+output2.charAt(3));
		
//		Compare
		System.out.println("Compare - "+ output1.compareTo(output2));
		System.out.println("CompareIgnore - "+ output2.compareToIgnoreCase("Star"));
		
//		Contains
		System.out.println("Contains Text - "+ output1.contains(one));
		
//		Ends with
		System.out.println("Ends with - "+ output2.endsWith(two));
		
//		Replace
		System.out.println("Replace All - "+ output1.replaceAll(one, two));
		System.out.println("Replace First - "+ output1.replaceFirst(one, two));
		
//		upper/lower Case
		System.out.println("Upper Case - "+ output1.toUpperCase());
		System.out.println("Lower Case - "+ output2.toLowerCase());
		
		
		
	}

}
