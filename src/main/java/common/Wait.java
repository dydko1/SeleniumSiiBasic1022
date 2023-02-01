package common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages1.BasePage1;

import java.time.Duration;

public class Wait extends BasePage1 {

    public Wait(WebDriver driver) {
        super(driver);
    }

    public void wait(WebElement element) {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofMillis(500));
        wait1.ignoring(NoSuchElementException.class);
        wait1.until((ExpectedConditions.visibilityOf(element)));
        //wait1.until((ExpectedConditions.textToBePresentInElement(element,"Age")));
    }
}
