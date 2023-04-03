package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.AddToCartPage;
import pom.ProductSearchPage;

public class AddToCart {
	WebDriver driver=AddToCartPage.Webdriversetup();
	AddToCartPage cart=new AddToCartPage();
	ProductSearchPage search=new ProductSearchPage();
	@Given("I am in amazon home page")
	public void i_am_in_amazon_home_page() {
		AddToCartPage.launchurl("https://www.amazon.in");
		AddToCartPage.WindowMaximize();
	}

	@When("I search for {string}")
	public void i_search_for(String string) {
		ProductSearchPage.getSearchBox().sendKeys(string);
		ProductSearchPage.getSearchBtnS().click();
	}

	@When("I open the first mobile")
	public void i_open_the_first_mobile() {
		AddToCartPage.getSelectMobile().click();	
	}

	@When("I add the mobile to the cart")
	public void i_add_the_mobile_to_the_cart() {
		AddToCartPage.windowHandling(1);
		AddToCartPage.getAddToCart().click();
		AddToCartPage.getSkip().click();
	}

	@Then("I should see the mobile added to my cart")
	public void i_should_see_the_mobile_added_to_my_cart() throws InterruptedException {
		Thread .sleep(6000);
		boolean proceed=AddToCartPage.getProceedToBuy().isDisplayed();
		System.out.println(proceed);
		Thread.sleep(2000);
	    AddToCartPage.browserquit();
	}


}
