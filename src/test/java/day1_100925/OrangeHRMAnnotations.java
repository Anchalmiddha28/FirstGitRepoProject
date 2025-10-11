package day1_100925;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRMAnnotations {

	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
	}
	@Test(priority=1)
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit]")).click();
	}
	
	
	@Test(priority=2)
	public void verifyHome()
	{
		
		String dash=driver.findElement(By.xpath("//div[@id='app]/descendant::h6")).getText();
		
		Assert.assertEquals(dash,"dasboard");

	}
	
	
}
