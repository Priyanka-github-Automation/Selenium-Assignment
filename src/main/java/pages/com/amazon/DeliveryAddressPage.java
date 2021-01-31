/**
 * 
 */
package pages.com.amazon;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.base.com.amazon.Base;

/**
 * @author priyankakodeboina
 *
 */
public class DeliveryAddressPage extends Base{
	
	//PageFactory Object repository

	@FindBy(xpath="//span[@class='a-button-inner']")
	WebElement deliveryAddressBtn;
	
		
	//Initializing PageFactory elements
	public DeliveryAddressPage()
	{
		PageFactory.initElements(driver, this);
			
	}
	
	//clicks on use this address button and returns object of the following page i.e Shipping options page
	public ShippingOptionsPage clickOnAddressBtn()
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(deliveryAddressBtn));
		deliveryAddressBtn.click();
		return new ShippingOptionsPage();
	}

}
