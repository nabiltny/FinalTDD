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


}
