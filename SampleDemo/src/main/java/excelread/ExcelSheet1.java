package excelread;

import java.io.IOException;

public class ExcelSheet1 {

	public static void main(String[] args) throws IOException{
		String s=ExcelSheet.readStringData(1, 1);
		System.out.println(s);
		
		String s1=ExcelSheet.integerData(1, 0);
		System.out.println(s1);


	}

}
