package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		// set the driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// load the url
		//driver.get("http://dbankdemo.com/signup");
		
		
		/*WebElement title = driver.findElementById("title");
        Select sel = new Select(title);
        sel.selectByVisibleText("Mr.");
	driver.manage().window().maximize();*/
		
		driver.get("http://dbankdemo.com/login");
		// enter the user name
		driver.findElementById("username")
		.sendKeys("mc@gmail.com");
		// enter the password
		WebElement password = driver.findElementByName("password"); 
		// get the placeholder value
		String placeholdervalue = password.getAttribute("placeholder");
		System.out.println(placeholdervalue); 
		password.sendKeys("Password1&2");
		
		// click on the check box
		//driver.findElementById("remember-me").click();
		// click in the submit button
		//driver.findElementById("submit").click();
		//driver.quit();
		
		
		
		
	

	}

}


