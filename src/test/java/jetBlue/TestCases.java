package jetBlue;
import Common.WebAPI;
import Domains.jetBlue.Homepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCases extends WebAPI{
    static Homepage homepage;
    public static void getInitElements() {
        homepage = PageFactory.initElements(driver, Domains.jetBlue.Homepage.class);
    }

    @Test
    public void TestCase1() throws InterruptedException {
        getInitElements();
        homepage.TestCase1();
    }
    @Test
    public void TestCase2() throws InterruptedException {
        getInitElements();
        homepage.TestCase2();
    }
    @Test
    public void TestCase3() throws InterruptedException {
        getInitElements();
        homepage.TestCase3();
    }
    @Test
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
