import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTests extends TestBase {

    @Test
    public void shouldAcceptAlert() {
        driver.get("http://51.75.61.161:9102/alerts.php");
        driver.findElement(By.id("simple-alert")).click();

        driver.switchTo().alert().accept();

        String alertMsg = driver.findElement(By.id("simple-alert-label")).getText();
        Assert.assertEquals(alertMsg, "OK button pressed");
    }

    @Test
    public void shouldAcceptPromptAlert() {
        driver.get("http://51.75.61.161:9102/alerts.php");
        driver.findElement(By.id("prompt-alert")).click();

        driver.switchTo().alert().sendKeys("Geralt");
        driver.switchTo().alert().accept();

        String alertMsg = driver.findElement(By.id("prompt-label")).getText();
        Assert.assertEquals(alertMsg, "Hello Geralt! How are you today?");
    }

    @Test
    public void shouldAcceptDelayedAlert() {
        driver.get("http://51.75.61.161:9102/alerts.php");
        driver.findElement(By.id("delayed-alert")).click();

        // tutaj wstawiamy naszego waita czekającego na alert
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        String alertMsg = driver.findElement(By.id("delayed-alert-label")).getText();
        Assert.assertEquals(alertMsg, "OK button pressed");
    }
}
