package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B001_BrowserDemo {

	
	public static void main(String[] args) {
		
		//chrome browser
		
		System.setProperty("webdriver.chome.driver","D:\\Chintan_donotdelete\\browserdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.manage().window().maximize();
		
		
//		System.setProperty("webdriver.edge.driver","D:\\Chintan_donotdelete\\browserdriver\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.fb.com");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close(); //single tab
		driver.quit();  // all tabse
		
		
		
		
		
	}
	
}
