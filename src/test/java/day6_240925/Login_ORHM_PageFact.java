package day6_240925;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_ORHM_PageFact {
	
	

		WebDriver driver;
		public Login_ORHM_PageFact(WebDriver idriver)
		{
			driver= idriver;
			PageFactory.initElements(driver,this);
		}
		
		//Repository
		@FindBy (name = "username") WebElement userNM;
		@FindBy (name = "password") WebElement userPS;
		@FindBy (xpath = "//button[@type='submit']") WebElement login;

	

		public void url()
		{
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		}
		
		public void enterUserName()
		{
			userNM.sendKeys("Admin");
			
		
		}
		public void enterPassword()
		{
			userPS.sendKeys("admin123");

		}
		
		public void clickLoginBTN()
		{
			login.click();
		}

	}

