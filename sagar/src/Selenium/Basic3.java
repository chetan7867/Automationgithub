package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic3 {
	
	 public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();//
			driver.get("https://www.cricbuzz.com/");
			Thread.sleep(5000);
			
            String url=driver.getCurrentUrl();
            System.out.println(url);
            String expurl="https://www.cricbuzz.com/";
            
            if(url.equalsIgnoreCase(expurl)) {
            	System.out.println("Navigate to valid page");
            	
            }
            
            else {
            	System.out.println("Navigate to invalid page");
            }
	 }
}