package webDriverExample;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Exp_ReadExcel {
	public static void main(String args[])throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\manohar icon\\Desktop\\ReadExcel.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet(1);
		//int i= 1 only  for one row
		int rowcount = st.getRows();//total row count
		System.out.println(rowcount);
		for(int i= 1; i<rowcount; i++) 
		{
        
		String Empid =st.getCell(0, i).getContents();
		String EMPNAME = st.getCell(1, i).getContents();
		String EMPemail = st.getCell(2, i).getContents();
		String EMPNO = st.getCell(3, i).getContents();
		System.out.println(Empid);
		System.out.println(EMPNAME);
		System.out.println(EMPemail);
		System.out.println(EMPNO);
		}
		
	}

}
