package base;

import helpers.UrlProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase1 {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        driver = new ChromeDriver(option);
        driver.get(UrlProvider.app);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
