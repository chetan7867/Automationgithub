package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay {
	
	
public static void main(String[] args) throws InterruptedException {
		
	
		
		WebDriver driver = new ChromeDriver();//
		
		driver.get("https://www.facebook.com/signup");
	 
		
		//WebElement text = driver.findElement(By.xpath("//div[contains(@class,'_8esf')]"));
		
	//	String result = text.getText();
		//System.out.println(result);
		
		WebElement ele = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		 String Attribute = ele.getAttribute("class");
		 System.out.println(Attribute);
		
		

}
}
