package TestZebLab.TestNgParameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import StaticPages.page1;

public class TestNgParameters 

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
	
	@Parameters({"username","password"})
	@Test
	
	public void fun1(String na, String pa) throws InterruptedException 
	{
		
		
		page1.email(driver,na);
		
		page1.password(driver,pa);
		
		page1.login(driver);
		
		
	}


	
	@AfterMethod (alwaysRun=true)
	public void teardown()
	
	{
		
		driver.quit();
	}
}
