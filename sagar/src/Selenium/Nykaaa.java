package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nykaaa {

	public static void main(String[] args) throws InterruptedException {
		 
		
		WebDriver driver = new ChromeDriver();//
		driver.get("https://www.nykaa.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@'emailMobile']")).sendKeys("chetangalfade84@gmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@ value='submit']")).click();
		

	}

}
