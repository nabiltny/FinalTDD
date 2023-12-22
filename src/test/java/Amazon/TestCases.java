package Amazon;
import Common.WebAPI;
import Domains.Amazon.Homepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCases extends WebAPI{
    static Homepage homepage;
    public static void getInitElements() {
        homepage = PageFactory.initElements(driver, Homepage.class);
    }
    @Test(enabled = false)
    public void TestCase1() throws InterruptedException {
        getInitElements();
        homepage.TestCase1();
    }
    @Test(enabled = false)
    public void TestCase2(){
        getInitElements();
        homepage.TestCase2();
    }
    @Test (enabled = false)
    public void TestCase3() {
        getInitElements();
        homepage.TestCase3();
    }
    @Test(enabled = false)
    public void TestCase4() throws InterruptedException {
        getInitElements();
        homepage.TestCase4();
    }
    @Test (enabled = false)
    public void TestCase5() throws InterruptedException {
        getInitElements();
        homepage.TestCase5();
    }
    @Test (enabled = false)
    public void TestCase6() {
        getInitElements();
        homepage.TestCase6();
    }
    @Test (enabled = false)
    public void TestCase7() throws InterruptedException {
        getInitElements();
        homepage.TestCase7();
    }
    @Test (enabled = false)
    public void TestCase8(){
        getInitElements();
        homepage.TestCase8();
    }
    @Test (enabled = false)
    public void TestCase9(){
        getInitElements();
        homepage.TestCase9();
    }
    @Test
    public void TestCase10(){
        getInitElements();
        homepage.TestCase10();
    }

}
