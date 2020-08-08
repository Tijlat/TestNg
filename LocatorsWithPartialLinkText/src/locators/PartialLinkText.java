package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) 
	
{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tijlat\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		
	       WebDriver driver=new ChromeDriver();
	              
	       driver.manage().window().maximize();
	       
	       driver.get("http://demostore.x-cart.com/");
	       
	       driver.findElement(By.partialLinkText("Ship")).click();
	       
	       driver.findElement(By.partialLinkText("Home")).click();
	       
	       driver.findElement(By.partialLinkText("new")).click();
	       
	       driver.findElement(By.partialLinkText("Cont")).click();
	      
           driver.quit();
	}

}
