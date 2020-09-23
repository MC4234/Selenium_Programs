package seleniumStart;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirfox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// set the driver path
	//	System.setProperty("webdriver.gecko.driver", "C:\Users\cherira\AppData\Local\Temp\geckodriver-v0.27.0-win64.zip");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		// launch the browser
	 WebDriver driver = new FirefoxDriver();
		// load the url
		driver.get("https://chromedriver.chromium.org/downloads");

	}

}
