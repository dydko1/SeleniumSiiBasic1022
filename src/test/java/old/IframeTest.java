package old;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class IframeTest extends TestBase {

    @Test
    public void shouldFillFormInIframe() {
        driver.get("http://automation-practice.emilos.pl/iframes.php");

        driver.switchTo().frame("iframe1");

        driver.findElement(By.id("inputFirstName3")).sendKeys("Jan");
        driver.findElement(By.id("inputSurname3")).sendKeys("Kowalski");

        driver.switchTo().defaultContent();

        driver.switchTo().frame("iframe2");

        driver.findElement(By.id("inputLogin")).sendKeys("Jan");
        driver.findElement(By.id("gridRadios2")).click();
    }

    @Test
    public void shouldFillFormInIframeWithFunctionalInterface() {
        driver.get("http://automation-practice.emilos.pl/iframes.php");

        executeInFrame("iframe1", () -> {
            driver.findElement(By.id("inputFirstName3")).sendKeys("Jan");
            driver.findElement(By.id("inputSurname3")).sendKeys("Kowalski");
        });

        executeInFrame("iframe2", () -> {
            driver.findElement(By.id("inputLogin")).sendKeys("Jan");
            driver.findElement(By.id("gridRadios2")).click();
        });
    }

    public void executeInFrame(String frameName, Runnable command) {
        driver.switchTo().frame(frameName);
        command.run();
        driver.switchTo().defaultContent();
    }
}
