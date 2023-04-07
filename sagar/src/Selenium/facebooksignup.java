package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooksignup {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();//
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("chetan");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[(@name,'firstname'][1]")).sendKeys("chetan@87");
        Thread.sleep(3000);
	}

}
