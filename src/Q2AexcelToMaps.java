import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q2AexcelToMaps {

	public static void main(String[] args) throws Exception {

		Map<String, String> inputValue = excel();
		System.out.println(inputValue.get("Name"));
		System.out.println(inputValue.get("Phone No"));

	}

	public static Map<String, String> excel() throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\na21\\Desktop\\profile - Copy.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("DXC");

		int firstRowNum = sheet.getFirstRowNum();
		int firstCellNum = sheet.getRow(firstRowNum).getFirstCellNum();
		int lastCellNum = sheet.getRow(firstRowNum).getLastCellNum();

		Map<String, String> map = new HashMap<>();
		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();

		for (int j = firstCellNum; j < lastCellNum; j++) {
			String key = sheet.getRow(0).getCell(j).getStringCellValue();
			list1.add(key);
		}

		for (int j = firstCellNum; j < lastCellNum; j++) {
			String values = sheet.getRow(1).getCell(j).getStringCellValue();
			list2.add(values);
		}

		for (int i = 0; i < list1.size(); i++) {
			map.put(list1.get(i), list2.get(i));
		}

		return map;

	}

}
