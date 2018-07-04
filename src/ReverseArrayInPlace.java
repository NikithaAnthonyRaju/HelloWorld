import java.util.Arrays;

public class ReverseArrayInPlace {

	public static void main(String[] args) {
		
		String[] names = {"Be", "Pine", "An"};
		System.out.println("Orginal Place" + Arrays.toString(names));
		reverse(names);
		System.out.println("Replaced Places" + Arrays.toString(names));
		
		String[] name = {"Be", "Pine"};
		System.out.println("Orginal Place" + Arrays.toString(name));
		reverse(name);
		System.out.println("Replaced Places" + Arrays.toString(name));
		
		String[] namess = {};
		System.out.println("Orginal Place" + Arrays.toString(namess));
		reverse(namess);
		System.out.println("Replaced Places" + Arrays.toString(namess));
	}
	
	private static void reverse(String[] array) { 
//		if (array == null || array.length < 2) { 
//			return; 
//			} 
		for (int i = 0; i < array.length / 2; i++) {
			String temp = array[i]; 
			array[i] = array[array.length - 1 - i]; 
			array[array.length - 1 - i] = temp; 
			} 
		}
}
