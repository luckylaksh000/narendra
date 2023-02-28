package webDriverExample;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import jxl.Workbook;



public class Write_Exceldata {
	public static void main(String args[]) throws Exception{
		FileInputStream file = new FileInputStream("C:\\xlsx\\New Microsoft Excel Worksheet.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("test");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		System.out.println("Before updating cellData" +sheet.getRow(2).getCell(1));
		
		
	}

}
