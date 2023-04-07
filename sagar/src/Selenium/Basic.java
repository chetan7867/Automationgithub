package Selenium;
	


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {
	
 public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();//
	driver.get("https://www.cricbuzz.com/");
	
    driver.switchTo().newWindow(WindowType.TAB);
    
	
   driver.get("http://www.google.com/");
			
	//Thread.sleep(10000);
	
	//driver.close();
	
	//driver.quit();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	
	

	String title1 = driver.getTitle();
	System.out.println(title1);
	
	Thread.sleep(2000);
	driver.navigate().back();
	
	driver.navigate().refresh();
	
	//String title1 = driver.getTitle();
	//System.out.println(title1);
	
	//WebDriver driver1 = new FirefoxDriver();
	//WebDriver driver2 = new FirefoxDriver();
	//driver1.get("http://www.flipkart.com/");
	//driver2.get("http://www.amazon.com/");
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


