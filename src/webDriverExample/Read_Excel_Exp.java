package webDriverExample;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Read_Excel_Exp {
	public static void main(String args[]) throws Exception{
		FileInputStream file =  new FileInputStream("C:\\Users\\manohar icon\\Desktop\\ExcelRead.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet(1);
		//int i = 2;
		int rowcount =st.getRows();
		System.out.println(rowcount);
		for(int i = 1; i<rowcount; i++) {
		String empid = st.getCell(0, i).getContents();
		String empname = st.getCell(1, i).getContents();
		String empemail = st.getCell(2, i).getContents();
		String empno = st.getCell(3, i).getContents();
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empemail);
		System.out.println(empno);
	}
	}
}
