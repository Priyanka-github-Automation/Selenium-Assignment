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
public class ResultsPage extends Base{
	
	public static String price;
	
	//PageFactory Object repository
	
	
	@FindBy(xpath="//div[@class='a-section aok-relative s-image-fixed-height']")
	WebElement firstSearchResult;
	
	@FindBy(xpath="//span[@class='a-price-whole']")
	WebElement priceWhole;
	
	
	@FindBy(xpath="//span[@class='a-price-fraction']")
	WebElement priceFraction;
		
	//Initializing PageFactory elements
		
	public ResultsPage()
	{
		PageFactory.initElements(driver, this);
		price = getPrice();
			
	}
	
	//extracts price of the item(first result) from the results page
	public String getPrice()
	{
		String wholePrice = priceWhole.getText();
		String fractionPrice = priceFraction.getText();
		String price = (new StringBuilder()).append("$").append(wholePrice).append(".").append(fractionPrice).toString();
		return price;
	}
	
	//clicks on first search result and returns the object of ProductPage
	public ProductPage firstSearchResultClick()
	{
		firstSearchResult.click();
		return new ProductPage();
	}


}
