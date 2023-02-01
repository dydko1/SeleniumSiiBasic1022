package old;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagesOld.FormPage;

import java.io.File;

public class FormPopTest extends TestBase {
    @Test
    public void shouldFillFormWithSuccess() {
        driver.get("http://51.75.61.161:9102/form.php");

        FormPage formPage = new FormPage(driver);
        File file = new File("src/main/resources/file.txt");

        formPage.setName("Jan");
        formPage.setLastName("Kowalski");
        formPage.setEmail("Jan.k@wp.pl");
        formPage.setAge(30);
        formPage.selectMale();
        formPage.selectRandomYearsOfExperience();
        formPage.selectAutomationTesterProfession();
        formPage.selectContinent("europe");
        formPage.selectSeleniumCommand("browser-commands");
        formPage.uploadFile(file);
        formPage.sendForm();

        String validatorMsg = formPage.getValidationMsg();
        Assert.assertEquals(validatorMsg, "Form send with success");
    }
}
