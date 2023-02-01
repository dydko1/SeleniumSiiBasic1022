package pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonAction extends BasePage1 {
    //public WebDriver driver;

    public CommonAction(WebDriver driver) {
        super(driver);
        //this.driver = driver;
    }

    public static void clickOnElement(WebElement element) {
        System.out.println("Typing: " + element.getText());
        element.click();
    }

    public void sendKeys(WebElement element, String textToSet) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until((ExpectedConditions.visibilityOf(element)));

        System.out.println("Typing: " + textToSet);
        element.sendKeys(textToSet);
    }
}
