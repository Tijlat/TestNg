package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClassName {

	public static void main(String[] args) 
{
		WebDriver driver=new ChromeDriver();
        
	       driver.manage().window().maximize();
	        
		 
	       
	       driver.get("https://www.facebook.com/");
	       
	       List<WebElement> element1 = driver.findElements(By.className("inputtext"));
	       
	      element1.get(0).sendKeys("facebook");
	      
	      List<WebElement> element2 = driver.findElements(By.className("inputtext"));
	      
	      element2.get(1).sendKeys("facebook");
	      
	      WebElement element3 = driver.findElement(By.id("u_0_4"));
	      
	      element3.click();
	      
	      driver.quit();
	      
	      		

	}

}
