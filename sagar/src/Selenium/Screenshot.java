package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {
	
public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();//
	
		driver.get("https://www.facebook.com/signup");
		
		for (int i =1; i<=10;i++) {
        
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(6);
		File destination = new File("D:\\class notes\\scr555"+random+".jpg");
		FileHandler.copy(source, destination); }
}
}
