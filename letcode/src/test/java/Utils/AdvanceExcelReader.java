package Utils;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class AdvanceExcelReader {

	public static void main(String[]args) throws IOException
	{

		FileInputStream fis = new FileInputStream("./test-data/Logindata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		int lastRowNum = sh.getPhysicalNumberOfRows();
		int lastCellNum = sh.getRow(0).getPhysicalNumberOfCells();
		
		for(int i =1;i<lastRowNum;i++)
		{
			for(int j=0;j<lastCellNum;j++)
			{
				String value = sh.getRow(i).getCell(j).toString();
				
				System.out.print(value+ " ");
			}
			
			System.out.println(" ");
		}




	}
}