package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages1.BasePage1;

public class CommonAction extends BasePage1 {
    public CommonAction(WebDriver driver) {
        super(driver);
    }

    public static void clickOnElement(WebElement element) {
        System.out.println("Typing: " + element.getText());
        element.click();
    }

    public void sendKeys(WebElement element, String textToSet) {
        System.out.println("Typing: " + textToSet);
        element.sendKeys(textToSet);
    }
}
