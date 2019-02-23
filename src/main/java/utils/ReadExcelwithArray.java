package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelwithArray {
	static Object [] [] data;
	public static Object [][] readData (String dataSheetName) {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wb;
		try {
			wb = new XSSFWorkbook("./Data/"+ dataSheetName+".xlsx");
			XSSFSheet TC001 = wb.getSheet("Sheet1");
			int Rowcount = TC001.getLastRowNum();
			System.out.println("No.of Rows"+ Rowcount);
			 int columncount = TC001.getRow(0).getLastCellNum();
			 System.out.println("No. of Columns"+ columncount);
			 data = new Object [Rowcount] [columncount]; 
			 for (int i = 1; i <= Rowcount; i++) {
				 XSSFRow row=TC001.getRow(i);
				 for (int j = 0; j < columncount; j++) {
					XSSFCell cell=row.getCell(j);
					data [i-1] [j] = cell.getStringCellValue();
		} 
			
		//		String Text1 = cell1.getStringCellValue();
		//		System.out.println(Text +" "+ Text1);
		//		System.out.println(Text1);
		//	}
			
		}
		
		 }	 
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return data;
		
	}	
	}
