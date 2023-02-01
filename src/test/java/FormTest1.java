import base.BaseTest1;
import org.testng.annotations.Test;
import pages1.FormPageActions;

public class FormTest1 extends BaseTest1 {

    @Test
    public void test() throws InterruptedException {
        FormPageActions formPageActions = new FormPageActions(driver);
        formPageActions.fillName();
        Thread.sleep(1500);
    }
}
