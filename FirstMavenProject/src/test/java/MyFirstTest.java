import org.testng.Assert;
import org.testng.annotations.*;

public class MyFirstTest {

    @BeforeMethod
    public void before(){
        System.out.println("Run before each test");
    }
    @AfterMethod
    public void after(){
        System.out.println("Run after each test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Run once before all tests");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Run once after all tests");
    }

    @Test
    public void firstTest(){
        System.out.println("to jest mój pierwszy test");
    }

    @Test
    public void additionTest(){
        Assert.assertEquals(add(2,3), 5);
    }
    @Test
    public void multiplicationTest(){
        Assert.assertEquals(multiply(2,3), 10);
    }

    public int add(int a, int b){
        return a+b;
    }

    public int multiply(int a, int b){
        return a * b;
    }
}
