import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class FormTest extends TestBase {


    @Test
    public void shouldFillFormWithSuccess() {
        driver.get("http://51.75.61.161:9102/form.php");

        WebElement firstNameInput = driver.findElement(By.id("inputFirstName3"));
        firstNameInput.sendKeys("Jan");

        driver.findElement(By.id("inputAge3")).sendKeys("30");
        driver.findElement(By.id("inputLastName3")).sendKeys("Kowalski");
        driver.findElement(By.id("inputEmail3")).sendKeys("j.k@wp.pl");

        List<WebElement> genders = driver.findElements(By.name("gridRadiosSex"));
//        genders.get(0).click();
        getRandomElement(genders).click();
        getRandomElement(driver.findElements(By.name("gridRadiosExperience"))).click();

        driver.findElement(By.id("gridCheckAutomationTester")).click();

        Select continentsSelect = new Select(driver.findElement(By.id("selectContinents")));
        continentsSelect.selectByValue("europe");

        // dodanie obsluji selecta: selenium commands na form

    }

    public WebElement getRandomElement(List<WebElement> elements) {
        return elements.get(new Random().nextInt(elements.size()));
    }

}
