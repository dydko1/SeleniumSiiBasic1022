import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFistTest {


    @BeforeMethod
    public void runBeforeEach(){
        System.out.println("uruchomie sie zawsze");
    }

    @Test
    public void test1(){
        Assert.assertEquals(add(2,2), 4);
    }

    @Test
    public void test2(){
        System.out.println("xx");
        int a = 10;
        Assert.assertEquals(a,5);
        System.out.println("yy");
    }

    public int add(int a, int b){
        return a+b;
    }

    public int multiply(int a, int b){
        return 4;
    }
}
