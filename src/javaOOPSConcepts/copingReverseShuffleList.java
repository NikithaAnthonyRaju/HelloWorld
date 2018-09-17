package javaOOPSConcepts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class copingReverseShuffleList {

	public static void main(String[] args) {
		
		List<String> ABC = new ArrayList<String>();
		ABC.add("D");
		ABC.add("E");
		ABC.add("A");
		ABC.add("V");
		System.out.println(ABC);
		List<String> XYZ = new ArrayList<String>();
		XYZ.add("X");
		XYZ.add("L");
		XYZ.add("F");
		XYZ.add("G");
		System.out.println(XYZ);
		System.out.println("==================");
		Collections.copy(ABC, XYZ);
		System.out.println(ABC);
		System.out.println(XYZ);
		List<Integer> DXC = new ArrayList<Integer>();
		DXC.add(2);
		DXC.add(1);
		DXC.add(3);
		DXC.add(5);	
		System.out.println("==================");
		Collections.shuffle(DXC);
		System.out.println(DXC);
		System.out.println("==================");
		Collections.reverse(DXC);
		System.out.println(DXC);


	}
}