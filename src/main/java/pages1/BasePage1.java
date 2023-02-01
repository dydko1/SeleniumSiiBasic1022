package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage1 {
    public BasePage1(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
