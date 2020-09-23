package seleniumStart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://devlabs-860f0.web.app/frame");
        
        driver.switchTo().frame(0);
        
    	driver.findElementById("username").sendKeys("M");
		driver.findElementById("password").sendKeys("Pass123");
	
 
		driver.findElementByXPath("//button[@type='submit']").click();
		
		//handle alert
		
		Alert myAlert = driver.switchTo().alert();
		String myAlertPrint =myAlert.getText();
		System.out.println(myAlertPrint);
		//String aa = driver.getTitle();
		//System.out.println(aa);
		
		
		myAlert.accept();
		
	}

}
