import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class IframeTest extends TestBase{

    @Test
    public void shouldFillFormInIframe(){
        driver.get("http://automation-practice.emilos.pl/iframes.php");


        driver.findElement(By.className("dropdown")).getText();

        driver.switchTo().frame("iframe1");

        driver.findElement(By.id("inputFirstName3")).sendKeys("Jan");

        driver.switchTo().defaultContent();
        driver.findElement(By.className("dropdown")).getText();
    }
}
