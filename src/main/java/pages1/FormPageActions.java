package pages1;

import common.CommonAction;
import common.Wait;
import org.openqa.selenium.WebDriver;

public class FormPageActions {
    WebDriver driver;

    public FormPageActions(WebDriver driver) {
        super();
        this.driver = driver;
        formPage1 = new FormPage1(driver);
    }

    FormPage1 formPage1;

    public void fillName() {
        CommonAction commonAction = new CommonAction();
        Wait wait = new Wait(driver);
        wait.wait(formPage1.fieldAge);
        commonAction.sendKeys(formPage1.fieldName, "Miroooooo2");
    }
}
