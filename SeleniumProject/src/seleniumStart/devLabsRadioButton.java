package seleniumStart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class devLabsRadioButton {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        //1. Launch your service now instance
        driver.get(" https://devlabs-860f0.web.app/radiobutton");
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        
        driver.findElementById("name2").click();
        System.out.println("Yes is pressed");
        boolean click =   driver.findElementById("name2").isEnabled();
        if (click == true)
        {
        	System.out.println("radio button is selected");
        }
        else
        {
        	System.out.println("radio button is not selected");
        }

}
}
