package programs;

public class printPatterns {
	
	public static void main(String[] args) {
		
		pattern(5);
		patternNum(5);
		patternNumIncre(5);
		patterns(5);
		patternTrian(5);
	}
	
	public static void pattern(int n){
		
		for(int i=0; i<n; i++){
						
			for(int j=0; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
	
	public static void patternNum(int n){
		int num =1;
		
		for(int i=0; i<n; i++){			
						
			for(int j=0; j<=i; j++){
				System.out.print(num + " ");
//				num++;
			}
			System.out.println();
		}		
	}
	
	public static void patternNumIncre(int n){
		
		int num =1;
		
		for(int i=0; i<n; i++){
						
			for(int j=0; j<=i; j++){
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}		
	}
	
	public static void patterns(int n){
		
		int i, j, k=2*n-2;
		
		for(i=0; i<n; i++){
						
			for(j=0; j<k; j++){
				System.out.print(" ");
			}
			
			k=k-2;
			
			for(j=0; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}		
	}

	public static void patternTrian(int n){
		
		int i, j, k=2*n-2;
		
		for(i=0; i<n; i++){
						
			for(j=0; j<k; j++){
				System.out.print(" ");
			}
			
			k=k-1;
			
			for(j=0; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
}