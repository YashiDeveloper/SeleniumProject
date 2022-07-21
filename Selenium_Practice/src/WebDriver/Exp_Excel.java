package WebDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exp_Excel {
public static void main(String args[])throws Exception {
	FileInputStream file = new FileInputStream("D:\\Tst_book.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(file);
	//int row = 2;
	
	XSSFSheet sh = wb.getSheet("Sheet1");
	//System.out.println(sh.getLastColNum());
	for(int row = 0;row<sh.getLastRowNum()+1;row++) 
		
	{
		System.out.println("\n");
		//for (int col =0;col <sh.getLeftCol();col++) {
			XSSFCell Data= sh.getRow(row).getCell(0);
	//String Name= sh.getCell(1,i).getContents();
	//String Role= sh.getCell(2,i).getContents();
	//String Salary= sh.getCell(3,i).getContents();
	//String Email= sh.getCell(4,i).getContents();
	
	System.out.print(Data+": ");
		
	}
	//}
	
	XSSFCell cell = sh.getRow(2).getCell(0);
	cell.setCellValue("Ok");
	file.close();
	FileOutputStream fileO = new FileOutputStream("D:\\Tst_book.xlsx");
	wb.write(fileO);
	System.out.println("File Written");
	fileO.close();
	
}
}
