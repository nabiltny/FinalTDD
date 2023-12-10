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
    @Test
    public void TestCase1() throws InterruptedException {
        getInitElements();
        homepage.TestCase1();
    }
}
