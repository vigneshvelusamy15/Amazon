package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pom.CreateAccPage;
import pom.LoginPage;

public class CreateAccount {
	WebDriver driver=CreateAccPage.Webdriversetup();
	CreateAccPage create=new CreateAccPage();
	LoginPage login=new LoginPage();
	@Given("user in amazon home page")
	public void user_in_amazon_home_page() {
		CreateAccPage.launchurl("https://www.amazon.in");
		CreateAccPage.WindowMaximize();
	}

	@Given("click the hello signin button")
	public void click_the_hello_signin_button() {
	    LoginPage.getAccountsAndList().click();
	}

	@Given("user click the create amazon account button")
	public void user_click_the_create_amazon_account_button() {
		CreateAccPage.getCreateAccBtn().click();
	}

	@When("user  enters a username")
	public void user_enters_a_username() {
		CreateAccPage.getName().sendKeys("dggndcs");
	}

	@When("enters a phone number")
	public void enters_a_phone_number() {
		CreateAccPage.getMobileNo().sendKeys("1346452345");
	}

	@When("enters a password")
	public void enters_a_password() {
		CreateAccPage.getPassword().sendKeys("ffhdwdad");
	}

	@When("clicks the continue button")
	public void clicks_the_continue_button() {
		CreateAccPage.getContinueBtn().click();
	}

	@Then("Authentication is required")
	public void authentication_is_required() throws InterruptedException {
	    String actual=driver.getTitle();
	    String expected="Authentication required";
	    Assert.assertEquals(actual,expected);
	    Thread.sleep(2000);
	    CreateAccPage.browserquit();
	}

}
