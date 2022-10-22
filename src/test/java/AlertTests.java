import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTests extends TestBase{

    @Test
    public void shouldAcceptAlert(){
        driver.get("http://51.75.61.161:9102/alerts.php");
        driver.findElement(By.id("simple-alert")).click();

        driver.switchTo().alert().accept();

        String alertMsg = driver.findElement(By.id("simple-alert-label")).getText();
        Assert.assertEquals(alertMsg, "OK button pressed");
    }

    @Test
    public void shouldAcceptPromptAlert(){
        driver.get("http://51.75.61.161:9102/alerts.php");
        driver.findElement(By.id("prompt-alert")).click();

        driver.switchTo().alert().sendKeys("Geralt");
        driver.switchTo().alert().accept();

        String alertMsg = driver.findElement(By.id("prompt-label")).getText();
        Assert.assertEquals(alertMsg, "Hello Geralt! How are you today?");
    }
}
