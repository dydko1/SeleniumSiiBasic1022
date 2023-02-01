package old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pagesOld.MountainRowPage;
import pagesOld.MountainsTablePage;

import java.util.List;

public class TableTest extends TestBase {

    @Test
    public void shouldPrintMountainsOver4000m() {
        driver.get("http://51.75.61.161:9102/");

        List<WebElement> rows = driver.findElements(By.cssSelector("tbody tr"));

        for (WebElement row : rows) {
            int height = Integer.parseInt(row.findElement(By.xpath("./td[4]")).getText());

            if (height > 4000) {
                String peak = row.findElements(By.cssSelector("td")).get(0).getText();
                String state = row.findElement(By.cssSelector("td:nth-of-type(3)")).getText();

                System.out.println(peak + " - in " + state + " - has height: " + height);
            }
        }
    }

    @Test
    public void shouldPrintMountainsOver4000mV2() {
        driver.get("http://51.75.61.161:9102/");

        for (MountainRowPage mountain : new MountainsTablePage(driver).getAllMountains()) {
            if (mountain.getHeight() > 4000) {
                System.out.println(mountain);
            }
        }
    }
}
