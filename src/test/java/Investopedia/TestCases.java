package Investopedia;
import Common.WebAPI;
import Domains.Amazon.Homepage;
import org.openqa.selenium.support.PageFactory;

public class TestCases extends WebAPI{
    static Homepage homepage;
    public static void getInitElements() {
        homepage = PageFactory.initElements(driver, Homepage.class);
    }


}
