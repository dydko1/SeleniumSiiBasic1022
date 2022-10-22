import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
    public void shouldWaitForTextInProgressBarLabel(){
        driver.get("http://51.75.61.161:9102/progressbar.php");

        WebElement progressBarLabel = driver.findElement(By.className("progress-label"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test
    public void shouldWaitForAttributeInProgressBar(){
        driver.get("http://51.75.61.161:9102/progressbar.php");

        WebElement progressBar = driver.findElement(By.className("ui-progressbar-value"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
}
