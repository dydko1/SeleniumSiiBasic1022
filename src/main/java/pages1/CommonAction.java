package pages1;

import org.openqa.selenium.WebElement;

public class CommonAction {

    public static void clickOnElement(WebElement element) {
        System.out.println("Typing: " + element.getText());
        element.click();
    }

    public static void sendKeys(WebElement element, String textToSet) {
        System.out.println("Typing: " + textToSet);
        element.sendKeys(textToSet);
    }
}
