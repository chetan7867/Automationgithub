package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();//
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input [@type='text']")).sendKeys("chetangalfade84@gmail.com");
		Thread .sleep(3000);
		
		driver.findElement(By.xpath("//input [@type='password']")).sendKeys("nk@123hfk");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@class,'_5dba']")).sendKeys("chetan");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@value='1']")).click();

	}

}
