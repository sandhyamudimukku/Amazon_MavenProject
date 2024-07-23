package Selenium_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Login_Page {
// step 1 locating webElement.
	public static WebDriver driver;
	@FindBy(id="email")
	WebElement Username;
	@FindBy(name="pass")
	WebElement Password;
	
	//@FindBy(linkText="Log in")
	@FindBy(xpath="//button[@name='login']")
	WebElement Loginbutton;
	// Step 2 create a separate method for each component
	public void un()
	{
		Username.sendKeys("sandhya.mudimukku@gmail.com");;
	}
	
	public void Pw()
	{
		Password.sendKeys("Sandy@123");
	}
	public void login()
	{
		Loginbutton.click();
	}
	// step 3 initialize each element using pagefactory class inside the constructor
	// constructor are used to intilize the component.
	public Facebook_Login_Page(WebDriver d1)
	{
		PageFactory.initElements(d1,this);
	}
	
}
