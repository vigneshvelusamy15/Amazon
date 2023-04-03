package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pom.ProductSearchPage;

public class ProductSearch {
	WebDriver driver=ProductSearchPage.Webdriversetup();
	ProductSearchPage search=new ProductSearchPage();

	@Given("user in amazon  home page")
	public void user_in_amazon_home_page() {
		ProductSearchPage.launchurl("https://www.amazon.in");
		ProductSearchPage.WindowMaximize();
	}

	@When("user enters  the product name in search box")
	public void user_enters_the_product_name_in_search_box() {
		ProductSearchPage.getSearchBox().sendKeys("iphone 14 yellow 128gb");
	}

	@When("clicks the search button")
	public void clicks_the_search_button() {
		ProductSearchPage.getSearchBtnS().click();
	}

	@Then("product details should be shown")
	public void product_details_should_be_shown() throws InterruptedException {
		String actual=ProductSearchPage.getTitleText();
		String expected="Amazon.in : iphone 14 yellow 128gb";
		Assert.assertEquals(expected, actual);
		System.out.println("product details is shown");
		Thread.sleep(2000);
		ProductSearchPage.browserquit();
	}

	@When("user clicks the  all category button")
	public void user_clicks_the_all_category_button() {
		ProductSearchPage.getAll().click();
	}

	@When("clicks the mobiles and computer section")
	public void clicks_the_mobiles_and_computer_section() {
		ProductSearchPage.getMobilesAndComputers().click();
	}

	@When("clicks the  all mobile phones section")
	public void clicks_the_all_mobile_phones_section() {
		ProductSearchPage.getAllMobiles().click();
	}

	@Then("product details is shown")
	public void product_details_is_shown() throws InterruptedException {
		String actual=ProductSearchPage.getcurrenturl();
		String expected="https://www.amazon.in/gp/browse.html?node=1389401031&ref_=nav_em_sbc_mobcomp_all_mobiles_0_2_8_2";
		Assert.assertEquals(actual,expected);
		System.out.println("product details is shown");
		Thread.sleep(2000);
		ProductSearchPage.browserquit();
	}

}
