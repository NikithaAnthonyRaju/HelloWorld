package programs;

public class MyNumberSumRec {

	static int sum = 0;

	public void getNumberSum(int number) {

		if (number == 0) {
			System.out.println("1");

		} else {
			sum += (number % 10);
			System.out.println("2 " + sum);
			getNumberSum(number / 10);
			System.out.println("3");
		}
		System.out.println("Last return");
	}
	
	public static void main(String a[]) {
		MyNumberSumRec mns = new MyNumberSumRec();
		mns.getNumberSum(223);
		System.out.println("Sum is: " + sum);
	}

}
