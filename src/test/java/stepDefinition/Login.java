package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pom.LoginPage;

public class Login {
	WebDriver driver=LoginPage.Webdriversetup();
	LoginPage login=new LoginPage();;
	@Given("user in amazon homepage")
	public void user_in_amazon_homepage() {
		LoginPage.launchurl("https://www.amazon.in");
		LoginPage.WindowMaximize();
	}

	@Given("click the hello sign in button")
	public void click_the_hello_sign_in_button() {
		LoginPage.getAccountsAndList().click();
	}

	@When("user enter a  username")
	public void user_enter_a_username() {
		LoginPage.getMobileNo().sendKeys("9787779060");
	}

	@When("click the continue button")
	public void click_the_continue_button() {
		LoginPage.getContinueBtn().click();
	}

	@When("enter a  password")
	public void enter_a_password() {
		LoginPage.getPassword().sendKeys("12345678");
	}

	@When("Click the sign in button")
	public void click_the_sign_in_button() {
		LoginPage.getSignInBtn().click();
	}

	@Then("user successfully signed in")
	public void user_successfully_signed_in() throws InterruptedException {
		String actual=LoginPage.getLoginText().getText();
		Assert.assertEquals("Hello, vikee",actual);
		System.out.println("User sucessfully signed in");
		Thread.sleep(2000);
		LoginPage.browserquit();
	}

	@When("user enter a  {string}")
	public void user_enter_a(String string) {
		LoginPage.getMobileNo().sendKeys(string);
	}
	
	@When("click the  continue button")
	public void click_the_continue_button1() {
		LoginPage.getContinueBtn().click();
	}

	@When("enter a  {string}")
	public void enter_a(String string) {
		LoginPage.getPassword().sendKeys(string);  
	}
	
	@When("Click the  sign in button")
	public void click_the_sign_in_button1() {
		LoginPage.getSignInBtn().click();
	}

	@Then("user not successfully signed in")
	public void user_not_successfully_signed_in() throws InterruptedException {
	    String actual=LoginPage.getcurrenturl();
	    String expected = "https://www.amazon.in/?ref_=nav_ya_signin";	
	    if(actual.equals(expected)) {
	    	System.out.println("user signed in successfully");
	    }
	    else {
	    	System.out.println("unsuccessful sign in");
	    }
	    Thread.sleep(2000);
	    LoginPage.browserquit();
	}

}
