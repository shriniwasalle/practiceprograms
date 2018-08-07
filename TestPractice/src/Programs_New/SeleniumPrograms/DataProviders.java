package SeleniumPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviders {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	@DataProvider(name="excelData")
	public Object[][] loadFile() {
		try {
			File file = new File("C:\\Users\\shriniwas.alle\\Desktop\\read.xlsx");
			FileInputStream fileInput = new FileInputStream(file);
			wb = new XSSFWorkbook(fileInput);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		sheet = wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println(rowCount);
		System.out.println(colCount);
		
		Object[][] data = new Object[rowCount+1][colCount+1];
		for (int i = 0; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return data;	
	}
	
	@Test(dataProvider = "excelData")
	public void test(String name, String surName, String roll) {
		System.out.println(name);
		System.out.println(surName);
	}

}
