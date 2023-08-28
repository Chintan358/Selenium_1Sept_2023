package util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverconnection {
	
	public static WebDriver connect(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chintan_donotdelete\\browserdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		return driver;
	}
}
