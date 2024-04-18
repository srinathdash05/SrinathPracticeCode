package Test;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sujata2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		FileInputStream fs = new FileInputStream("D://Study Material//Test.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		Iterator<Row> rowIterator = sheet.iterator();
		while(rowIterator.hasNext()) {
			Row row  = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				switch(cell.getCellType()) {
				case STRING:  
					System.out.print(cell.getStringCellValue());
					//map.put(cell.getStringCellValue(), cell.getStringCellValue());
					break;
					
				default:
					break;
					
				}
				System.out.print("|");
			}
			System.out.println();
		}
		wb.close();
		fs.close();
		
		for(Entry<String, String> entry : map.entrySet()) {
			
			System.out.println("The key is: " +entry.getKey()+ " the value is: " +entry.getValue());
			
		}

	}

}
