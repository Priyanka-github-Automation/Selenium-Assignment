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
public class HomePage extends Base{
	
	//PageFactory Object repository
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchBtn;
	
	//Initializing PageFactory elements
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//enters the search item retrieved from properties file and clicks on search button. Returns the object of the following page i.e. resultsPage
	public ResultsPage searchBox(String searchItem)
	{
		searchBox.sendKeys(searchItem);
		searchBtn.click();
		return new ResultsPage();
		
	}

}
