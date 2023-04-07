package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
	

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();//
		driver.get("https://www.facebook.com/signup");
		
		WebElement cutomGen = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		
	  boolean result = cutomGen.isDisplayed();
	  
	  System.out.println(result);
		
	
	
	
	}
}
