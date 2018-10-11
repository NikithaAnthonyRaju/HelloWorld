package IOFiles;

import java.io.FileInputStream;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.aspose.cells.SaveFormat;

public class convertCsv2Xlsx {

	public static void main(String[] args) throws Exception {

		String dirPath = "C:\\Users\\****\\Desktop\\";

		com.aspose.cells.Workbook wb = new com.aspose.cells.Workbook(dirPath + "***************.csv");
		wb.save(dirPath + "outputConvertCSVToExcelFormats.xlsx", SaveFormat.XLSX);

		FileInputStream fis = new FileInputStream(dirPath + "outputConvertCSVToExcelFormats.xlsx");
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);

		DataFormatter formatter = new DataFormatter();
		Map<String, String> map = new LinkedHashMap<>();
		List<String> listKeys = new LinkedList<>();
		List<String> listValues = new LinkedList<>();

		String PDNumber = "ABCD****";
		String key = "";
		String values = "";
		int valueRowCount = 0;
		int keyColCount = 0;
		int valueColCount = 0;

		for (int a = 2; a <= sheet.getLastRowNum(); a++) {
			for (int b = sheet.getRow(a).getFirstCellNum(); b < sheet.getRow(a).getLastCellNum(); b++) {

				if (a == 2 && keyColCount == 0) {
					while (keyColCount < sheet.getRow(a).getLastCellNum()) {
						key = formatter.formatCellValue(sheet.getRow(a).getCell(keyColCount)).trim();
						// System.out.println(key);
						listKeys.add(key);
						keyColCount++;
					}
				}

				if (valueColCount == 0 && formatter.formatCellValue(sheet.getRow(a + 1).getCell(b)).equals(PDNumber)) {
					valueRowCount = a + 1;
					while (valueColCount < sheet.getRow(valueRowCount).getLastCellNum()) {
						values = formatter.formatCellValue(sheet.getRow(valueRowCount).getCell(valueColCount)).trim();
						// System.out.println(values);
						listValues.add(values);
						valueColCount++;
					}
					break;
				}

			}
		}

		for (int i = 0; i < listKeys.size(); i++) {
			map.put(listKeys.get(i), listValues.get(i));
		}
		System.out.println(map.entrySet());
	}
}
