import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGBeforeTestMethodClassCompare {
    String string = "";

    @BeforeTest
    public void before (){
        string = string +" beforeTest ";
    }

    @BeforeMethod
    public void beforeM (){
        string = string +" BeforeMethod ";
    }

    @BeforeClass
    public void beforeClass (){
        string = string +" beforeClass ";
    }

    @Test
    public void test1()
    {
        System.out.println(" Test1"+string);
    }

    @Test
    public void test2()
    {
        System.out.println(" Test2"+string);
    }

    @Test
    public void test3()
    {
        System.out.println(" Test3"+string);

    }
}
