package parallel.thread1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import parallel.staticIssue.WebDriverFactoryStatic;

public class WebDriverTest2 {

    // I am not using static ThreadLocal variable here bcz I have kept it in test class where it is being used.
    // If we keep it in another class, you can use it as static with static setter & getter methods.
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
    public void test1() {

        webdriver.get().get("https://www.google.com/");
        System.out.println("Title printed by " + Thread.currentThread().getName() + webdriver.get().getTitle());
        webdriver.get().close();
    }

    @Test
    public void test2() {
        webdriver.get().get("https://www.facebook.com/");
        System.out.println("Title printed by " + Thread.currentThread().getName() + webdriver.get().getTitle());
        webdriver.get().close();
    }

//    @AfterMethod
//    public void tearDown() {
//        System.out.println("Browser closed by Thread " + Thread.currentThread().getName());
//        webdriver.get().close();
//    }
}