package pages1;

import common.CommonAction;
import common.Waits1;
import org.openqa.selenium.WebDriver;

public class FormPageActions {
    WebDriver driver;
    Waits1 waits1;
    CommonAction commonAction;

    public FormPageActions(WebDriver driver) {
        super();
        this.driver = driver;
        formPage1 = new FormPage1(driver);
        waits1 = new Waits1(driver);
        commonAction = new CommonAction(driver);
    }

    FormPage1 formPage1;

    public void fillName() {
        //waits1.waitPresenceOfElementLocated(formPage1.header);
        // waits1.waitVisibilityOf(formPage1.fieldAge); // tylko do zabawy
        waits1.waitFluentVisibilityOf(formPage1.fieldAge);
        commonAction.sendKeys(formPage1.fieldName, "Miroooooo2");
        System.out.println(formPage1.fieldName.getAttribute("value") + "ddddd");
    }

    public void getSex() {
        System.out.println("Rozmiar: " + formPage1.sex.size());
        formPage1.sex.get(0).click();
    }

    public void getTitle() {
        System.out.println(driver.findElement(formPage1.header).getText());
    }
}
