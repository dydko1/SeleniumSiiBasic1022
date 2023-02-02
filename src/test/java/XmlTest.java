import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Properties;

public class XmlTest {

    // -ea  -Dbrowser="Miro19801111"
    @Test
    @Parameters({"browser"})
    public void test(@Optional("hello Mirkuuuuu") String browser) {
        Properties properties = new Properties();
        String s = System.getProperty("browser");
        //properties.getProperty("browser");

        System.out.println("test param=" + browser);
        System.out.println("browser=" + s);

    }
}
