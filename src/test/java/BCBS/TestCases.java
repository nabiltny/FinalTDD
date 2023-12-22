package BCBS;
import Common.WebAPI;
import Domains.BCBS.Homepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCases extends WebAPI{
    static Domains.BCBS.Homepage homepage;
    public static void getInitElements() {
        homepage = PageFactory.initElements(driver, Homepage.class);
    }

    @Test (enabled = false)
    public void TestCase1() throws InterruptedException {
        getInitElements();
        homepage.TestCase1();
    }
    @Test (enabled = false)
    public void TestCase2() throws InterruptedException {
        getInitElements();
        homepage.TestCase2();
    }
    @Test (enabled = false)
    public void TestCase3() throws InterruptedException {
        getInitElements();
        homepage.TestCase3();
    }
    @Test (enabled = false)
    public void TestCase4() throws InterruptedException {
        getInitElements();
        homepage.TestCase4();
    }
    @Test
    public void TestCase5() throws InterruptedException {
        getInitElements();
        homepage.TestCase5();
    }
}
