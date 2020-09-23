package seleniumStart;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSel {

	public static void main(String[] args) {
		// set the driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// load the url
		
		driver.get("http://dbankdemo.com/signup");
		//maximize the URL
		
		driver.manage().window().maximize();
		
		
		//WebElement title = driver.findElementById("title");
		//Select sel = new Select(title);
		//sel.selectByValue("Mrs.");
		//sel.selectByVisibleText("Mrs.");
		
		//sel.selectByIndex(3);
		
      driver.findElementByXPath("//*[@id=\"title\"]/option[4]").click();
		
		
		
		
		driver.findElementByName("firstName").sendKeys("M");
		driver.findElementByName("lastName").sendKeys("C");
		
		driver.findElementByXPath(("//input[@value='F']")).click();
		driver.findElementById("dob").sendKeys("07/19/1989");
		driver.findElementById("ssn").sendKeys("797-78-7977");
		driver.findElementById("emailAddress").sendKeys("mc@gmail.com");
		driver.findElementById("password").sendKeys("Password123!");
		driver.findElementById("confirmPassword").sendKeys("Password123!");
		//driver.findElementById("Next").click();
		//driver.findElementByClassName("btn btn-primary btn-flat m-b-30 m-t-30").click();
		driver.findElementByXPath("//button[@type='submit']").click();
		
		//nextpage
		
		driver.findElementById("address").sendKeys("123 M");
		driver.findElementById("locality").sendKeys("Madnat");
		driver.findElementById("region").sendKeys("Muscat");
		
		driver.findElementById("postalCode").sendKeys("878");
		driver.findElementById("country").sendKeys("Oman");
		driver.findElementById("homePhone").sendKeys("(969)967-7896");
		driver.findElementById("mobilePhone").sendKeys("(969)967-7896");
		driver.findElementById("workPhone").sendKeys("(969)967-7896");
		
		driver.findElementById("agree-terms").click();
		
		driver.findElementByXPath("//button[@type='submit']").click();
		
		driver.findElementById("password").sendKeys("Password123!");
		driver.findElementById("remember-me").click();
		driver.findElementById("submit").click();
		
		//quit
		driver.quit();
		
		
		
		
	
}
}
