package DailyProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadDataFromExcel {


	public static  HashMap<String, String> readTestData(int rowNumber) throws BiffException { 
		HashMap<String, String> testData=new HashMap<String, String>();

		try
		{
			File inFile=new File("C:\\Users\\shraddha\\Music\\myWorkSpace_2017\\JavaProject\\src\\DailyProgram\\TD.xls");
			FileInputStream fInpute=new FileInputStream(inFile);
			Workbook wb=Workbook.getWorkbook(fInpute);
			Sheet sh=wb.getSheet(0);
			int allRow=sh.getRows();
			int allCol=sh.getColumns();
			System.out.println(sh.findCell("Ajay").getRow());
			System.out.println(sh.findCell("Ajay").getRow());
			for(int i=0;i<allCol;i++){
				//System.out.println(sh.getCell(i,0).getContents());
				
				testData.put(sh.getCell(i,0).getContents(), sh.getCell(i,rowNumber).getContents());
				
				
			}
					
			System.out.println(testData);

		}

		catch(IOException io)
		{
			System.out.println(io.getMessage());
		}

		return testData;
	}
	
}
