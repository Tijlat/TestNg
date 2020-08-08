package firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Tijlat\\Desktop\\Selenium\\Drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testzenlabs.ie/");
		
		Thread.sleep(2000);
		
		driver.quit();
	}


}
