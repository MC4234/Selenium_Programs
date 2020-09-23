package seleniumStart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class devLabsContextMenu {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        //1. Launch your service now instance
        driver.get("https://devlabs-860f0.web.app/contextmenu");
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        
        
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.xpath("//div[text()=' Right Click ']"));
        actions.contextClick(elementLocator).perform();
        System.out.println("performed right click");
      
       WebElement el = driver.findElementByXPath("//button[text()='Click me']");
       el.click();
        System.out.println("Click me done");
        
        Alert myAlert = driver.switchTo().alert();
		myAlert.accept(); // OK 
		
		System.out.println("Alert press OK");
		
        
        
        
        
        
}
}
