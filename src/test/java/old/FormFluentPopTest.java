import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FormPage;

import java.io.File;

public class FormFluentPopTest extends TestBase {
    FormPage formPage;
    File file = new File("src/main/resources/file.txt");

    @BeforeMethod
    public void testSetup() {
        formPage = new FormPage(driver);
        driver.get("http://51.75.61.161:9102/form.php");
    }


    @Test
    public void shouldFillFormWithSuccess() {
        formPage.setName("Jan")
                .setLastName("Kowalski")
                .setEmail("Jan.k@wp.pl")
                .setAge(30)
                .selectMale()
                .selectRandomYearsOfExperience()
                .selectAutomationTesterProfession()
                .selectContinent("europe")
                .selectSeleniumCommand("browser-commands")
                .uploadFile(file)
                .sendForm();

        Assert.assertEquals(formPage.getValidationMsg(), "Form send with success");
    }

    @Test
    public void shouldFillFormWithSuccessV2() {
        Assert.assertEquals(
                formPage
                        .setName("Jan")
                        .setLastName("Kowalski")
                        .setEmail("Jan.k@wp.pl")
                        .setAge(30)
                        .selectMale()
                        .selectRandomYearsOfExperience()
                        .selectAutomationTesterProfession()
                        .selectContinent("europe")
                        .selectSeleniumCommand("browser-commands")
                        .uploadFile(file)
                        .sendForm()
                        .getValidationMsg(), "Form send with success");
    }
}
