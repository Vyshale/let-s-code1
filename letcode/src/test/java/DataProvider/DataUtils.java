package DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Utils.AdvanceExcelReader;

public class DataUtils {

	@DataProvider(name="login")

	public String[][] getData() throws IOException

	{

		String [][] excelData = AdvanceExcelReader.getData();


		//		String[][] data = new String[3][2];
		//		
		//		
		//		data[0][0] = "Vyshale.s@gmail.com";
		//		data[0][1] = "Pass@123";
		//		
		//		data[1][0] ="vyshu1927@gmail.com";
		//		data[1][1]="Pass@123";
		//		
		//		data[2][0] = "Vyshu88@gmail.com";
		//		data[2][1] = "Pass@12345";

		return excelData;

	}

}
