package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public void init()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KUMARI\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("https://stg.shopwitheg.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();	}

}
