package com.OrangeHRM.Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	public static XSSFWorkbook wb;
	public static Object[][] getSheetData(String sheetname)
	{
		
		 Object data[][]=null;
		 File f1=new File("C:\\Users\\ABHIJEET WAGHE\\eclipse-workspace\\MavenSelenium\\TestData\\Data.xlsx");
		 FileInputStream fs;
		
		try {
			fs=new FileInputStream(f1);
			  wb =new XSSFWorkbook(fs);
			  int rows=wb.getSheet(sheetname).getPhysicalNumberOfRows();
			  int cells=wb.getSheet(sheetname).getRow(0).getPhysicalNumberOfCells();
			  data=new Object[rows-1][cells];
			  
			  for(int i=1;i<rows;i++)
			  {
				  for(int j=0;j<cells;j++)
				  {
					  data[i-1][j]=getDataAsPerType(sheetname,i,j);
				  }
				  System.out.println();
			  }
			  	 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		return data;  		
	}
	
	public static String getDataAsPerType(String sheetname,int row,int cell)
	{
		XSSFCell cells=wb.getSheet(sheetname).getRow(row).getCell(cell);
		String data="";
		
		if(cells.getCellType()==CellType.STRING)
		{
			data=cells.getStringCellValue();
		}else if(cells.getCellType()==CellType.NUMERIC)
		{
			int dd=(int) (cells.getNumericCellValue());
			
			data=String.valueOf(dd);
			
		}else if(cells.getCellType()==CellType.BLANK)
		{
			data=" ";
		}
		return data;
	}
	
	
}



