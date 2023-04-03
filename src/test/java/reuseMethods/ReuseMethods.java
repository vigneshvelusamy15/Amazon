package reuseMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ReuseMethods {
	 protected static WebDriver driver;
		
		public static  WebDriver Webdriversetup() {
			System.setProperty("webdriver.chrome.driver", "D:\\java program\\selenium\\ex\\chromedriver.exe");
			System.setProperty("webdriver.http.factory", "jdk-http-client");
					return driver=new ChromeDriver();
		}
		public static void launchurl(String url) {
		    driver.get(url);
		}
		public static void WindowMaximize() {
			driver.manage().window().maximize();
		}
		public  void windowMinimize() {
			driver.manage().window().minimize();
		}
		public static String getTitleText() {
			String title=driver.getTitle();
			return title;
		}
		public static String getcurrenturl() {
		    String currenturl =driver.getCurrentUrl();
			return currenturl;
		}
		public void screenshot(String name) throws IOException {
	        TakesScreenshot s=(TakesScreenshot)driver;
			File src=s.getScreenshotAs(OutputType.FILE);
		    File destination=new File("D:\\java program\\selenium\\screenshot/"+name+timestamp()+".png");
		    FileUtils.copyFile(src, destination);
	    }
		public void alerts() {
			Alert a=driver.switchTo().alert();
			a.accept();
		}
		public void mouseover(WebElement element) {
			Actions a=new Actions(driver);
			a.moveToElement(element).perform();
		}
		public void rightclick(WebElement element) {
			Actions a=new Actions(driver);
			a.contextClick(element).perform();
		}
		public void doubleclick(WebElement element) {
			Actions a=new Actions(driver);
			a.doubleClick(element).perform();
		}
		public void thread(long sec) throws InterruptedException {
			Thread.sleep(sec);
		}
		public  void sendinput(WebElement element,String input) {
			element.sendKeys(input);
		}
		public void buttonclick(WebElement element) {
			element.click();	
		}
		public static void browserclose() {
			driver.close();
		}
		public static void browserquit() {
			driver.quit();
		}
		public void dropdown(WebElement element,String text) {
			Select select=new Select(element);
			select.selectByVisibleText(text);
		}
		public void implicitwait(int sec) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		}
		public void navigateback() {
			driver.navigate().back();
		}
		public void navigateforward() {
			driver.navigate().forward();
		}
		public void browserRefresh() {
			driver.navigate().refresh();
		}
		public void navigatetoUrl(String url) {
			driver.navigate().to(url);;
		}
		public void frames(WebElement element) {
			driver.switchTo().frame(element);
		}
		public void defaultframe() {
			driver.switchTo().defaultContent();
		}
		public void windowhandling(String url) {
			driver.switchTo().window(url);
		}
		public void javascriptexecutors(WebElement element) {
	         JavascriptExecutor js=(JavascriptExecutor)driver;	
	         js.executeScript("arguments[0].setAttribute('value','sendkeys')",element);
		}
		public static String gettext(WebElement element) {
			String s=element.getText();
	    	return s;
		}
		public String getattribute(WebElement element) {
			String s=element.getAttribute("value");
			return s;
		}
		public void scrolldown(WebElement element) {
			 JavascriptExecutor js=(JavascriptExecutor)driver;
		     js.executeScript("arguments[0].scrollIntoView()",element);
		}
		public void scrollup(WebElement element) {
	        JavascriptExecutor js=(JavascriptExecutor)driver;	
	        js.executeScript("arguments[0].scrollIntoView(false);",element);
		}
		private static String timestamp() {
			return new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
		}
		
		public void keydown() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
		    r.keyRelease(KeyEvent.VK_DOWN);
		}
		public void keyUp() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_UP);
		    r.keyRelease(KeyEvent.VK_UP);
		}
		public void enter() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER);
		}
		public void tab() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_TAB);
		    r.keyRelease(KeyEvent.VK_TAB);
		}
		public void cut() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
		    r.keyPress(KeyEvent.VK_X);
		    r.keyRelease(KeyEvent.VK_X);
		    r.keyRelease(KeyEvent.VK_CONTROL);
		}
		public void copy() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
		    r.keyPress(KeyEvent.VK_C);
		    r.keyRelease(KeyEvent.VK_C);
		    r.keyRelease(KeyEvent.VK_CONTROL);
		}
		public void paste() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
		    r.keyPress(KeyEvent.VK_V);
		    r.keyRelease(KeyEvent.VK_V);
		    r.keyRelease(KeyEvent.VK_CONTROL);
		}
		public boolean Isdisplayed(WebElement element) {
			boolean displayed=element.isDisplayed();
			return displayed;
		}
		public boolean Isenabled(WebElement element) {
			boolean enabled=element.isEnabled();
			return enabled;
		}
		public boolean Isselected(WebElement element) {
			boolean selected=element.isDisplayed();
			return selected;
		}
		public static void windowHandling(int a) {
			Set<String>allwind=driver.getWindowHandles();
			System.out.println(allwind);
			int tabs=driver.getWindowHandles().size();
			System.out.println(tabs);
			List<String>list=new ArrayList<String>(allwind);
			driver.switchTo().window(list.get(a));

		}

}
