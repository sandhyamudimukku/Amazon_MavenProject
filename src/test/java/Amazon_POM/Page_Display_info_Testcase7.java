package Amazon_POM;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Page_Display_info_Testcase7 {
	@Test
	public void Page_Display_info()
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
		a1.search();
		a1.secondshoe();
	    Set<String>s1=driver.getWindowHandles();
	    Iterator<String> i1=s1.iterator();
	    String	parentid=i1.next();
	    String	childid=i1.next();
	    driver.switchTo().window(childid);
	    Search_Results_page sr1=new Search_Results_page(driver);
	    sr1.price_pd_rating_check();
	    
	}

}
