package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonlogin {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();//
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(3000);
		
		
	  driver.findElement(By.xpath("//input [@type='email']")).sendKeys("chetangalfade84@gmail.com");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input [@id='continue']")).click();
      Thread.sleep(3000);
	}

}
