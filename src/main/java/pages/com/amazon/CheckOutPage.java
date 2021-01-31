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
public class CheckOutPage extends Base{
	
	
	//PageFactory Object repository

	@FindBy(xpath="//td[@class='a-text-right aok-nowrap a-nowrap']")
	WebElement checkoutPagePrice;
	
		
	//Initializing PageFactory elements
	public CheckOutPage()
	{
		PageFactory.initElements(driver, this);
			
	}
	
	//Gets the price of the item displayed in checkout page
	public String getPrice()
	{
		return checkoutPagePrice.getText();
	}
	

}
