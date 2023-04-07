package ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement {
	

	public static void main(String[] args) throws InterruptedException {
		
	// System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new FirefoxDriver();//
			
     driver.get("https://www.w3schools.com/html/html_tables.asp");
	 Thread.sleep(2000);
			
     List<org.openqa.selenium.WebElement> noOfRows = driver.findElements(By.xpath("//table[@id = 'customers']//tr"));
     System.out.println(noOfRows.size());// 7
			
     for(int i=1; i<noOfRows.size();i++) {
     List<org.openqa.selenium.WebElement> noOfcells = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+2)+"]//td"));
     System.out.println(noOfcells.size());
     
     for(int cell =0;cell<noOfcells.size();cell++) {
     System.out.print(noOfcells.get(cell).getText()+ "  ");
     
     }
     System.out.println();
     }
     
}
}




		    
			 
	
	
     


