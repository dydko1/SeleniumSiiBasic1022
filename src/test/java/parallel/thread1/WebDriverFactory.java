package parallel.thread1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class WebDriverFactory {
	
	private WebDriver driver;
	
	public void setDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
 
}