
  
package week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crickets {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElementByName("q").sendKeys("cricket", Keys.ENTER);
		List<WebElement> crickets = driver.findElementsByXPath(
				"//*[contains(text(),'cricket') or contains(text(),'Cricket')]"
				);
		System.out.println(crickets.size());
		int mySi = crickets.size();
		int size = crickets.size();
		driver.findElementByXPath("//img[@class='s-image']").click();
	}

}
