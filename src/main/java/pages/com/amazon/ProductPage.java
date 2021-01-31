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
public class ProductPage extends Base{
	
	//PageFactory Object repository

		@FindBy(id="newBuyBoxPrice")
		WebElement productPagePrice;
		
		@FindBy(id="add-to-cart-button")
		WebElement addToCartBtn;
			
		//Initializing PageFactory elements
		public ProductPage()
		{
			PageFactory.initElements(driver, this);
				
		}
		
		//This method gets the price displayed in the product page
		public String getPrice()
		{
			return productPagePrice.getText();
		}
		
		
		//This method clicks on add to cart button and returns the object of the the page that follows the button click
		public ProceedToCheckoutPage addToCartBtnClick()
		{
			addToCartBtn.click();
			return new ProceedToCheckoutPage();
		}
		
		
	
	

}
