package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    public FormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "inputFirstName3")
    private WebElement firstNameInput;

    @FindBy(id = "inputAge3")
    private WebElement age;  // tutaj powinno być ageInput, ale zostawiam age
                            // aby pokazać w metodzie działanie this.age


    // pola i metody dla: lastName oraz email
    public void setName(String name){
        firstNameInput.sendKeys(name);
    }

    // String.valueOf(age) - zamienia 5 na "5"
    public void setAge(int age){
        this.age.sendKeys(String.valueOf(age));
    }




}
