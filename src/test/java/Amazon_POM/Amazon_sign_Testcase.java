package Amazon_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_sign_Testcase {
	@Test
	public void Sign_valid()
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Amazon_HomePage f1=new Amazon_HomePage(driver);
		f1.Account_List(driver);
		f1.sign();
		Amazon_Sign a1=new Amazon_Sign(driver);
		a1.Login_valid();
		
	}

}
