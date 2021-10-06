package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {
	
public static void main(String[] args) {
	BrowserLaunch();
	launchUrl(" https://en-gb.facebook.com/");
	
	
	Maximize();
	
	 WebElement text = driver.findElement(By.id("reg_pages_msg"));
	scrollDown(text);
	
}
	

}
