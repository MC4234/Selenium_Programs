package seleniumStart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DevLabsWaitForAlerts {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        //1. Launch your service now instance
        driver.get("https://devlabs-860f0.web.app/contextmenu");
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        
        driver.findElementById("mye").click();
        
        
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert myAlert = driver.switchTo().alert();
     		myAlert.accept(); // OK 
     		
     		System.out.println("Alert press OK");
        

}
}

