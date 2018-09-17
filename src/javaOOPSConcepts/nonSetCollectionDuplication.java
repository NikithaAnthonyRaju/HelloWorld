package javaOOPSConcepts;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class nonSetCollectionDuplication {
	public static void main(String[] args) {
		List<Integer> arrayList = Arrays.asList(1, 1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 0, 11);
		System.out.println(arrayList);
		Set<Integer> set = new HashSet<Integer>(arrayList);
		System.out.println(set);
		Set<Integer> set2 = new LinkedHashSet<Integer>(arrayList);
		System.out.println(set2);
	}

}
