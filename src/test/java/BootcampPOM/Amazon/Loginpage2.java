package BootcampPOM.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {
	public WebDriver driver;
	//Constructor
	Loginpage2(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//locators
	@FindBy(xpath="//div[@class='orangehrm-login-branding']")
	WebElement logo;
	@FindBy (xpath="//input[@name=\"username\"]")
	WebElement username;
	@FindBy (xpath="//input[@name=\"password\"]")
	WebElement password;

	@FindBy (xpath="//button[@type=\"submit\"]")
	WebElement submit_btn;

	

//Action method
public void setUserName(String username1)
{
	username.sendKeys(username1);
	
}
public void setPassword(String password1)
{
	password.sendKeys(password1);
	
}
public void clickSubmit()
{
	submit_btn.click();
}
public boolean checkLogoPresence()
{
	boolean status=logo.isDisplayed();
	return status;
}


}
