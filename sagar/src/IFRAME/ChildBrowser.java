package IFRAME;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.zeromq.ZStar.Set;

public class ChildBrowser {

	public static void main(String[]args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@name='NewTab'])[1]")).click();
		
		Thread.sleep(3000);
		
		Set<String>id=driver.getWindowHandles();
		
		ArrayList<String>al = new ArrayList<String>(id);
		
		String cgg = al.get(1);//child browser 
		
		driver.switchTo().window(cgg);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(" (//span[@class='menu-item-text'])[1]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(al.get(0));
		
		driver.findElement(By.xpath("(//input[@name='NewTab'])[1]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
