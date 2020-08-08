package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText {

	public static void main(String[] args) 
	
{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tijlat\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		
	       WebDriver driver=new ChromeDriver();
	              
	       driver.manage().window().maximize();
	       
	       driver.get("http://demostore.x-cart.com/");
	       
	       driver.findElement(By.linkText("Shipping")).click();
	       
	       driver.findElement(By.linkText("Home")).click();
	       
	       driver.findElement(By.linkText("New!")).click();
	       
	       driver.findElement(By.linkText("Contact us")).click();
	       
	       driver.quit(); 

	}

}
