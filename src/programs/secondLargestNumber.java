package programs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class secondLargestNumber {

	public static void main(String[] args) {

		int arrayLength[] = { 2, 4, 8, 4, 7, 9, 10, 66, 99, 77, 88, 140, 100, 120, 160 };
		Integer array[] = { 2, 4, 8, 4, 7, 9, 10, 66, 99, 77, 88, 140, 100, 120, 160 };

		// 2nd For loop
		int A = 0;
		int C = 0;
		int D = 0;
		int E = 0;

		for (int i = 1; i < arrayLength.length; i++) {
			if (arrayLength[i] > arrayLength[A]) {
				C = arrayLength[i];
				A++;
				if (arrayLength[A] > arrayLength[D]) {
					E = arrayLength[A];
					D++;
				}
			}
		}

		System.out.println("First Largest Number - " + C);
		System.out.println("Second Largest Number - " + E);

		// Using For loop
		int temp;
		for (int i = 0; i < arrayLength.length; i++) {
			for (int j = i + 1; j < arrayLength.length; j++) {
				if (arrayLength[i] > arrayLength[j]) {
					temp = arrayLength[i];
					arrayLength[i] = arrayLength[j];
					arrayLength[j] = temp;
				}
			}
		}
		System.out.println("For Loop - " + arrayLength[arrayLength.length - 2]);

		// Array Sort
		Arrays.sort(arrayLength);
		System.out.println("Array Sort - " + arrayLength[arrayLength.length - 2]);

		// Collection Sort
		List<Integer> list = Arrays.asList(array);
		Collections.sort(list);
		System.out.println("Collection Sort - " + list.get(array.length - 2));
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(43);
		a.add(45);
		a.add(3);
		a.add(53);
		
		System.out.println(Collections.max(a));
		System.out.println(Collections.min(a));
					
		}
	}

