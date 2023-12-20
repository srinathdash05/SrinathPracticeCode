package srinath.srinath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
  
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream Fs = new FileInputStream("D:\\Automation 2023-24\\AutomationTestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(Fs);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		Iterator<Row> rowIterator = sheet.iterator();
		while(rowIterator.hasNext()) {
			Row row = rowIterator.next();
			
			Iterator<Cell> cellIterator = row.cellIterator();
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				switch(cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
					
				
				default:
					break;
					
				}
				System.out.print("|");
			}
			System.out.println();
		}
		wb.close();
		Fs.close();

	}
	
	
}
