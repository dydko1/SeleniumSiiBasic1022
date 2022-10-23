package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class FormPage {
    public FormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "inputFirstName3")
    private WebElement firstNameInput;

    @FindBy(id = "inputLastName3")
    private WebElement lastNameInput;

    @FindBy(id = "inputEmail3")
    private WebElement emailInput;

    @FindBy(id = "inputAge3")
    private WebElement age;  // tutaj powinno być ageInput, ale zostawiam age
                            // aby pokazać w metodzie działanie this.age

    @FindBy(name = "gridRadiosSex")
    private List<WebElement> genders;

    public void selectRandomGender(){
        getRandomElement(genders).click();
    }

    public void selectMale(){
        genders.get(0).click();
    }


    public void setName(String name){
        firstNameInput.sendKeys(name);
    }

    public void setLastName(String lastName){
        lastNameInput.sendKeys(lastName);
    }

    public void setEmail(String email){
        emailInput.sendKeys(email);
    }

    // String.valueOf(age) - zamienia 5 na "5"
    public void setAge(int age){
        this.age.sendKeys(String.valueOf(age));
    }


    public WebElement getRandomElement(List<WebElement> elements) {
        return elements.get(new Random().nextInt(elements.size()));
    }

}
