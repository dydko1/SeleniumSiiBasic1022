package pages1;

import common.CommonAction;
import common.Wait1;
import org.openqa.selenium.WebDriver;

public class FormPageActions {
    WebDriver driver;
    Wait1 wait1;
    CommonAction commonAction;

    public FormPageActions(WebDriver driver) {
        super();
        this.driver = driver;
        formPage1 = new FormPage1(driver);
        wait1 = new Wait1(driver);
        commonAction = new CommonAction(driver);
    }

    FormPage1 formPage1;

    public void fillName() {
        wait1.waitVisibilityOf(formPage1.fieldAge); // tylko do zabawy
        //wait1.waitPresenceOfElementLocated(formPage1.header);
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
