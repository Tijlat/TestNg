package staticPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page1 

{
	public static void email(WebDriver driver) throws InterruptedException 
	{
		
		WebElement element =driver.findElement(By.id("email"));
				
				element.sendKeys("facebok");
				
				Thread.sleep(2000);
				
	}
	
	public static void password(WebDriver driver) throws InterruptedException 
	{
		
		WebElement element =driver.findElement(By.id("pass"));
				
				element.sendKeys("facebok");
				
				Thread.sleep(2000);
				
	}


	public static void login(WebDriver driver) throws InterruptedException 
	
	{
		WebElement element =driver.findElement(By.id("u_0_b"));
		
		element.click();
		
		Thread.sleep(2000);
		
	}
}


