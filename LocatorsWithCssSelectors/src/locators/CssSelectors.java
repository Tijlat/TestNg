package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) throws InterruptedException 
	
{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tijlat\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		
	       WebDriver driver=new ChromeDriver();
	              
	       driver.manage().window().maximize();
	       
	       driver.get("http://demostore.x-cart.com/");
	       
	       //In Css Selectors ~ is indicate id
	       
	       //driver.findElement("By.cssSelector("#logo")).click();"
	       
	       // Css Selectors using div tag name and id
	     //driver.findElement("By.cssSelector("div#logo")).click();"
	       
	       // Css Selectors using input Tag Name, placeholder Attribute and Vaule 
	     //  driver.findElement(By.cssSelector("input[placeholder='Search items...']")).sendKeys("Watch");
	       
	    // Css Selectors using input Tag Name, placeholder Attribute and Vaule 
	     //  driver.findElement(By.cssSelector("input[name='substring']")).sendKeys("iphone");
	       
	    // Css Selectors using . indicate class
	    //   driver.findElement(By.cssSelector(".company-logo")).click();
	       
	    // Css Selectors using . indicate class
	     //  driver.findElement(By.cssSelector("div.company-logo")).click();
	       
	    // Css Selectors using input Tag Name, placeholder Attribute and Vaule 
	       driver.findElement(By.cssSelector("div[class='company-logo']")).click();
	       
	       
	       Thread.sleep(3000);
	             
	       
	       driver.quit();	     	    		   
	         
	}

}
