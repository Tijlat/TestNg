package Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tijlat\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		
       WebDriver driver=new ChromeDriver();
              
       driver.manage().window().maximize();
       
       driver.get("https://testzenlabs.ie/");
       
       Thread.sleep(2000);
       
       driver.quit();
       
       
	}

}
