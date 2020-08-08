package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import staticPages.Page1;
import staticPages.Page2;

public class MainClass {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tijlat\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		
	       WebDriver driver=new ChromeDriver();
	              
	       driver.manage().window().maximize();
	       
	       driver.get("http://www.facebook.com/");
	       
	       Thread.sleep(3000);
	       
	       Page1.email(driver);
	       
	       Page1.password(driver);
	       
	       Page1.login(driver);
	       
	       Thread.sleep(2000);
	       
	       
	         
	       
	      driver.get("http://demostore.x-cart.com/");
	      
	      Thread.sleep(2000);
	      
	      Page2.HotDetails(driver);
	      
	      Thread.sleep(2000);  
	      
	      driver.quit();

	}

}
