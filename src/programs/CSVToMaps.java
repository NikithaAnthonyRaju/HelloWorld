package programs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CSVToMaps {

	public static void main(String[] args) throws Exception {
		CSV();
	}

	public static void CSV() throws Exception {

		BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\na21\\Desktop\\Availability Quotes_Ethernet Access – Fibre_12.07.2018_08.10.2018.csv"));

		ArrayList<String> myList = new ArrayList<String>();
		String line = null;

		line = br.readLine();
		while (line != null) {
			myList.add(line);
			line = br.readLine();
		}

		Map<String, String> map = new LinkedHashMap<>();
		List<String> listKeys = new LinkedList<String>();
		List<String> listValues = new LinkedList<String>();

		for (int i = 3; i < myList.size(); i++) {
			if (myList.get(i).contains("PD04049058")) {

				String[] key = myList.get(2).split(",");
				for (int j = 0; j < key.length - 1; j++) {
					// System.out.println(key[j]);
					listKeys.add(key[j]);
				}
				
				String[] value = myList.get(i).split(",");
				for (int k = 0; k < value.length - 1; k++) {
					// System.out.println("Value:"+value[k]);
					listValues.add(value[k]);
				}

				break;
			} else {
				System.out.println("PD Number is not present in report");
			}
		}

		for (int a = 0; a < listKeys.size(); a++) {
			map.put(listKeys.get(a), listValues.get(a));

		}

		System.out.println(map.get("Date quote created"));
		System.out.println(map.get("Q2A Reference Number"));

	}

}
