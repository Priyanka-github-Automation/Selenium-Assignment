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
public class SelectPaymentPage extends Base{
	
	//PageFactory Object repository

			@FindBy(xpath="//input[@class='a-button-input a-button-text']")
			WebElement continueBtn;
			
				
			//Initializing PageFactory elements
			public SelectPaymentPage()
			{
				PageFactory.initElements(driver, this);
					
			}
			
			
			////clicks on continue button on the page and returns object of CheckOutPage
			public  CheckOutPage clickOnContinueBtn()
			{
				WebDriverWait wait = new WebDriverWait(driver, 5);
				wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
				continueBtn.click();
				return new CheckOutPage();
			}

}
