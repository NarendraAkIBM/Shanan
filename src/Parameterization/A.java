package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {//
	public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Documents\\17-Sept.xlsx");
	String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(data);
	}
}
