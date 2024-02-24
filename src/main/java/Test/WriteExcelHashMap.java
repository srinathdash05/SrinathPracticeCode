package Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelHashMap {

	public static void main(String[] args) throws Exception {

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("TestData");

		HashMap<String, String> map = new HashMap<String, String>();

		int rowNo = 0;

		map.put("Srinath Dash", "E11172136");
		map.put("Sujata Dash", "E11530412");

		for (Entry<String, String> entry : map.entrySet()) {

			XSSFRow row = sheet.createRow(rowNo++);
			row.createCell(0).setCellValue(entry.getKey());
			row.createCell(1).setCellValue(entry.getValue());
		}

		FileOutputStream fout = new FileOutputStream("D:\\Study Material\\TestData1.xlsx");
		wb.write(fout);
		wb.close();

	}

}
