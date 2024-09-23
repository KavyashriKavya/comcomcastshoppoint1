package com.shoppoint.generic.Fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getDataFromExcelFile(String sheetName, int rowCount, int cellCount) throws Exception
	{
		FileInputStream fis = new FileInputStream("./testdata/Testscriptn.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(rowCount).getCell(cellCount).toString();
		
		return data;
	}
	
	public int getLastRowNum(String sheetName) throws Exception
	{
		FileInputStream fis = new FileInputStream("./testdata/Testscriptn.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		int rowNum = wb.getSheet(sheetName).getLastRowNum();
		return rowNum;
		
	}
	
	public void setDataBackToExcelFile(String sheetName, int rowCount, int cellCount,String data) throws Exception
	{
		FileInputStream fis = new FileInputStream("./testdata/Testscriptn.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		//wb.getSheet(sheetName).getRow(rowCount).createCell(cellCount, String);
		wb.getSheet(sheetName).getRow(rowCount).getCell(cellCount).setCellValue(data);
		
		FileOutputStream fout = new FileOutputStream("./testdata/Testscriptn.xlsx");
		wb.write(fout);
	}
}
