package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	//DataProviders 1
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		String path=".\\testData\\Nwccu_LoginT.xlsx";
		
		ExcelUtility xlutil=new ExcelUtility(path);
		
		int totalrows=xlutil.getRowCount("sheet1");
		int totalcols=xlutil.getCellCount("sheet1",1);
		
		String logindata[][]=new String[totalrows][totalcols]; // created for two dimension array which can store
		
		for(int i=1;i<=totalrows;i++) //1 //read the data from excel storing in two dimensional array
		{
			for(int j=0;j<totalcols;j++) //0 i is rows j is column
			{
				logindata[i-1][j]=xlutil.getCellData("Sheet1", i, j); //1,0
			}
		}
	return logindata;
	}
	
	//DataProvider 2
	
	//DataProvider 3
	
	//DataProvider 4

}
