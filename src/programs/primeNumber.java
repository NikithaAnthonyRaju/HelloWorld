package programs;
public class primeNumber {

	public static void main(String[] args) {
//		
//		System.out.println(isPrimeNumber(17));
//		System.out.println(isPrimeNumber(15));
//		System.out.println(isPrimeNumber(9));
		
		for(int i=0; i<=15;i++){

			System.out.println(i +" = "+ isPrimeNumber(i));

		}

	}
	
	private static boolean isPrimeNumber(int number){
		
		for(int i=2; i<=number/2; i++){
			
			if(number%i == 0){
				return false;				
			}
		}
		return true;
		
	}
}
