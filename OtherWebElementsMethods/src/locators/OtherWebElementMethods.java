package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OtherWebElementMethods {

	public static void main(String[] args) throws InterruptedException 
	
{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tijlat\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		
	       WebDriver driver=new ChromeDriver();
	              
	       driver.manage().window().maximize();
	       
	       //Clear Text
	       
			/*
			 * driver.get("http://demostore.x-cart.com/");
			 * 
			 * 
			 * WebElement element=
			 * driver.findElement(By.cssSelector("input[placeholder='Search items...']"));
			 * 
			 * element.sendKeys("iphone");
			 * 
			 * Thread.sleep(3000);
			 * 
			 * 
			 * element.clear();
			 * 
			 * element.sendKeys("android");
			 * 
			 * Thread.sleep(3000);
			 */
			 
			 
		   
			/*
			 * // Click on Enter
			 * 
			 * driver.get("https://www.google.com/");
			 * 
			 * Thread.sleep(2000);
			 * 
			 * WebElement element = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
			 * 
			 * element.sendKeys("Facebook");
			 * 
			 * 
			 * Thread.sleep(2000);
			 * 
			 * element.sendKeys(Keys.ENTER);
			 * 
			 * Thread.sleep(1000);
			 */
	      
		    	
			/*
			 * //Mouse Hover Actions driver.get("http://demostore.xcart.com/");
			 * 
			 * Thread.sleep(1000);
			 * 
			 * Actions action = new Actions(driver);
			 * 
			 * List<WebElement> element1 =
			 * 
			 * driver.findElements(By.cssSelector(".primary-title"));
			 * 
			 * Thread.sleep(1000);
			 * 
			 * action.moveToElement(element1.get(1)).build().perform();
			 * 
			 * Thread.sleep(2000);
			 * 
			 * WebElement element2 = driver.findElement(By.linkText("Sale"));
			 * 
			 * element2.click();
			 * 
			 * Thread.sleep(1000);
			 */
	    		 
	     
			/*
			 * //Select Drop down
			 * 
			 * driver.get("https://www.bookmyticket.com/");
			 * 
			 * Thread.sleep(1000);
			 * 
			 * Select element = new Select(driver.findElement(By.id("content_adult1")));
			 * 
			 * Thread.sleep(1000);
			 * 
			 * element.selectByVisibleText("4");
			 * 
			 * Thread.sleep(1000);
			 */
	              
	       
	     driver.quit();

	}

}
