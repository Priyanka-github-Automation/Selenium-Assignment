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
public class ShippingOptionsPage extends Base{

	//PageFactory Object repository

		@FindBy(xpath="//input[@type='submit']")
		WebElement continueBtn;
		
			
		//Initializing PageFactory elements
		public ShippingOptionsPage()
		{
			PageFactory.initElements(driver, this);
				
		}
		
		//clicks on continue button on the page and returns object of SelectPaymentPage 
		public SelectPaymentPage clickOnDeliverBtn()
		{
			continueBtn.click();
			return new SelectPaymentPage();
		}
	
}
