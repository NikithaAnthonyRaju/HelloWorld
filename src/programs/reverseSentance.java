package programs;

public class reverseSentance {

	public static void main(String[] args) {
		
		reverseString("My name is Nikitha");

	}
	
	public static String reverseString(String line) { 
		if (line.trim().isEmpty()) { 
			return line; 
			} 
		StringBuilder reverse = new StringBuilder(); 
		String[] sa = line.trim().split("\\s"); 
		for (int i = sa.length - 1; i >= 0; i--) { 
			reverse.append(sa[i]); 
			reverse.append(' '); 
			} 
		return reverse.toString().trim(); 
	}


}
