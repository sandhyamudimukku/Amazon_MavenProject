package Amazon_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_registration_Testcase {
	@Test
	public void reg()
	{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Amazon_HomePage a1=new Amazon_HomePage(driver);
	a1.Account_List(driver);
	a1.sign();	
	Amazon_Sign a2=new Amazon_Sign(driver);
	a2.Reg();
}
}
