package Domains.jetBlue;
import Common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage extends WebAPI {
    @FindBy(how = How.XPATH, using = WebElements.fromFlightXpath)
    public WebElement fromFlight;
    @FindBy(how = How.XPATH, using = WebElements.toFlightXpath)
    public WebElement toFlight;
    @FindBy(how = How.XPATH, using = WebElements.departureDateXpath)
    public WebElement departureDate;
    @FindBy(how = How.XPATH, using = WebElements.returnDateXpath)
    public WebElement returnDate;
    @FindBy(how = How.XPATH, using = WebElements.cookiesXpath)
    public WebElement cookies;
    @FindBy(how = How.XPATH, using = WebElements.popUpFrameXpath)
    public WebElement popUpFrame;
    public void acceptCookies(){
        cookies.click();
    }
    public void clickFromFlight(){
        fromFlight.click();
    }
    public void clickToFlight(){
        toFlight.click();
    }
    public void clickDates(){
        departureDate.click();
        returnDate.click();
    }

    public void TestCase1() throws InterruptedException {

        waitUntilClickAble(By.xpath("//span[contains(text(), \"Manage Cookies\")]"));

        clickFromFlight();
        clickToFlight();
        clickDates();
    }

}