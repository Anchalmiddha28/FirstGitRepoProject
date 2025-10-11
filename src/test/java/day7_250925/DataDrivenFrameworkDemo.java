package day7_250925;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import day6_240925.Login_ORHM_PageFact;

public class DataDrivenFrameworkDemo {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		Login_ORHM_PageFact lin = new Login_ORHM_PageFact(driver);
		
		
		
		String filepath = "";
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Data");
		int rows = sheet.getLastRowNum();
		System.out.println("Total no. of rows: "+rows);

			
		for(int i=1;i<=rows;i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell usernm = row.getCell(0);
			XSSFCell pw = row.getCell(1);
			
			System.out.println("Username----"+usernm+"password----"+pw);
			
		}
	}

}
