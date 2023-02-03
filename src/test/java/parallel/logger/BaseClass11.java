package parallel.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass11 {
    public static WebDriver driver;
    public static Logger log = LogManager.getLogger();

    @BeforeSuite
    public void setUp() {
        if (driver == null) {
            log.info("Hello World!");
        }
    }

    @AfterSuite
    public void tearDown() {
        log.info("Goodbye!");
        if (driver != null) {
            driver.quit();
        }
    }
}