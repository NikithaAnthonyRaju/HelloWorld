package programs;

public class factorial {

	public static void main(String[] args) {

		int num = 10;
		int fact = 1;

		for (int i = num; i > 0; i--) {
			System.out.println("fact*i =" + fact + "*" + i);
			fact = fact * i;
			System.out.println("fact=" + fact);
		}
		// System.out.println(fact);
	}

}
