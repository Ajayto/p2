package DailyProgram;

import java.util.HashMap;

import jxl.read.biff.BiffException;

public class test {
	public static void main(String [] args) throws BiffException {
		HashMap<String, String> testdata=ReadDataFromExcel.readTestData(1);
		System.out.println(testdata.get("Name"));
		
	}

}
