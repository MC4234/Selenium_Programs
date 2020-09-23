package seleniumStart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		
		//Click on Try it button
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[.='Try it']").click();
		
		//Enter your name in the alert --Prompt alert
		/*Alert myAlert =driver.switchTo().alert();
		String myAlertPrint  =myAlert.getText();
		System.out.println("myAlert");
		myAlert.accept();*/
		Thread.sleep(3000);
		Alert myAlert =driver.switchTo().alert();
		myAlert.sendKeys("Merris Chacko");
		//Accept the Alert
		myAlert.accept();
		
		//confirm your name is visible 
		String var = driver.findElementByXPath("//p[.='Hello Merris Chacko! How are you today?']").getText();
		//String var = driver.findElementByXPath("//span[.='var']").getText();
		System.out.println(var);
		
		//close the brower
		driver.close();
		System.out.println("Brower is closed");
		
		
		
		
		

		
		
	}

}
