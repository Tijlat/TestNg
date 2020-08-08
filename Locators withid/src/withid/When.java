package withid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class When {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tijlat\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		
	       WebDriver driver=new ChromeDriver();
	              
	       driver.manage().window().maximize();
	       
	       driver.get("https://www.facebook.com/");
	       
	       Thread.sleep(2000);
	       
	       WebElement element1 = driver.findElement(By.id("email"));
	       
	       element1.sendKeys("facebook");
	       
	       WebElement element2 = driver.findElement(By.id("pass"));
	       
	       element2.sendKeys("facebook");
	       
	       WebElement element3 = driver.findElement(By.id("u_0_b"));
	       
	       element3.click();
	       
	        
	     Thread.sleep(2000);
	     
	       driver.quit();
	}

}
