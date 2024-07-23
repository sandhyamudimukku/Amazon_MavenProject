package Selenium_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test
	public void login_facebook_valid_Credentials()
	{
	WebDriver driver =  new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Facebook_Login_Page u1= new Facebook_Login_Page(driver);
	u1.un();
	u1.Pw();
	u1.login();
	
	}

}
