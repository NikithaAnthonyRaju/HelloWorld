package javaOOPSConcepts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortList {

	public static void main(String[] args) {
		
		List<String> ABC = new ArrayList<String>();
		ABC.add("D");
		ABC.add("E");
		ABC.add("A");
		ABC.add("V");
		Collections.sort(ABC);
		System.out.println(ABC);
		List<Integer> DXC = new ArrayList<Integer>();
		DXC.add(2);
		DXC.add(1);
		DXC.add(3);
		DXC.add(5);
		Collections.sort(DXC);
		System.out.println(DXC.size()-2);
		System.out.println(DXC.get(DXC.size()-2));

	}

}
