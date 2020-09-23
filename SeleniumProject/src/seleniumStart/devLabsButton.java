package seleniumStart;

import java.awt.Color;
import java.awt.Paint;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class devLabsButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        //1. Launch your service now instance
        driver.get("https://devlabs-860f0.web.app/button");
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        
        driver.findElementById("button1").click();
        System.out.println("button1 pressed");
        driver.navigate().back();

   
    	System.out.println("In home page");
    	
    	WebElement location = driver.findElementById("button2");
    	org.openqa.selenium.Point point = location.getLocation();
    	System.out.println("My element location: " + location);
    	int xcord = point.getX();
    	System.out.println("Position of the webelement from left side is "+xcord +" pixels");
    	int ycord = point.getY();
    	System.out.println("Position of the webelement from top side is "+ycord +" pixels");
    	driver.findElementById("button2").click();
    	System.out.println(" button2 pressed");
    	driver.navigate().back();
    	
    	System.out.println("In home page");
    	String color = 	driver.findElementById("button3").getCssValue("color");
    	System.out.println(color);
    	String background = driver.findElementById("button3").getCssValue("background-color");
    	System.out.println(background);
    	driver.findElementById("button3").click();
    	System.out.println(" button3 pressed");
    	driver.navigate().back();
    	
    	
    	  //Get width of element.
    	WebElement button = driver.findElementById("button4");
        int buttonWidth = button.getSize().getWidth();
        System.out.println("button width Is "+buttonWidth+" pixels");
        
        //Get height of element.
        int buttonHeight = button.getSize().getHeight();        
        System.out.println("Image height Is "+buttonHeight+" pixels");
        driver.findElementById("button3").click();
    	System.out.println("button4 pressed");
    	driver.navigate().back();
    	
    	
    	System.out.println("In home page");
    	
    	
    	 driver.findElementById("12q3w4m").click();
     	System.out.println("button5 pressed");
     	driver.navigate().back();
    	
    	
    	
    	
    	
    	
}
}