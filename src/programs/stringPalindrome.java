package programs;

public class stringPalindrome {

	public static void main(String[] args) {
		
		
		System.out.println(isStingPalindrome("ABCBA"));
		System.out.println(isIntPalindrome(229));
	}
	
	public static boolean isStingPalindrome(String word){
		
		String reverse ="";
		
		for(int i=word.length()-1; i>=0; i--){			
			reverse = reverse + word.charAt(i);			
		}

		if(word.equals(reverse)){			
			return true;
		}
		
		else{			
			return false;
		}
		
	}
	
	public static boolean isIntPalindrome(int number){
		
		int palindrome = number;
		int reverse = 0;
		
		while(palindrome!=0){
			
			int reminder = palindrome % 10;
			reverse = reverse * 10 + reminder;
			palindrome = palindrome/10;		
		}

		if(number==reverse){			
			return true;
		}		
		else {
			return false;
		}
	}

}
