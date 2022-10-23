import org.testng.annotations.Test;
import pages.FormPage;

public class FormPopTest extends TestBase {


    @Test
    public void shouldFillFormWithSuccess() {
        driver.get("http://51.75.61.161:9102/form.php");

        FormPage formPage = new FormPage(driver);



        formPage.setName("Jan");
        formPage.setLastName("Kowalski");
        formPage.setEmail("Jan.k@wp.pl");
        formPage.setAge(30);
        formPage.selectMale();
        formPage.selectRandomYearsOfExperience();
        formPage.selectAutomationTesterProfession();

        formPage.selectContinent("europe");
        formPage.selectSeleniumCommand("browser-commands");

    }
}
