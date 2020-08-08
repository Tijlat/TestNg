package StaticPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class page1 

{

	public static void email(WebDriver driver, String name) throws InterruptedException 
	{
		
		driver.findElement(By.id("email")).sendKeys(name);
				
				//element.sendKeys(name);
				
				Thread.sleep(2000);
				
	}
	
	public static void password(WebDriver driver,String name) throws InterruptedException 
	{
		
		WebElement element =driver.findElement(By.name("pass"));
				
				element.sendKeys(name);
				
				Thread.sleep(2000);
				
	}


	public static void login(WebDriver driver) throws InterruptedException 
	
	{
		WebElement element =driver.findElement(By.id("u_0_b"));
		
		element.click();
		
		Thread.sleep(2000);
		
	}

}

