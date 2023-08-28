package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B003_LoginTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chome.driver","D:\\Chintan_donotdelete\\browserdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.manage().window().maximize();
		
		
		WebElement email =  driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		
		email.sendKeys("test@gmail.com");
		pass.sendKeys("pass123");
		login.click();
		
		
		
		
	}
}
