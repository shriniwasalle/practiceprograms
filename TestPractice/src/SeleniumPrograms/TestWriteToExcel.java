package SeleniumPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestWriteToExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Test.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("TestData");
		 
		//sheet.createRow(0).createCell(0).setCellValue("UserName");
		//sheet.createRow(0).createCell(1).setCellValue("Password");
		//sheet.createRow(1).createCell(0).setCellValue("Shri");
		sheet.createRow(1).createCell(1).setCellValue("ABCD");
		
		FileOutputStream fos = new FileOutputStream("D:\\Test.xlsx");
		workbook.write(fos);
		fos.close();
		System.out.println("END OF WRITING DATA IN EXCEL");
	}
}
