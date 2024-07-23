package Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkout_Page {
	@FindBy(id="add-new-address-popover-link")
	WebElement addnewaddress;
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement firstname;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement Mobilenumber;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement pincode;
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement address;
	@FindBy(id="address-ui-widgets-enterAddressCity")
	WebElement city;
    @FindBy(name="address-ui-widgets-enterAddressStateOrRegion")
	WebElement state;    
    @FindBy(xpath="(//input[@class='a-button-input'])[6]")
    WebElement usethisaddress1; 
    @FindBy(xpath="//h3[@class='a-color-base clickable-heading expand-collapsed-panel-trigger']")
    WebElement Paymentbutton;
    @FindBy(id="pp-BU16rE-98")
    WebElement creditcardbutton;
    @FindBy(id="pp-Rjyz90-104")
    WebElement Netbankingbutton;
    @FindBy(id="pp-Rjyz90-124")
    WebElement otherupibutton;
    @FindBy(id="pp-Rjyz90-129")
    WebElement EMIbutton;
    @FindBy(id="pp-9BF0tF-96")
    WebElement Couponcode;
    @FindBy(name="ppw-claimCodeApplyPressed")
    WebElement Applybutton;
    
    
    
	public void addnewaddress() throws InterruptedException	
	{
		addnewaddress.click();
		firstname.sendKeys("sandhya");
		Mobilenumber.sendKeys("9700107285");
		pincode.sendKeys("524314");
		address.sendKeys("1-c-3-20, gudipallipadu");
		city.sendKeys("nellore");
		Thread.sleep(1000);
		Select s1=new Select(state);
		s1.selectByIndex(2);	
		usethisaddress1.click();
	}
	public void usethisaddress1()
	{
		usethisaddress1.click();
	}
	public void Paymentmethod() throws InterruptedException
	{
		Paymentbutton.click();
		Couponcode.sendKeys("amazon500");
		Applybutton.click();
		Thread.sleep(1000);
		//creditcardbutton.click();
		Netbankingbutton.click();
		//otherupibutton.click();
		//EMIbutton.click();		
	}	
	public Checkout_Page(WebDriver d1)
	{
		PageFactory.initElements(d1,this);
	}
}
