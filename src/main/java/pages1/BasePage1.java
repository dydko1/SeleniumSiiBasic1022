package pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage1 {
    public WebDriver driver;
    public Actions actions;
    public WebDriverWait wait1;

    public BasePage1(WebDriver driver) {
        PageFactory.initElements(driver, this);
        initDriver(driver);
    }

    private void initDriver(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebDriver getDriver() {
        return driver;
    }
}
