package srinath.srinath;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet {
	static String FileName ="DemoSheet1.xlsx";

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		XSSFWorkbook wb1 = new XSSFWorkbook();
		
		XSSFSheet sh1 = wb1.createSheet("Sheet1");
		
		XSSFRow row1;
		
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] {"Username", "Password"});
		data.put("2", new Object[] {"Jaga", "ABC123"});
		Set<String> keyid  = data.keySet();
		int rowid = 0;
		for(String key : keyid) {
			row1= sh1.createRow(rowid++);
			Object[] objArr = data.get(key);
			int cellid =0;
			for(Object obj : objArr) {
				Cell cell1 = row1.createCell(cellid++);
				cell1.setCellValue((String)obj);
			}
		}
		FileOutputStream fout = new FileOutputStream(new File ("D:\\Automation 2023-24\\" +FileName));
		wb1.write(fout);
		fout.close();
		
		FileInputStream fs = new FileInputStream("D:\\Automation 2023-24\\"+FileName);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		Iterator<Row> rowIterator = sheet.iterator();
		while(rowIterator.hasNext()) {
			Row row = rowIterator.next();
			
			Iterator<Cell>cellIterator = row.iterator();
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				switch(cell.getCellType()){
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
		
		

	}

}
