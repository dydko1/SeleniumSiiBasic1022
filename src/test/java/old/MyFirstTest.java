import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstTest {
    @BeforeMethod
    public void runBeforeEach() {
        System.out.println("run before each");
    }

    @AfterMethod
    public void runAfterEach() {
        System.out.println("run after each");
    }

    @Test
    public void test1() {
        System.out.println("Im inside test1");
        Assert.assertEquals(add(2, 3), 5);
        System.out.println("Im at the end of test1");
    }

    @Test
    public void test2() {
        System.out.println("Im inside test2");
        Assert.assertEquals(multiply(2, 3), 6);
        System.out.println("Im at the end of test2");

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return 4;
    }
}