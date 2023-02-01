package old;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        driver = new ChromeDriver(option);

        // jezeli uzwysza implic wait to skonfiguruj to w test base
        // ale tutaj jest zakomentowany aby nie ingerowal we wszystkie testy
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
