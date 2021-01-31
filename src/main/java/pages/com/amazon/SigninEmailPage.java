/**
 * 
 */
package pages.com.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.base.com.amazon.Base;

/**
 * @author priyankakodeboina
 *
 */
public class SigninEmailPage extends Base{
	

	//PageFactory Object repository

	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(id="continue")
	WebElement continueBtn;
		
	//Initializing PageFactory elements
	public SigninEmailPage()
	{
		PageFactory.initElements(driver, this);
			
	}
	
	//Enters Email, clicks on continue button and gets the object of SigninPwdPage
	public SigninPwdPage clickOnContinue(String emailid)
	{
		email.sendKeys(emailid);
		continueBtn.click();
		return new SigninPwdPage();
	}

}
