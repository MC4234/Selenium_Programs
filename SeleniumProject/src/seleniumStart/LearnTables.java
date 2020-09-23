package seleniumStart;

	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class LearnTables {
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	        ChromeDriver driver= new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://erail.in/trains-between-stations/chennai-egmore-MS/ksr-bengaluru-SBC");
				WebElement table = driver.findElementByCssSelector("div#divTrainsList table.TrainList.TrainListHeader");
				List<WebElement> rows = table.findElements(By.tagName("tr"));
				System.out.println(rows.size());
				int expectedValue = 19;
//				if(expectedValue != rows.size()) {
//					throw new RuntimeException("Data doesn't");
//				}
				
//				if(rows.zi)
				for (int i = 0; i <rows.size(); i++) {
						WebElement oneRow = rows.get(i);
						List<WebElement> datas = oneRow.findElements(By.tagName("td"));
						try {
							WebElement td = datas.get(0);
							System.out.println(td.getText());
						} catch (Exception e) {
							System.err.println("No Table data found");
						}
				}
				driver.quit();

		}

	}
	
	



