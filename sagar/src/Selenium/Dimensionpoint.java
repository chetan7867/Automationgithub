package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimensionpoint {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//
		
		driver.get("https://www.cricbuzz.com/");
		
		Thread.sleep(3000);
		
		Dimension d = new Dimension(900,700);
		driver.manage().window().setSize(d);
		
		Point p = new Point (400,200);
		driver.manage().window().setPosition(p);
}
}