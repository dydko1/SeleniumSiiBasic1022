package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import pages1.BasePage1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Waits1 extends BasePage1 {
    public Waits1(WebDriver driver) {
        super(driver);
    }

    public Boolean waitVisibilityOf(WebElement element) {
        //WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait1.ignoring(NoSuchElementException.class);
        try {
            //wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait1.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            System.out.println("Element nie został odnaleziony!!");
            return false;
        }
        return true;
        //wait1.until((ExpectedConditions.visibilityOfElementLocated(element)));
    }

    public void waitPresenceOfElementLocated(By by) {
        wait1.until(ExpectedConditions.presenceOfElementLocated(by));

    }

    public Boolean waitFluentVisibilityOf(WebElement element) {
        //WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait1.ignoring(NoSuchElementException.class);
        //wait1 = new FluentWait(driver);
        FluentWait wait2 = new FluentWait(driver);
        //Specify the timout of the wait
        wait2.withTimeout(Duration.ofSeconds(5));
        //Sepcify polling time
        wait2.pollingEvery(Duration.ofMillis(250));

        //wait2.until(ExpectedConditions.visibilityOf(element));
        try {
            //wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait2.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            System.out.println("Element nie został odnaleziony!!");
            return false;
        }
        return true;
        //wait1.until((ExpectedConditions.visibilityOfElementLocated(element)));
    }
}
