/**
 * 
 */
package test.pages.com.amazon;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.com.amazon.CheckOutPage;
import pages.com.amazon.DeliveryAddressPage;
import pages.com.amazon.HomePage;
import pages.com.amazon.ProceedToCheckoutPage;
import pages.com.amazon.ProductPage;
import pages.com.amazon.ResultsPage;
import pages.com.amazon.SelectPaymentPage;
import pages.com.amazon.ShippingOptionsPage;
import pages.com.amazon.SigninEmailPage;
import pages.com.amazon.SigninPwdPage;
import resources.base.com.amazon.Base;

/**
 * @author priyankakodeboina
 *
 */
public class CheckOutPageTest extends Base{
	
	//Instantiating page objects
	HomePage homepage;
	ResultsPage resultspage;
	ProductPage productpage;
	ProceedToCheckoutPage proceedtocheckoutpage;
	SigninEmailPage signinemailpage;
	SigninPwdPage signinpwdpage;
	DeliveryAddressPage deliveryaddresspage;
	ShippingOptionsPage shippingoptionspage;
	SelectPaymentPage selectpaymentpage;
	CheckOutPage checkoutpage;
	
	//Initializes browser and url properties
	public CheckOutPageTest()
	{
		super();
	}
	
	//Launches browser, loads home page and searches for item
	@BeforeTest
	public void setup()
	{
		browserInitialization();
		homepage = new HomePage();
		searchAndClick();
		
	}
	
	//function to Initialize resultspage and productpage objects
	public void searchAndClick()
	{
		resultspage = homepage.searchBox(prop.getProperty("searchItem"));
		productpage = resultspage.firstSearchResultClick();
	}
	
	//function to Initialize proceedToCheckoutPage object
	public void proceedToCheckOut()
	{
		proceedtocheckoutpage = productpage.addToCartBtnClick();
	}
	
	//function to initialize page objects
	public void navigateToCheckoutPage()
	{
		signinemailpage = proceedtocheckoutpage.clickOnProceedToCheckout();
		signinpwdpage = signinemailpage.clickOnContinue(prop.getProperty("email"));
		deliveryaddresspage = signinpwdpage.clickOnSignin(prop.getProperty("password"));
		shippingoptionspage = deliveryaddresspage.clickOnAddressBtn();
		selectpaymentpage = shippingoptionspage.clickOnDeliverBtn();
		checkoutpage = selectpaymentpage.clickOnContinueBtn();
	}
	
	//This method asserts the price in product page with that of results page
	@Test(priority=1)
	public void validateProductPagePrice()
	{
		Assert.assertEquals(productpage.getPrice(), ResultsPage.price);
		proceedToCheckOut();
		
	}
	
	
	//This method asserts the price in ProceedTocheckout page with that of results page
	@Test(priority =2)
	public void validateProceedToCheckoutPagePrice()
	{
		Assert.assertEquals(proceedtocheckoutpage.getPrice(), ResultsPage.price);
		navigateToCheckoutPage();
	}
	
	
	//This method asserts the price in Checkout page with that of results page
	@Test(priority=3)
	public void validateCheckoutPagePrice()
	{
		Assert.assertEquals(ResultsPage.price, checkoutpage.getPrice() );
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
