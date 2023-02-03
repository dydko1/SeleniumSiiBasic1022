package parallel.staticIssue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class WebDriverFactoryStatic {
	
	public static WebDriver driver;
	
	public static  void setDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
}