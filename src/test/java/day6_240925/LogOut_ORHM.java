package day6_240925;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut_ORHM {
	WebDriver driver;
	
	public LogOut_ORHM(WebDriver driver)
	{
		
			this.driver=driver;
	}
	
	//Repository
	By profile = By.className("");
	By logout= By.linkText("Logout");

	public void clickProfile()
	{
		driver.findElement(profile).click();
	}
	
	public void clickLogout()
	{
		driver.findElement(profile).click();
	}
}
