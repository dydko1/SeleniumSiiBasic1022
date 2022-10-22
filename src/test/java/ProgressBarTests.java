import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProgressBarTests extends TestBase{

    @Test
    public void shouldWaitForProgressBar(){
        driver.get("http://51.75.61.161:9102/progressbar.php");
        driver.findElement(By.className("ui-progressbar-complete"));
    }

    @Test
    public void shouldWaitForProgressBarV2(){
        driver.get("http://51.75.61.161:9102/progressbar.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.findElement(By.className("ui-progressbar-complete"));

    }

    @Test
    public void shouldWaitForProgressBarV3(){
        driver.get("http://51.75.61.161:9102/progressbar.php");


        driver.findElement(By.className("oiuashjfiuhasdiuh"));

    }

    @Test
    public void shouldWaitForProgressBarV4(){
        driver.get("http://51.75.61.161:9102/progressbar.php");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
}
