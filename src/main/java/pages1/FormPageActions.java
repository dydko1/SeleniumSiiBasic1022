package pages1;

import org.openqa.selenium.WebDriver;

public class FormPageActions {
    public FormPageActions(WebDriver driver) {
        super();
        formPage1 = new FormPage1(driver);
    }

    FormPage1 formPage1;

    public void fillName() {
        CommonAction.sendKeys(formPage1.fieldName, "Miroooooo2");
    }
}
