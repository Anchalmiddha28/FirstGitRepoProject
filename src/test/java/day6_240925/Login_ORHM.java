package day6_240925;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_ORHM {

	WebDriver driver;
	public Login_ORHM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Repository
	By userNM = By.name("username");
	By userPS = By.name("password");
	By login =  By.xpath("//button[@type='submit']");

	public void url()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		

	}
	
	public void enterUserName()
	{
		driver.findElement(userNM).sendKeys("Admin");
		
	}
	public void enterPassword()
	{
		driver.findElement(userPS).sendKeys("admin123");

	}
	public void clickLoginBTN()
	{
		driver.findElement(login).click();
	}

}
