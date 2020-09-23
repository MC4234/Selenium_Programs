package seleniumStart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://devlabs-860f0.web.app/advanced-web-tables");
        
        //Get all the values from all the dessert column
        WebElement table = driver.findElementByClassName("mat-sort");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for (int i = 0; i <rows.size(); i++) {
			WebElement oneRow = rows.get(i);
			List<WebElement> datas = oneRow.findElements(By.tagName("td"));
			try {
				WebElement td = datas.get(0);
				System.out.println(td.getText());
			} catch (Exception e) {
				System.err.println("No Table data found");
				
	
		
		}//sort the list
		
		}
		System.err.println("------------sort the list-------------");
		for (int i = 0; i <rows.size(); i++) {
			WebElement oneRow = rows.get(i);
			List<WebElement> datas = oneRow.findElements(By.tagName("td"));
			try {
				WebElement td = datas.get(0);
				String ele = td.getText();
				//System.out.println(td.getText());
				List<String> ls = new ArrayList<String>();
				ls.add(ele);
				List<String> lp = new ArrayList<String>();
				 Collections.sort(ls);
				System.out.println(ls);
			} catch (Exception e) {
				System.err.println("No Table data found");
				
	
		
		}
				
			
		}
		System.err.println("Sort");
		
		
		
		
		
	}

}
