package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reuseMethods.ReuseMethods;

public class AddToCartPage extends ReuseMethods {
	  
	public AddToCartPage () {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private static WebElement selectMobile;

	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private static WebElement addToCart;

	@FindBy(xpath="//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
	private static WebElement addedToCart;
	
	@FindBy(name="proceedToRetailCheckout")
	private static WebElement proceedToBuy;
	
	@FindBy(xpath="//div[@id='attach-popover-lgtbox']")
	private static WebElement skip;
	
	public static WebElement getSelectMobile() {
		return selectMobile;
	}

	public static WebElement getAddToCart() {
		return addToCart;
	}

	public static WebElement getAddedToCart() {
		return addedToCart;
	}

	public static WebElement getProceedToBuy() {
		return proceedToBuy;
	}

	public static WebElement getSkip() {
		return skip;
	}

	

}
