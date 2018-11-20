package programs;

import java.util.Arrays;

public class sampleQuestions {

	public static void main(String[] args) {
		
		int AA = 345;		
		int B = AA/10;	
		int C = AA%10;
		System.out.println(Integer.valueOf(B)+""+Integer.valueOf(C));
		String D = Integer.valueOf(B)+""+Integer.valueOf(C);
		
		String ABC = new String("Love");
		String ABC2 = "Love";
		System.out.println(!ABC.equals(ABC2));
		
		Integer DEF = new Integer(26);
		int DEF2 = 27;
		System.out.println(DEF!=DEF2);
		
		int array1[] = new int[10];
		array1[0] = 0;
		array1[1] = 1;
		int[] array2 = new int[10];
		array2[0] = 1;
		array2[1] = 1;
		System.out.println("******************");
		System.out.println(Arrays.equals(array1, array2));
		System.out.println(array1.equals(array2));
		System.out.println(array1==array2);
		System.out.println("******************");

	}

}
