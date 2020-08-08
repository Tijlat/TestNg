package TestZenLabs.TestNgDependency;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import staticPages.Page1;

public class TestNgdependentTest 

{
	private WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tijlat\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		
	       WebDriver driver=new ChromeDriver();
	              
	       driver.manage().window().maximize();
	       
	       driver.get("https://www.facebook.com/");
	}
	
	/*
	 * @Test public void fun1() throws InterruptedException {
	 * Page1.email(driver,"fun1");
	 * 
	 * Page1.password(driver,"test");
	 * 
	 * Page1.login(driver);
	 * 
	 * }
	 * 
	 * 
	 * @Test(dependsOnMethods= {"fun3"})
	 * 
	 * public void fun2() throws InterruptedException { Page1.email(driver,"fun2");
	 * 
	 * Page1.password(driver,"test");
	 * 
	 * Page1.login(driver);
	 * 
	 * }
	 */
	  
	  @Test public void fun3() throws InterruptedException
	  
	  {
	  
	  Page1.email(driver,"fun3");
	  
	  Page1.password(driver,"test");
	  
	  Page1.login(driver);
	  }
	 
	@AfterMethod
	public void tearDown()
	
	{
		
		driver.quit();
	}

}
