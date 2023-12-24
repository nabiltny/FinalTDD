package Domains.jetBlue;
import Common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

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
    @FindBy(how = How.XPATH, using = WebElements.calendarXpath)
    public WebElement calendar;
    @FindBy(how = How.XPATH, using = WebElements.searchButtonXpath)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = WebElements.closeCalendarXpath)
    public WebElement closeCalendar;
    @FindBy(how = How.XPATH, using = WebElements.firstFlightDepXpath)
    public WebElement firstFlightDep;
    @FindBy(how = How.XPATH, using = WebElements.blueBasicXpath)
    public WebElement blueBasic;
    @FindBy(how = How.XPATH, using = WebElements.firstFlightRetXpath)
    public WebElement firstFlightRet;
    @FindBy(how = How.XPATH, using = WebElements.acceptRestrictionXpath)
    public WebElement acceptRestriction;
    @FindBy(how = How.XPATH, using = WebElements.pricesXpath)
    public List<WebElement> prices;
    @FindBy(how = How.XPATH, using = WebElements.travellerDetailsXpath)
    public WebElement travellerDetails;
    @FindBy(how = How.XPATH, using = WebElements.continueAsGuestXpath)
    public WebElement continueAsGuest;
    @FindBy(how = How.XPATH, using = WebElements.titleXpath)
    public WebElement title;
    @FindBy(how = How.XPATH, using = WebElements.chooseTitleXpath)
    public WebElement chooseTitle;
    @FindBy(how = How.XPATH, using = WebElements.inputNameXpath)
    public WebElement inputName;
    @FindBy(how = How.XPATH, using = WebElements.inputLastNameXpath)
    public WebElement inputLastName;
    @FindBy(how = How.XPATH, using = WebElements.inputEmailXpath)
    public WebElement inputEmail;
    @FindBy(how = How.XPATH, using = WebElements.genderXpath)
    public WebElement gender;
    @FindBy(how = How.XPATH, using = WebElements.chooseGenderXpath)
    public WebElement chooseGender;
    @FindBy(how = How.XPATH, using = WebElements.chooseMonthXpath)
    public WebElement chooseMonth;
    @FindBy(how = How.XPATH, using = WebElements.chooseSelectMonthXpath)
    public WebElement chooseSelectMonth;
    @FindBy(how = How.XPATH, using = WebElements.chooseDayXpath)
    public WebElement chooseDay;
    @FindBy(how = How.XPATH, using = WebElements.chooseSelectDayXpath)
    public WebElement chooseSelectDay;
    @FindBy(how = How.XPATH, using = WebElements.chooseYearXpath)
    public WebElement chooseYear;
    @FindBy(how = How.XPATH, using = WebElements.chooseSelectYearXpath)
    public WebElement chooseSelectYear;
    @FindBy(how = How.XPATH, using = WebElements.addressXpath)
    public WebElement address;
    @FindBy(how = How.XPATH, using = WebElements.manualAddressXpath)
    public WebElement manualAddress;
    @FindBy(how = How.XPATH, using = WebElements.inputAddressXpath)
    public WebElement inputAddress;
    @FindBy(how = How.XPATH, using = WebElements.inputCityXpath)
    public WebElement inputCity;
    @FindBy(how = How.XPATH, using = WebElements.inputStateXpath)
    public WebElement inputState;
    @FindBy(how = How.XPATH, using = WebElements.chooseStateXpath)
    public WebElement chooseState;
    @FindBy(how = How.XPATH, using = WebElements.zipCodeXpath)
    public WebElement zipCode;
    @FindBy(how = How.XPATH, using = WebElements.inputPhoneXpath)
    public WebElement inputPhone;
    @FindBy(how = How.XPATH, using = WebElements.selectSeatXpath)
    public WebElement selectSeat;
    @FindBy(how = How.XPATH, using = WebElements.selectPlaneSeatXpath)
    public WebElement selectPlaneSeat;
    @FindBy(how = How.XPATH, using = WebElements.skipAndPayXpath)
    public WebElement skipAndPay;
    @FindBy(how = How.XPATH, using = WebElements.cardNameXpath)
    public WebElement cardName;
    @FindBy(how = How.XPATH, using = WebElements.cardNumberXpath)
    public WebElement cardNumber;
    @FindBy(how = How.XPATH, using = WebElements.cardMonthXpath)
    public WebElement cardMonth;
    @FindBy(how = How.XPATH, using = WebElements.cardYearXpath)
    public WebElement cardYear;
    @FindBy(how = How.XPATH, using = WebElements.signInXpath)
    public WebElement signIn;
    @FindBy(how = How.XPATH, using = WebElements.signInButtonXpath)
    public WebElement signInButton;
    @FindBy(how = How.XPATH, using = WebElements.emailXpath)
    public WebElement email;
    @FindBy(how = How.XPATH, using = WebElements.passwordXpath)
    public WebElement password;
    public void fillOutDetails() throws InterruptedException {
        travellerDetails.click();
        continueAsGuest.click();
        title.click();
        chooseTitle.click();
        inputValueInTextBoxByWebElement(inputName, "John");
        inputValueInTextBoxByWebElement(inputLastName, "Doe");
        inputValueInTextBoxByWebElement(inputEmail, "nabiltny01@gmail.com");
        gender.click();
        chooseGender.click();
        chooseMonth.click();
        chooseSelectMonth.click();
        chooseDay.click();
        chooseSelectDay.click();
        chooseYear.click();
        chooseSelectYear.click();
        manualAddress.click();
        inputValueInTextBoxByWebElement(inputAddress, "123 Main St");
        inputValueInTextBoxByWebElement(inputCity, "New York");
        inputCity.click();
        inputState.click();
        chooseState.click();
        inputValueInTextBoxByWebElement(zipCode, "10001");
        inputValueInTextBoxByWebElement(inputPhone, "1234567890");
        Thread.sleep(15000);
        skipAndPay.click();
        Thread.sleep(5000);

    }
    public static List<Integer> extractIntegers(List<WebElement> elements) {
        List<Integer> integers = new ArrayList<>();
        for (WebElement element : elements) {
            String text = element.getText().replace("$", "").replace(",", "").trim();
            int number = Integer.parseInt(text);
            integers.add(number);
        }
        return integers;
    }
    public static void clickMatchingLink(List<WebElement> elements, int min) {
        String minText = "$" + min;
        for (WebElement element : elements) {
            String elementText = element.getText().trim();
            if (elementText.equals(minText)) {
                element.click();
                break;
            }
        }
    }
    public void findLowest() throws InterruptedException {
        goToBooking();
        Thread.sleep(15000);
        List<WebElement> list = getListOfWebElementsByXpath(WebElements.pricesXpath);
        List<Integer> prices = extractIntegers(list);
        int min = prices.get(0);
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) < min) {
                min = prices.get(i);
            }
        }
        clickMatchingLink(list, min);
        blueBasic.click();
        List<WebElement> list2 = getListOfWebElementsByXpath(WebElements.pricesXpath);
        List<Integer> prices2 = extractIntegers(list2);
        int min2 = prices2.get(0);
        for (int i = 0; i < prices2.size(); i++) {
            if (prices2.get(i) < min2) {
                min2 = prices2.get(i);
            }
        }
        clickMatchingLink(list2, min2);
        blueBasic.click();
        acceptRestriction.click();
    }
    public void bookFirstFlight() throws InterruptedException {
        goToBooking();
        Thread.sleep(15000);
        firstFlightDep.click();
        blueBasic.click();
        List<WebElement> list = getListOfWebElementsByXpath(WebElements.pricesXpath);
        list.get(0).click();
        blueBasic.click();
        acceptRestriction.click();
    }
    public void acceptCookies(){
        cookies.click();
    }
    public void clickFromFlight(){
        fromFlight.click();
    }
    public void toFlightFill(){
        toFlight.click();
        inputValueInTextBoxByWebElement(toFlight, "Las Vegas");
    }
    public void clickDates(){
        departureDate.click();
        returnDate.click();
        searchButton.click();
    }
    public void goToBooking() throws InterruptedException {
        handleCookies();
        toFlightFill();
        clickDates();
    }
    public void handleCookies() throws InterruptedException {
        Thread.sleep(2000);
        // Locate the iframe and switch to it
        WebElement iframe = driver.findElement(By.name("trustarc_cm"));
        driver.switchTo().frame(iframe);
        WebElement acceptCookiesButton = driver.findElement(By.xpath("/html/body/div[8]/div[1]/div/div[4]/a[1]"));
        acceptCookiesButton.click();
        // Switch back to the main frame
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
    }
    //Searches for a flight to LV
    public void TestCase1() throws InterruptedException {
        handleCookies();
        clickFromFlight();
        toFlightFill();
        clickDates();
    }
    //Book top flight to LV
    public void TestCase2() throws InterruptedException {
        bookFirstFlight();
    }
    //Book lowest Price flight to LV
    public void TestCase3() throws InterruptedException {
        findLowest();
    }
    public void TestCase4() throws InterruptedException {
        findLowest();
        Thread.sleep(3000);
        fillOutDetails();
    }
    public void TestCase5() throws InterruptedException {
        handleCookies();
        signIn.click();
        signInButton.click();
        inputValueInTextBoxByWebElement(email, "ntahmidnyc@gmail.com");
        inputValueInTextBoxByWebElement(password, "pntTest2!!");


    }
}