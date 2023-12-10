package DummyHTML;

import Common.WebAPI;
import Domains.DummyHTML.Homepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCases extends WebAPI {
        static Homepage homepage;

    public static void getInitElements() {
        homepage = PageFactory.initElements(driver, Homepage.class);
    }

    @Test (enabled = false)
    public void TestCase1(){
        getInitElements();
        homepage.TestCase1();
    }
    @Test (enabled = false)
    public void TestCase2(){
        getInitElements();
        homepage.TestCase2();
    }
    @Test
    public void TestCase3() throws InterruptedException {
        getInitElements();
        homepage.TestCase3();

    }
}
