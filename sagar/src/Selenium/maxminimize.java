package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maxminimize {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//
		
		driver.get("https://www.cricbuzz.com/");
		
		Thread.sleep(3000);
		driver.navigate().to("https:www.electrical.com/");
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		driver.close();
		
		
		

}
}
