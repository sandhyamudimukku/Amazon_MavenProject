package Amazon_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_login_invalidsign {
	@Test
	public void signin_invalid()
	{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Amazon_HomePage a2=new Amazon_HomePage(driver);
	a2.Account_List(driver);
	a2.sign();
	Amazon_Sign a1=new Amazon_Sign(driver);
	a1.Login_Invalid();
}}
