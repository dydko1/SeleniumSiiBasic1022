package old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DroppableTest extends TestBase {

    @Test
    public void shouldDragAndDrop() {
        driver.get("http://51.75.61.161:9102/droppable.php");

        WebElement toDrag = driver.findElement(By.id("draggable"));
        WebElement dropTo = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);

        // opcja 1
//        actions.clickAndHold(toDrag)
//                .moveToElement(dropTo)
//                .release()
//                .perform( );

//        opcja 2
//        actions.clickAndHold(toDrag)
//                .release(dropTo)
//                .perform();

        actions.dragAndDrop(toDrag, dropTo).build();
    }
}
