package ActionClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpdown {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();//
			
			driver.get("https://www.album.alexflueras.ro/index.php");
			Thread.sleep(2000);
			 
			driver.manage().window().maximize();
			
			JavascriptExecutor scroll = (JavascriptExecutor)driver;
			
			scroll.executeScript("window.scrollBy(0,400)"); // scroll down
			Thread.sleep(2000);
			
	        scroll.executeScript("window.scrollBy(0,-200)"); // scroll up
	        Thread.sleep(2000);
	        
	        scroll.executeScript("window.scrollBy(3000,0)"); // scroll right
            Thread.sleep(2000);
             
            scroll.executeScript("window.scrollBy(-4000,0)"); // scroll left
            Thread.sleep(2000);
	}
}
