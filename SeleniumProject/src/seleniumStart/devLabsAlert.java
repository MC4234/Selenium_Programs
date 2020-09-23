package seleniumStart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class devLabsAlert {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        //1. Launch your service now instance
        driver.get("https://devlabs-860f0.web.app/alert");
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);

        
        driver.findElementById("12345rtf").click();
        Alert myAlert = driver.switchTo().alert();
		String myAlertPrint =myAlert.getText();
		System.out.println(myAlertPrint);
		myAlert.accept();
		System.out.println("Alert1");
        
		
		driver.findElementById("zxcvbnm").click();
     	Alert myAlert1 = driver.switchTo().alert();
		//myAlert.accept(); // OK 
		myAlert.dismiss(); // cancel
		System.out.println("Alert2");
		
		driver.findElementById("aswdefr").click();
		
		Alert myAlert2 = driver.switchTo().alert();
		myAlert2.sendKeys("Merris Chacko");
		Thread.sleep(5000);
     	myAlert2.accept();
     	System.out.println("Alert3");
     	
     	
     	driver.findElementById("zxcvbhnj").click();
     	//Alert myAlert3 = driver.switchTo().alert();
         
     	driver.findElementByXPath("//button[text()='OK']").click();
		System.out.println("Alert pressed");
		//driver.close();


        
        
        
        
        
        
        
        
}
}
