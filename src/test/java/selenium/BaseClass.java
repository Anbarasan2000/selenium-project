package selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.sql.DriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	
	static WebDriver  driver;
	
	static Actions ac;
	
	static Alert a;
	
	static JavascriptExecutor js;
	
	public static void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	public static void launchUrl(String url) {
		driver.get(url);

	}
	public static void Maximize() {
		Dimension d=new Dimension(300, 200);
		driver.manage().window().maximize();

	}
	public static void Fill(WebElement element,String text) {
        element.sendKeys(text);
	}
	public static void ButtonClick(WebElement element) {
		element.click();
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	//Actions
	public static void Move(WebElement target) {
		 ac=new Actions(driver);
		ac.moveToElement(target);
	}
	public static void DandD(WebElement source,WebElement target) {
		ac.dragAndDrop(source, target);
		

	}
	public static void DoubleCick() {
		ac.doubleClick();
	}
	public static void RightClick(WebElement target) {
		ac.contextClick(target);
	}
	//Robot
	public static void pressndrelease() throws AWTException {
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
	}
	//Alert
	public static void accept() {
		 a=driver.switchTo().alert();
		a.accept();
		
	}
	public static void dismiss() {
		a.dismiss();
	}
	public static void fillalert(String value) {
		a.sendKeys(value);
	}
	public static void printAlert() {
		a.getText();

	}
	//javaScriptExcecutor
	public static void scrollUp(Object target) {
		 js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", target);

	}
	public static void scrollDown(Object target) {
		js.executeScript("arguments[0].scrollIntoView(false)", target);

	}
	public static void setValue(Object text) {
		js.executeScript("arguments[0].setAttribute('value','anbu')", text);

	}
	public static void getValue(Object text) {
		String value =(String) js.executeScript("return arguments[0].setAttribute('value')", text);
		System.out.println(value);

	}

}

