package Amazon_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ManageProfile_Testcase4 {
	@Test
	public void ManageProfile() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Amazon_HomePage a1=new Amazon_HomePage(driver);
		a1.Account_List(driver);
		a1.sign();
		Amazon_Sign a2=new Amazon_Sign(driver);
		a2.Login_valid();
		a1.Account_List(driver);
		a1.manageprofile();
		a1.viewbutton();
		ManageProfilePage m1=new ManageProfilePage(driver);
		m1.preferredDepartment();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(""));
		m1.heightandweight();
		//Thread.sleep(1000);
		m1.agegroup();				
	}

}
