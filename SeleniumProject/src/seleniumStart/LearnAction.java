package seleniumStart;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAction {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// one time implementation
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// maximize 
		driver.manage().window().maximize();
		// load the url
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[.='✕']").click();

		WebElement electronics = driver.findElementByXPath("//span[.='Electronics']");

		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).perform();
//		Thread.sleep(3000);
		// 500 ms
		driver.findElementByLinkText("Samsung").click();

//		electronics.


	}
}
