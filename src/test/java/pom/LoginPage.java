package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reuseMethods.ReuseMethods;

public class LoginPage extends ReuseMethods {
	 
	public LoginPage () {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private static WebElement accountsAndList;

	@FindBy(xpath="//input[@id='ap_email']")
	private static WebElement mobileNo;

	@FindBy(id="continue")
	private static WebElement continueBtn;
	
	@FindBy(name="password")
	private static WebElement password;

	@FindBy(id="signInSubmit")
	private static WebElement signInBtn;
	
	@FindBy(xpath="//span[text()='Hello, vikee']")
	private static WebElement loginText;

	public static WebElement getAccountsAndList() {
		return accountsAndList;
	}

	public static WebElement getMobileNo() {
		return mobileNo;
	}

	public static WebElement getContinueBtn() {
		return continueBtn;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getSignInBtn() {
		return signInBtn;
	}

	public static WebElement getLoginText() {
		return loginText;
	}



}
