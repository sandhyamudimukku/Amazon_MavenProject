package Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Results_page 
{
	@FindBy(id="add-to-cart-button")
	WebElement Addtocart;
	@FindBy(xpath="//a[@title='Add to Wish List']")
	WebElement Wishlist;
	@FindBy(xpath="(//a[@class='a-button-text'])[3]")
	WebElement Gotocart;
	@FindBy(xpath="//span[@class='a-button a-button-normal a-button-span12 a-button-primary']")
	WebElement ProceedtoBuy;
	@FindBy(name="(//span[@class='a-size-small sc-action-delete'])[1]")
	WebElement deletebutton;
	@FindBy(xpath="(//span[@class='a-price-whole'])[1]")
	WebElement price;
	@FindBy(xpath="//h2[@class='softlines']")
	WebElement product_Description;
	@FindBy(xpath="(//i[@class='a-icon a-icon-star a-star-3 cm-cr-review-stars-spacing-big'])[1]")
	WebElement ratings;
	
   public void Addtocart()
   {
	   Addtocart.click();	   
   }
   public void Wishlist()
   {
	   Wishlist.click();	   
   }
   public void Gotocart()
   {
	   Gotocart.click();	   
   }
   public void delete()
   {
	   deletebutton.click();	   
   }
   public void ProceedtoBuy()
   {
	   ProceedtoBuy.click();
	   
   }
   public void price_pd_rating_check()
   {
	   System.out.println(price.isDisplayed());
	   System.out.println(product_Description.isDisplayed());
	   System.out.println(ratings.isDisplayed());
	   
   }
   public Search_Results_page(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }

}
