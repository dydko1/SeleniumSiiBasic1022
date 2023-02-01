package pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage1 extends BasePage1 {
    public FormPage1(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#inputFirstName3")
    public WebElement fieldName;



}
