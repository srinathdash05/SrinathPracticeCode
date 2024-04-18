package Test;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SpecificColumnReadExcel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fs = new FileInputStream("D://Study Material//Test.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheetAt(0);
		int totalRow = sheet.getLastRowNum();
		for(int i =1;i<=totalRow;i++) {
			
			if(sheet.getRow(i).getCell(1).getStringCellValue().equalsIgnoreCase("abc23!")) {
				System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
			}
		}
		
		
	wb.close();	
		

	}

}
