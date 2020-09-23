package seleniumStart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class devLabsEdit {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        //1. Launch your service now instance
        driver.get("https://devlabs-860f0.web.app/edit");
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        
        driver.findElementById("fullName").sendKeys("Merris Chacko");
        System.out.println("Entered name");
        driver.findElementById("join").clear();
        driver.findElementById("join").sendKeys("I am well",Keys.ENTER);
        System.out.println("Text joined");
        String text = driver.findElementById("getMe").getAttribute("value");
        System.out.println(text);
        driver.findElementById("clearMe").clear();
        System.out.println("text box cleared");
        
        boolean dis = driver.findElementById("noEdit").isEnabled();
        if (dis==true)
        {
        	System.out.println("text cannot be edited");
        }
        else
        {
        	System.out.println("text is editable");
        }

        
	}
}


