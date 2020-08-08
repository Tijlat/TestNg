package TestZebLab.TestNgGroupingTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Staticpages.Page1;

public class TestGroupingTest 

{
	private WebDriver driver;
	
	@BeforeMethod (alwaysRun=true)
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tijlat\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		
	       WebDriver driver=new ChromeDriver();
	              
	       driver.manage().window().maximize();
	       
	       driver.get("https://www.facebook.com/");
	       
	       Thread.sleep(3000);
	}
	
	@Test(groups= {"first"})
	
	public void fun1() throws InterruptedException 
	{
		
		
		Page1.email(driver,"Robin");
		
		Page1.password(driver,"test");
		
		Page1.login(driver);
		
		
	}

	@Test (groups= {"second"})
	public void fun2() throws InterruptedException
	{
		
		driver.get("https://www.facebook.com/");
		
		Page1.email(driver,"claire");
		
		Page1.password(driver, "test");
		
		Page1.login(driver);
		
	}
	
	@AfterMethod (alwaysRun=true)
	public void teardown()
	
	{
		
		driver.quit();
	}
}
