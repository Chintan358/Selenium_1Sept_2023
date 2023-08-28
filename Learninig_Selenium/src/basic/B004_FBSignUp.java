package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B004_FBSignUp {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chome.driver","D:\\Chintan_donotdelete\\browserdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create new account")).click();
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("tops");
		driver.findElement(By.name("reg_email__")).sendKeys("9874859685");
		driver.findElement(By.name("reg_passwd__")).sendKeys("tops123");
		WebElement day =  driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("11");
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByValue("3");
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByIndex(5);
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		//System.out.println(gender.size());
//		for(WebElement g : gender)
//		{
//			System.out.println(g.getAttribute("id"));
//		}
		gender.get(1).click();
		
	}
}
