package programs;

public class printRectangle {

	public static void main(String[] args) {
		
		Rectangle(6,15);
		Rectangle(6,6);
	}
	
	private static void Rectangle(int rows, int cols){
		
		for (int i = 1; i <= rows; i++) {			
			for (int j = 1; j <= cols; j++) {
				
				if (i != 1 && i != rows) {					
					if (j == 1 || j == cols) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					System.out.print("*");
				}
			}			
			System.out.println();
		}
	}
}


