package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B002_TitleCheck {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chome.driver","D:\\Chintan_donotdelete\\browserdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.manage().window().maximize();
		
		
		String actualTitle =  driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.close();
		
	}
}
