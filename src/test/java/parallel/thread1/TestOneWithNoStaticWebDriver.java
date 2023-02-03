package parallel.thread1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestOneWithNoStaticWebDriver {

    private ThreadLocal<WebDriver> webdriver = new ThreadLocal<WebDriver>();
    public static Logger log = LogManager.getLogger();

    @BeforeMethod
    public void setUpBrowser() {
        log.info("Hello World! 123");
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        webDriverFactory.setDriver();
        webdriver.set(webDriverFactory.getDriver());
    }

    @Test
    public void GoogleTest() throws InterruptedException {
        log.info("Hello World! 1234");
        webdriver.get().get("https://www.google.com/");
        Thread.sleep(1500);
        //System.out.println("Title printed by Thread " + Thread.currentThread().getId() + " - " + WebDriverFactoryStatic.driver.getTitle());
        log.info("Title printed by " + Thread.currentThread().getName() + webdriver.get().getTitle());
        webdriver.get().close();
    }

    @Test
    public void FacebookTest() throws InterruptedException {
        log.info("Hello World! 12345");
        webdriver.get().get("https://www.facebook.com/");
        Thread.sleep(1500);
        System.out.println("Title printed by " + Thread.currentThread().getName() + webdriver.get().getTitle());
        webdriver.get().manage().deleteAllCookies();
        webdriver.get().close();

    }

//    @AfterMethod
//    public void tearDown() {
//        System.out.println("Browser closed by Thread " + Thread.currentThread().getName());
//        webdriver.get().close();
//    }
}