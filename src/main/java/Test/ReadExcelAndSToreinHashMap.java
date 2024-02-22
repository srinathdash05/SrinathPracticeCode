package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelAndSToreinHashMap {

	public static void main(String[] args) throws Exception {
		
		HashMap<String, String> map = new HashMap<String, String>();
		FileInputStream fs = new FileInputStream("D://Study Material//Test.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		for(int i=0;i<rowCount;i++) {
			
			String key = sheet.getRow(i).getCell(0).getStringCellValue();
			String value = sheet.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
		}
		
		
		for(Entry<String, String> entry : map.entrySet()) {
			
			System.out.println("The key is: " +entry.getKey()+ " the value is: " +entry.getValue());

		}

	}

}
