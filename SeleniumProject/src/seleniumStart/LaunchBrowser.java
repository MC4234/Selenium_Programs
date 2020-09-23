package seleniumStart;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        //Launch your service now instance
        driver.get("https://signon.service-now.com/ssoactivate.do?token=6e09f40f7fde5c90d5f6261ae0a457ae&email=merrismary%40gmail.com");
  
		//click on sign- in button
        
        
		
	}

}
