package programs;

public class fibnocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 15;

		int[] febno = new int[count];
		febno[0] = 0;
		febno[1] = 1;
		
//		System.out.println(febno[0]);
//		System.out.println(febno[1]);
		
		for (int i = 2; i < count; i++) {
			febno[i] = febno[i - 1] + febno[i - 2];
//			System.out.println(febno[i]);
		}

		 for(int i=0; i<count; i++){
		 System.out.println(febno[i]+ "");
		 }
	}

}
