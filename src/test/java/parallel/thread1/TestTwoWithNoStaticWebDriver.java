package parallel.thread1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import parallel.staticIssue.WebDriverFactoryStatic;

public class TestTwoWithNoStaticWebDriver {

    private ThreadLocal<WebDriver> webdriver = new ThreadLocal<WebDriver>();
    public static Logger log = LogManager.getLogger();

    @BeforeMethod
    public void setUpBrowser() {
        log.info("Hello World!");
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        webDriverFactory.setDriver();
        webdriver.set(webDriverFactory.getDriver());
    }


    @Test
    public void FlipkartTest() throws InterruptedException {

        webdriver.get().get("https://www.flipkart.com/");
        Thread.sleep(1500);
        System.out.println("Title printed by " + Thread.currentThread().getName() + webdriver.get().getTitle());
        webdriver.get().close();

    }

    @Test
    public void MyntraTest() throws InterruptedException {
        webdriver.get().get("https://onet.pl/");
        Thread.sleep(1500);
        System.out.println("Title printed by " + Thread.currentThread().getName() + webdriver.get().getTitle());
        webdriver.get().close();

    }

//    @AfterMethod
//    public void tearDown() {
//        System.out.println("Browser closed by Thread " + Thread.currentThread().getName());
//        webdriver.get().close();
//    }

}