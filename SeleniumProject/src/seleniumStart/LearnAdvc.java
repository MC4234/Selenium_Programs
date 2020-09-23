package seleniumStart;

import java.awt.Point;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAdvc 
{
	public static void main(String[] args) throws InterruptedException {

	// set the driver path
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	// launch the browser#
	
	ChromeDriver driver = new ChromeDriver();
	// load the url
	driver.get("https://jqueryui.com/draggable/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	

	
	WebElement source = driver.findElementById("draggable");
	Actions builder = new Actions(driver);

	  Thread.sleep(3000);
	  org.openqa.selenium.Point location = source.getLocation();
	  int x= location.getX();
	  int y= location.getY();
	  
	  builder.dragAndDropBy(source, x+4, y+4).perform();
	  Thread.sleep(3000);
	  driver.quit();
}
}

