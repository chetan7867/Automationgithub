package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic2 {


	 public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(3000);
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    
	    driver.get("http://www.india.com/");
	    Thread.sleep(3000);
	    driver.close();
	    
	

	}

}
