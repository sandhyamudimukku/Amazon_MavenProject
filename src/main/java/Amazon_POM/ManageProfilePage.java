package Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProfilePage {
@FindBy(xpath="(//div[@class='accordion-trigger-content desktop'])[1]")	
WebElement preferredDepartment;
@FindBy(xpath="(//button[@class='attribute-action'])[1]")
WebElement add_PD_button;
@FindBy(xpath="(//button[.='Women'])")
WebElement Women_button;
@FindBy(xpath="(//input[@class='a-button-input'])[2]")
WebElement submit;
@FindBy(xpath="(//div[@class='accordion-trigger-content desktop'])[2]")	
WebElement heightandweight;
@FindBy(xpath="(//button[@class='attribute-action'])[3]")
WebElement add_HW_button;
@FindBy(xpath="(//input[@class='number-input-box'])[1]")
WebElement heightadd_button;
@FindBy(xpath="(//input[@class='number-input-box'])[2]")
WebElement Weightadd_button;
@FindBy(xpath="//span[@class='a-button a-button-normal a-button-primary button']")
WebElement H_W_savebutton;
@FindBy(xpath="(//div[@class='accordion-trigger-content desktop'])[3]")	
WebElement agegroup;
@FindBy(xpath="(//button[@class='attribute-action'])[3]")
WebElement add_Agegroup_button;
@FindBy(xpath="//button[.='25-29']")
WebElement ageselect;
@FindBy(xpath="(//input[@class='a-button-input'])[2]")
WebElement age_save_button;


public void preferredDepartment()
{
	preferredDepartment.click();
	add_PD_button.click();
	Women_button.click();
	submit.click();
}
public void heightandweight()
{
	heightandweight.click();
	add_HW_button.click();
	heightadd_button.sendKeys("155");
	Weightadd_button.sendKeys("60");	
	H_W_savebutton.click();
	
}
public void agegroup()
{
	agegroup.click();
	add_Agegroup_button.click();
	ageselect.click();
	age_save_button.click();
	
}
public ManageProfilePage(WebDriver d1) 
{
  PageFactory.initElements(d1,this);	
}

}
