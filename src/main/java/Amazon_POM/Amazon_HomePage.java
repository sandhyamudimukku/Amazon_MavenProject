package Amazon_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_HomePage{
	//public static WebDriver driver;
	@FindBy(id="nav-link-accountList")
	WebElement Account_List;
	@FindBy(xpath="(//span[@class='nav-action-inner'])[1]")
	WebElement signin;
	@FindBy(xpath="//span[@class='sc-ksBlkl sc-jRwbcX fedVjG fqsXfW']")
	WebElement manageprofile;
	@FindBy(linkText="View")
	WebElement viewbutton;
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[2]")
	WebElement secondshoe;
	@FindBy(id="s-result-sort-select_0")
	WebElement filter;
	
	public void Account_List(WebDriver d2)
	{
	 Actions a1=new Actions(d2);
	 a1.moveToElement(Account_List).perform();	  
	}
	public void sign()
	{
		signin.click();
	}
	public void manageprofile()
	{
		manageprofile.click();
		
	}
	public void viewbutton()
	{
		
		viewbutton.click();
	}
	public void search()
	{
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
	}
	public void Filter()
	{
		//Select s1=new Select(Filter);
		//s1.selectByIndex(1);	
		filter.sendKeys(Keys.ARROW_DOWN);
		
	}
	public void secondshoe()
	{
		secondshoe.click();
	}
   public Amazon_HomePage(WebDriver d2)
   {
	   PageFactory.initElements(d2,this);
   }
}
