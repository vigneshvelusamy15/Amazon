package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reuseMethods.ReuseMethods;

public class ProductSearchPage extends ReuseMethods {
	 
	public ProductSearchPage () {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="twotabsearchtextbox")
	private static WebElement searchBox;

	@FindBy(id="nav-search-submit-button")
	private static WebElement searchBtnS;

	@FindBy(xpath="//a[@id='nav-hamburger-menu']")
	private static WebElement all;
	
	@FindBy(xpath="//div[text()='Mobiles, Computers']/parent::a[@class='hmenu-item']")
	private static WebElement mobilesAndComputers;

	@FindBy(xpath="//a[text()='All Mobile Phones']")
	private static WebElement allMobiles;
	
	public static WebElement getSearchBox() {
		return searchBox;
	}

	public static WebElement getSearchBtnS() {
		return searchBtnS;
	}

	public static WebElement getAll() {
		return all;
	}

	public static WebElement getMobilesAndComputers() {
		return mobilesAndComputers;
	}

	public static WebElement getAllMobiles() {
		return allMobiles;
	}
	
	
	


}
