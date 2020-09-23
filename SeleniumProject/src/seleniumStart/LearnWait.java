package seleniumStart;



	


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class LearnWait {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			// launch the browser
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			org.openqa.selenium.WebDriver.Navigation navigate = driver.navigate();
			navigate.to("https://devlabs-860f0.web.app/waitforalert");
			// click on the button
			driver.findElementById("mye").click();

			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			
//			wait.until(ExpectedConditions.elementToBeClickable(element));

			// accept alert
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();


//			navigate.refresh();
//			navigate.forward();
//			navigate.back();
			
			System.out.println("Success");

			//driver.get("https://erail.in/trains-between-stations/chennai-egmore-MS/ksr-bengaluru-SBC");
//			driver.re
		}

	}

