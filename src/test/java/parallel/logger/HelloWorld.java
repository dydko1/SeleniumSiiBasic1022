package parallel.logger;


import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.Test;

public class HelloWorld extends BaseClass11 {

    @Test
    public void testHelloWorld() {
        log.debug("Sample DEBUG message1");
        log.error("Sample ERROR message1");
        log.info("Sample INFO message1");
        log.warn("Sample WARN message1");
    }
}