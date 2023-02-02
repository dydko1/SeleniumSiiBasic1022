package pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage1 extends BasePage1 {
    public FormPage1(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#inputFirstName3")
    public WebElement fieldName;

    @FindBy(css = "label[for='inputAge3']1")
    public WebElement fieldAge;

    private static final By SPINNEREK = By.className("overlay__spinner-text");
    By header=By.xpath("//h1");




}
