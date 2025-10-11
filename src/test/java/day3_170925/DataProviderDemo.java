package day3_170925;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver=new ChromeDriver();

	@BeforeSuite
	public void setUp()
	{
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	@DataProvider(name = "dataSet" , parallel = true)
	public Object[][] mobileDataSet()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "iphone";
		data[0][1] = "17";
		
		data[1][0] = "Oneplus";
		data[1][1] = "13";
		
		
		return data;
	}
	
	
	@Test(dataProvider= "dataSet")
	public void searchMobile(String brand, String model)

	{
		//WebDriver driver;
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(brand+" "+model);
		searchbox.sendKeys(Keys.ENTER);
		
	}
}
