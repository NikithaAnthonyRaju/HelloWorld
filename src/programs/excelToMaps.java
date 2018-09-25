package programs;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelToMaps {

	public static void main(String[] args) throws Exception {

		Map<String, List<String>> inputValue = excel();
//		System.out.println(inputValue.get("Name"));
		System.out.println(inputValue.get("Name").get(0));
		System.out.println(inputValue.get("Joining Years").get(0));
		System.out.println(inputValue.get("Technology").get(0));
		
//		List<String> list = inputValue.get("Name");
//		System.out.println(list.get(0));
	}

	public static Map<String, List<String>> excel() throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\na21\\Desktop\\profile.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("DXC");

		int firstRowNum = sheet.getFirstRowNum();
		int lastRowNum = sheet.getLastRowNum();
		int firstCellNum = sheet.getRow(firstRowNum).getFirstCellNum();
		int lastCellNum = sheet.getRow(firstRowNum).getLastCellNum();

		Map<String, List<String>> map = new HashMap<>();
		List<String> listValues = null;
		String key = "";
		String values = "";

		for (int i = firstRowNum; i <= lastRowNum; i++) {

			key = sheet.getRow(i).getCell(0).getStringCellValue();
			listValues = new LinkedList<String>();

			for (int j = firstCellNum + 1; j < lastCellNum; j++) {

				values = sheet.getRow(i).getCell(j).getStringCellValue();
				listValues.add(values);
			}

			map.put(key, listValues);
//			System.out.println(map.entrySet());

		}

		return map;

	}
	
}
