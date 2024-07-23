package Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Sign {
 @FindBy(id="ap_email_login")
 WebElement mobilenumber;
 @FindBy(id="continue")
 WebElement continue_Button;
 @FindBy(name="customerName")
 WebElement name;
 @FindBy(id="ap_password")
 WebElement password;
 @FindBy(id="continue")
 WebElement verifymobilenumber;
 @FindBy(id="signInSubmit")
 WebElement signbutton;
 //@FindBy(xpath="//input[@class='a-button-input']")
 //WebElement proceedtocreateanaccount;
 
 public void Reg()
 {
	 mobilenumber.sendKeys("8639885778");
	
	 continue_Button.click();
	 //proceedtocreateanaccount.click();
	 name.sendKeys("sandhya");
	 password.sendKeys("Sandy@123");
	 verifymobilenumber.click();
	 
 }
 public void Login_valid()
 {
	 mobilenumber.sendKeys("9700107285");	
	 continue_Button.click();
	 password.sendKeys("Sandy@123");
	 signbutton.click();
  }
 public void Login_Invalid()
 {
	 mobilenumber.sendKeys("9700107285");	
	 continue_Button.click();
	 password.sendKeys("Sandy@1234");
	 signbutton.click();
  }
 public Amazon_Sign(WebDriver d1)
 {
	 PageFactory.initElements(d1,this);
 }

}
