package day8_260925;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HybridFrameworkDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filepath = "";
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet datasheet = workbook.getSheet("Data");
		XSSFSheet KeySheet = workbook.getSheet("Keyword");

		int dataRows = datasheet.getLastRowNum();
		System.out.println("Total no. of rows: "+dataRows);
		int keyRows = KeySheet.getLastRowNum();
		System.out.println("Total no. of rows: "+keyRows);

		for(int kr=1;kr<=keyRows;kr++)
		{
			XSSFRow rows = KeySheet.getRow(kr);
			XSSFCell key = rows.getCell(1);
			System.out.println("Keyword--->"+key);
			
	}
	}
}
