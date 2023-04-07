package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeBAsic {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alerttandpopup//");
		
		Thread .sleep(3000);
	
		driver.findElement(By.xpath("//button[@name = 'confirmalertbox']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();

	}

}
