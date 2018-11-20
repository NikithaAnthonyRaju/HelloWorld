package IOFiles;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class uniqueValuesInFile {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(new File("C:\\Users\\na21\\Desktop\\Query1.txt"));
		List<String> list = new LinkedList<>();

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] split = line.split(" ");
			for (int i = 0; i < split.length; i++) {
				if (list.contains(split[i])) {
					list.remove(split[i]);
				} else {
					list.add(split[i]);
				}
			}
		}

		System.out.println(list.size());
		System.out.println(list);
	}
}