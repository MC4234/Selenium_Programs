package seleniumStart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestWebsiteFeatures {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
		driver.manage().window().maximize();
		
		//select prize high to low
		WebElement operation = driver.findElementByXPath("//select");
		Select sel = new Select(operation);
		//sel.selectByIndex(2);	
		sel.selectByValue("highestprice");
		//driver.close();
		
		//click on XS size
	   driver.findElementByXPath("//span[.='XS']").click();
	
	  //verify only one t-shirt is visible
	
	 Thread.sleep(3000);
	 String xs =driver.findElementByClassName("products-found").getText();
     System.out.println(xs);
     
     //Click on S, t-shirt count must be 2
     driver.findElementByXPath("//span[.='S']").click();
     Thread.sleep(3000);
	 String s =driver.findElementByClassName("products-found").getText();
     System.out.println(s);
     
     //clear the size filter
    
   
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

	     //find the number of t-shirts available
	     Thread.sleep(3000);
	     String xp =driver.findElementByClassName("products-found").getText();
	     System.out.println(xp);
	     
        //close browser
	     driver.close();
	     System.out.println("Browser is closed");
	     
}
}
