package staticPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page2 
{

	public static void HotDetails(WebDriver driver) throws InterruptedException 
	{
	
	Actions action = new Actions(driver);
	
	List<WebElement> element=driver.findElements(By.cssSelector("primarytitle"));
	
			action.moveToElement(element.get(1)).build().perform();
	
	Thread.sleep(3000);
		
}


public static void sake(WebDriver driver) throws InterruptedException
{
	 
	WebElement element =driver.findElement(By.linkText("sale"));
			
			Thread.sleep(2000);
	
	element.click();
	
	Thread.sleep(2000);
	
	
}
}
