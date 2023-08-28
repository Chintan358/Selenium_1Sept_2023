package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Driverconnection;


public class B001_Linktest {
	
		public static void main(String[] args) {
			
			WebDriver driver =  Driverconnection.connect("https://www.fb.com");
			
			//linktext
			//driver.findElement(By.linkText("Forgotten password?")).click();
			
			
			List<WebElement> links =  driver.findElements(By.partialLinkText("Create"));
			//System.out.println(links.size());
			for(WebElement link : links)
			{
				System.out.println(link.getText());
			}
		}
	
}
