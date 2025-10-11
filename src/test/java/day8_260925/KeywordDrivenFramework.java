package day8_260925;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import day6_240925.CallingPOM;

public class KeywordDrivenFramework extends CallingPOM {

	public static void main(String[] args) throws IOException {

		String filepath = "";
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Keyword");
		int rows = sheet.getLastRowNum();
		System.out.println("Total no. of rows: "+rows);
		
		
		for(int i=1;i<=rows;i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell key = row.getCell(1);
			System.out.println("Keyword--->"+key);
			
			switch(key.toString())
			{
			case "url" : 
			lin.url();
			System.out.println("URL keyword is matching");
			break;
			
			case "enterUserName" :
			lin.enterUserName("Admin");
			break;
			
			case "enterPassword" :
			lin.enterPassword("admin123");
			break;
			
			case "clickOnLoginBTN" :
			lin.clickOnLoginBTN();
			break;
			
			default:
				System.out.println("INVALID");
			
			}
			
		}
		
		fis.close();
	}

}
