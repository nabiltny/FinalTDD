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
    @Test
    public void TestCase6() throws InterruptedException {
        getInitElements();
        homepage.TestCase6();
    }
    @Test
    public void TestCase7() throws InterruptedException {
        getInitElements();
        homepage.TestCase7();
    }
    @Test
    public void TestCase8() throws InterruptedException {
        getInitElements();
        homepage.TestCase8();
    }
    @Test
    public void TestCase9() throws InterruptedException {
        getInitElements();
        homepage.TestCase9();
    }
    @Test
    public void TestCase10() throws InterruptedException {
        getInitElements();
        homepage.TestCase10();
    }
}
