package Test;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SeleniumReadExcel {

	public static void main(String[] args) throws Exception {
		String path = System.getProperty("user.dir")+"\\TestData\\TestData1.xlsx";
		System.out.println(path);
		
		String sheetName = "TestData";
		//String testdata[][] = readExcel(sheetName,path);
		//System.out.println(testdata[2][2]);
		
		readExcel(sheetName,path);
		
		// TODO Auto-generated method stub

	}
	
	public static String[][] readExcel(String excelSheetName, String path) throws Exception {
		
		FileInputStream fs = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet(excelSheetName);
		int totalRow = sheet.getLastRowNum();
		
		XSSFRow rowCell = sheet.getRow(0);
		int totalCol = rowCell.getLastCellNum();
		DataFormatter df = new DataFormatter();
		String testData [][] = new String[totalRow][totalCol];
		
		for(int i =1;i<=totalRow;i++) {
			for(int j=0;j<totalCol;j++) {
				
				testData[i-1][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
				//System.out.println(testData[i-1][j]);
			}
		}
		wb.close();
		return testData;
	}

}
