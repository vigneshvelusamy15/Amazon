package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reuseMethods.ReuseMethods;

public class CreateAccPage extends ReuseMethods {
	
	 
	public CreateAccPage () {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="createAccountSubmit")
	private static WebElement createAccBtn;

	@FindBy(name="customerName")
	private static WebElement name;

	@FindBy(name="email")
	private static WebElement mobileNo;
	
	@FindBy(name="password")
	private static WebElement password;

	@FindBy(id="continue")
	private static WebElement continueBtn;
	public static WebElement getPassword() {
		return password;
	}

	public static void setPassword(WebElement password) {
		CreateAccPage.password = password;
	}

	public static WebElement getCreateAccBtn() {
		return createAccBtn;
	}

	public static WebElement getName() {
		return name;
	}

	public static WebElement getMobileNo() {
		return mobileNo;
	}

	public static WebElement getContinueBtn() {
		return continueBtn;
	}
	
	

}
