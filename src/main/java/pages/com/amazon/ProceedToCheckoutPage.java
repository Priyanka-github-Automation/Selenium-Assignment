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
public class ProceedToCheckoutPage extends Base{
	
	//PageFactory Object repository

	@FindBy(xpath="//span[@class='a-color-price hlb-price a-inline-block a-text-bold']")
	WebElement proceedToCheckoutPagePrice;
	
	@FindBy(id="hlb-ptc-btn-native")
	WebElement checkoutBtn;
		
	//Initializing PageFactory elements
	public ProceedToCheckoutPage()
	{
		PageFactory.initElements(driver, this);
			
	}
	
	public String getPrice()
	{
		return proceedToCheckoutPagePrice.getText();
	}
	
	//clicks on proceed to check out and returns the object of the corresponding page
	public SigninEmailPage clickOnProceedToCheckout()
	{
		 checkoutBtn.click();
		 return new SigninEmailPage();
	}

}
