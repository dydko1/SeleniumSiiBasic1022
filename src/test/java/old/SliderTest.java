import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SliderTest extends TestBase {

    @Test
    public void shouldMoveSlider() {
        driver.get("http://51.75.61.161:9102/slider.php");

        driver.findElement(By.id("custom-handle")).sendKeys(Keys.ARROW_RIGHT);

    }

    public void clear(WebElement element) {
        element.clear();

        if (element.getText().length() > 0) {
            element.sendKeys(Keys.CONTROL + "a" + Keys.BACK_SPACE);
        }
    }
}
