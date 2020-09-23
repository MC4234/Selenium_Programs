package seleniumStart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonWebsiteWeekFour {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		//In search type & enter "oneplus"
		
		driver.findElementById("twotabsearchtextbox").sendKeys("oneplus");
		//driver.findElementByXPath("//input[@type='submit']").click();
		driver.findElementByXPath("//input[@value='Go']").click();
		
		//Verify title has oneplus
		
		String title = driver.getTitle();
		boolean result = title.contains("oneplus");
		if (result==true)
		{
		System.out.println("Yes the title has oneplus");
		}
		
		System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        
        //Click on the first result link
       
    
       int size = driver.findElements(By.tagName("iframe")).size();
       System.out.println(size);
       
        driver.switchTo().frame(0);
        System.out.println("INSIDE FRAME 0");
        int size1 = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size1);
        
        
        driver.switchTo().parentFrame();
        System.out.println("INSIDE FRAME Parent");
        int sizeParent = driver.findElements(By.tagName("iframe")).size();
        System.out.println(sizeParent);
        driver.findElementByXPath("//img[@class='s-image']").click();
        
        List<WebElement> labels = driver.findElementsByTagName("img");
		int size11 = labels.size();
		System.out.println("The size are: "+size11);
        
		//. Print the title
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println("Navigation happened");
		
		//Verify that in search box "oneplus" is present
		
		String value =driver.findElementById("twotabsearchtextbox").getAttribute("value");
		System.out.println(value);
		if(value.contains("oneplus"))
		{
			System.out.println("one plus is present in the search box");
		}
		else
		{
			System.out.println("not");
		}
		
		// Clear and search for samsung and enter
		
		driver.findElementById("twotabsearchtextbox").clear();
		System.out.println("SEARCH BOx CLEARED");

		driver.findElementById("twotabsearchtextbox").sendKeys("samsung");
		driver.findElementByXPath("//input[@value='Go']").click();
		System.out.println("Search with Samsung Success");
		
		 //Select Price high to low in the sort by dropdown
		WebElement operation = driver.findElementByXPath("//select[@name='s']");
		
		Select sel = new Select(operation);
		
		sel.selectByIndex(2);
		System.out.println("Sorted high to low in the sort by dropdown");
		
		//Close the browser
		 driver.close();
	     System.out.println("Brower is closed");
       
        
		
	}
}
