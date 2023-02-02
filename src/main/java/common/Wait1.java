package common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages1.BasePage1;

import java.time.Duration;

public class Wait1 extends BasePage1 {
    public Wait1(WebDriver driver) {
        super(driver);
    }

    public Boolean wait(WebElement element) {
        //WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait1.ignoring(NoSuchElementException.class);
        try {
            //wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait1.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            System.out.println("Element nie został odnalezniony!!");
            return false;
        }
        return true;
        //wait1.until((ExpectedConditions.visibilityOfElementLocated(element)));
    }
}
