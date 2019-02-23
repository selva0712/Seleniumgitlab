package utils;

import java.io.IOException;

import org.apache.commons.compress.compressors.lz4.XXHash32;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook wb  = new XSSFWorkbook("./Data/TC001.xlsx");
		XSSFSheet TC001 = wb.getSheet("Sheet1");
		int Rowcount = TC001.getLastRowNum();
		System.out.println("No.of Rows"+ Rowcount);
		 int columncount = TC001.getRow(0).getLastCellNum();
		 System.out.println("No. of Columns"+ columncount);
		 
		 for (int i = 1; i <= Rowcount; i++) {
			 XSSFRow row=TC001.getRow(i);
		//	 for (int j = 0; j < columncount; j++) {
				XSSFCell cell=row.getCell(1);
				XSSFCell cell1=row.getCell(2);
				String Text = cell.getStringCellValue();	
				String Text1 = cell1.getStringCellValue();
				System.out.println(Text +" "+ Text1);
		//		System.out.println(Text1);
		//	}
			
		}
		 
		 
		
		
	}

}
