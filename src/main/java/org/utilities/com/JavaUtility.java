package org.utilities.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class JavaUtility {

	public String sheename;
	public static  Properties prop;
	
	public static void openProp() {
		
		String path="D:\\eclipse\\SJTravel\\src\\test\\resources\\Resource\\Data.properties";
		try {
			prop = new Properties();
			FileInputStream istream =new  FileInputStream(path);
			prop.load(istream);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
			
		}
		
	public static String[][] readExcel(String sheename) throws IOException  {
		
		XSSFWorkbook book = new XSSFWorkbook("D:\\eclipse\\SJTravel\\src\\test\\resources\\Resource\\TestData.xlsx");
		XSSFSheet sheet = book.getSheet(sheename);
		int rowcount = sheet.getLastRowNum();
		short columncount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowcount][columncount];
		for(int i = 1 ; i <= rowcount; i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for(int j = 0; j < columncount; j++) {
				
				XSSFCell cell = row.getCell(j);
				data[i-1][j]=cell.getStringCellValue();
			}
		}
		
		book.close();
		return data;
	}
}
