package parallel.staticIssue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestTwoWithStaticWebDriver {

    @BeforeClass
    public void setUp() {
        System.out.println("Browser setup by Thread " + Thread.currentThread().getId());
        WebDriverFactoryStatic.setDriver();
    }


    @Test
    public void FlipkartTest() throws InterruptedException {

        WebDriverFactoryStatic.driver.get("https://www.flipkart.com/");
        Thread.sleep(1500);
        System.out.println("Title printed by Thread " + Thread.currentThread().getId() + " - " + WebDriverFactoryStatic.driver.getTitle());
        WebDriverFactoryStatic.driver.manage().deleteAllCookies();

    }

    @Test
    public void MyntraTest() throws InterruptedException {
        WebDriverFactoryStatic.driver.get("https://onet.pl/");
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