package pagesOld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
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

    @FindBy(id = "selectContinents")
    private WebElement continentsSelect;

    @FindBy(id = "selectSeleniumCommands")
    private WebElement seleniumCommandsSelect;

    @FindBy(id = "inputAge3")
    private WebElement age;  // tutaj powinno być ageInput, ale zostawiam age
    // aby pokazać w metodzie działanie this.age

    @FindBy(name = "gridRadiosSex")
    private List<WebElement> genders;

    @FindBy(name = "gridRadiosExperience")
    private List<WebElement> yearsOfExperience;

    @FindBy(id = "gridCheckAutomationTester")
    private WebElement automationTesterChbx;

    @FindBy(id = "chooseFile")
    private WebElement fileUploadInput;

    @FindBy(id = "validator-message")
    public WebElement validationMsgLbl;

    @FindBy(css = ".btn-primary")
    public WebElement sendFormBtn;


    public FormPage sendForm() {
        sendFormBtn.click();
        return this;
    }

    public String getValidationMsg() {
        return validationMsgLbl.getText();
    }

    public FormPage uploadFile(File file) {
        fileUploadInput.sendKeys(file.getAbsolutePath());
        return this;

    }


    public FormPage selectContinent(String continent) {
        new Select(continentsSelect).selectByValue(continent);
        return this;

    }

    public FormPage selectSeleniumCommand(String seleniumCommand) {
        new Select(seleniumCommandsSelect).selectByValue(seleniumCommand);
        return this;

    }

    public FormPage selectRandomGender() {
        getRandomElement(genders).click();
        return this;

    }

    public FormPage selectRandomYearsOfExperience() {
        getRandomElement(yearsOfExperience).click();
        return this;

    }

    public FormPage selectAutomationTesterProfession() {
        automationTesterChbx.click();
        return this;

    }

    public FormPage selectMale() {
        genders.get(0).click();
        return this;
    }


    public FormPage setName(String name) {
        firstNameInput.sendKeys(name);
        return this;

    }

    public FormPage setLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
        return this;

    }

    public FormPage setEmail(String email) {
        emailInput.sendKeys(email);
        return this;

    }

    // String.valueOf(age) - zamienia 5 na "5"
    public FormPage setAge(int age) {
        this.age.sendKeys(String.valueOf(age));
        return this;
    }


    public WebElement getRandomElement(List<WebElement> elements) {
        return elements.get(new Random().nextInt(elements.size()));
    }


}
