package day6_240925;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallingPOM {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Login_ORHM lin= new Login_ORHM(driver);
		
		Login_ORHM_PageFact lin = new Login_ORHM_PageFact(driver);
		lin.url();
		lin.enterUserName();
		lin.enterPassword();
		lin.clickLoginBTN();
		
		
	}

	
	// data driven - multiple test data inject in same test case 
}
