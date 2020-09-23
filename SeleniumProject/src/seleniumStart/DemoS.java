package seleniumStart;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 

public class DemoS {

 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
		driver.manage().window().maximize();
		
		 driver.findElementByXPath("//span[.='XS']").click();
	     Thread.sleep(3000);
		 String s =driver.findElementByClassName("products-found").getText();
	     System.out.println(s);
	     
	     driver.findElementByXPath("//span[.='S']").click();
	     Thread.sleep(3000);
		 String si =driver.findElementByClassName("products-found").getText();
	     System.out.println(si);
	     
	     
	     driver.findElementByXPath("//span[.='M']").click();
	     Thread.sleep(3000);
		 String sii =driver.findElementByClassName("products-found").getText();
	     System.out.println(sii);
	     
		
		   //clear the size filter
	    
	     
	     
		   
	   //  String prin = driver.findElementByXPath("//span[text()='XS']").getAttribute("innerHTML");
	    String prin = driver.findElementByClassName("filters").getText();
	     System.out.println(prin);
	   // WebElement checkbox = driver.findElementByXPath("//span[text()='XS']");
	    // WebElement checkbox = driver.findElementByClassName("checkmark");
	     
	     /*boolean searchIconSelected = driver.findElementByXPath("//span[text()='XS']").isEnabled();
	    System.out.println(searchIconSelected);
	     if (searchIconSelected==true)
	     {

	    	 driver.findElementByXPath("//span[text()='XS']").click();

	     }*/
	     Thread.sleep(3000);
	     boolean searchIconSelected = driver.findElementByXPath("//input[@type='checkbox']").isEnabled();
		    System.out.println(searchIconSelected);
		     if (searchIconSelected==true)
		     {
		    	 Thread.sleep(3000);
		    	 driver.findElementByXPath("//span[text()='XS']").click();
		    	 driver.findElementByXPath("//span[text()='S']").click();
		    	 
		   
		    
		    	 System.out.println("cleared filter");
		    	 
		    	 /*driver.findElementByXPath("//span[text()='M']").click();
		    	 driver.findElementByXPath("//span[text()='ML']").click();
		    	 driver.findElementByXPath("//span[text()='L']").click();
		    	 driver.findElementByXPath("//span[text()='XL']").click();
		    	 driver.findElementByXPath("//span[text()='XXL']").click();
		    	 System.out.println("cleared filter");*/
		    	 
		    	 
		    	 

		     }
	     
	     
	     

	
	}
}



