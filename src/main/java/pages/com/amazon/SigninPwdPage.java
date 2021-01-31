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
public class SigninPwdPage extends Base{
	
	//PageFactory Object repository

	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signinBtn;
		
	//Initializing PageFactory elements
	public SigninPwdPage()
	{
		PageFactory.initElements(driver, this);
			
	}
	
	//enters password, clicks on signin button and gets the object of DeliveryAddressPage
	public DeliveryAddressPage clickOnSignin(String pwd)
	{
		password.sendKeys(pwd);
		signinBtn.click();
		return new DeliveryAddressPage();
	}

}
