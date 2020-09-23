package seleniumStart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class devLabsCheckbox {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        //1. Launch your service now instance
        driver.get("https://devlabs-860f0.web.app/checkbox");
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        
        List <WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));

        
        for(WebElement el : list){
        
            if(!el.isSelected()) // validate Checked property, otherwise you'll uncheck!
                el.click();
            
        }
        System.out.println("Selcted all checkboxes");
}
}