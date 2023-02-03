package parallel.staticIssue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestOneWithStaticWebDriver {

    @BeforeClass
    public void setUp() {
        System.out.println("Browser setup by Thread " + Thread.currentThread().getId());
        WebDriverFactoryStatic.setDriver();
    }

    @Test
    public void GoogleTest() throws InterruptedException {
        WebDriverFactoryStatic.driver.get("https://www.google.com/");
        Thread.sleep(1500);
        System.out.println("Title printed by Thread " + Thread.currentThread().getId() + " - " + WebDriverFactoryStatic.driver.getTitle());
        WebDriverFactoryStatic.driver.manage().deleteAllCookies();
    }

    @Test
    public void FacebookTest() throws InterruptedException {
        WebDriverFactoryStatic.driver.get("https://www.facebook.com/");
        Thread.sleep(1500);
        System.out.println("Title printed by Thread " + Thread.currentThread().getId() + " - " + WebDriverFactoryStatic.driver.getTitle());
        WebDriverFactoryStatic.driver.manage().deleteAllCookies();

    }

    @AfterClass
    public void tearDown() {
        System.out.println("Browser closed by Thread " + Thread.currentThread().getId());
        WebDriverFactoryStatic.driver.close();
    }
}