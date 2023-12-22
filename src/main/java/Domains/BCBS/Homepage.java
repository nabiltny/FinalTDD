package Domains.BCBS;
import Common.WebAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static Domains.BCBS.WebElements.*;


public class Homepage extends WebAPI {
    @FindBy(how = How.XPATH, using = accessBenefitsXpath)
    public WebElement accessBenefits;
    @FindBy(how = How.XPATH, using = prefixIfXpath)
    public WebElement prefixIf;
    @FindBy(how = How.XPATH, using = accessPlanOkXpath)
    public WebElement accessPlanOk;
    @FindBy(how = How.XPATH, using = shopForInsuranceXpath)
    public WebElement shopForInsurance;
    @FindBy(how = How.XPATH, using = shopForInsuranceZipCodeXpath)
    public WebElement shopForInsuranceZipCode;
    @FindBy(how = How.XPATH, using = searchedPlanXpath)
    public WebElement searchedPlan;
    @FindBy(how = How.XPATH, using = findADoctorXpath)
    public WebElement findADoctor;
    @FindBy(how = How.XPATH, using = findADoctorLinkXpath)
    public WebElement findADoctorLink;
    @FindBy(how = How.XPATH, using = chooseLocationXpath)
    public WebElement chooseLocation;
    @FindBy(how = How.XPATH, using = enterZipXpath)
    public WebElement enterZip;
    @FindBy(how = How.XPATH, using = confirmXpath)
    public WebElement confirm;
    @FindBy(how = How.XPATH, using = enterPlanXpath)
    public WebElement enterPlan;
    @FindBy(how = How.XPATH, using = continueXpath)
    public WebElement continueButton;
    @FindBy(how = How.XPATH, using = locationSuggestXpath)
    public WebElement locationSuggest;
    @FindBy(how = How.XPATH, using = doctorsBySpecialtyXpath)
    public WebElement doctorsBySpecialty;
    @FindBy(how = How.XPATH, using = specialtySearchXpath)
    public WebElement specialtySearch;
    @FindBy(how = How.XPATH, using = searchResultXpath)
    public WebElement searchResult;
    @FindBy(how = How.XPATH, using = typeOfPlaceXpath)
    public WebElement typeOfPlace;

    public void searchForPlan(){
        accessBenefits.click();
        inputValueInTextBoxByWebElement(prefixIf, "B2B");
    }
    public void searchInArea() throws InterruptedException {
        shopForInsurance.click();
        inputValueInTextBoxByWebElement(shopForInsuranceZipCode, "11218");
        Thread.sleep(5000);
        searchedPlan.click();
    }
    public void doctorSearchDashboard(){
        findADoctor.click();
        findADoctorLink.click();
        chooseLocation.click();
        enterZip.sendKeys("11218");
        locationSuggest.click();
        confirm.click();
        enterPlan.sendKeys("B2B");
        continueButton.click();
    }
    public void clickCaptcha(){
        clickByXpath("//*[@id=\"acsMainInvite\"]/div/a[1]");
    }
    //Click the 5th result
    public void specialtySearch() throws InterruptedException {
        List<WebElement> list = null;
        try {
            doctorSearchDashboard();
            doctorsBySpecialty.click();
            specialtySearch.sendKeys("Psychiatry");
            specialtySearch.sendKeys(Keys.ENTER);
            list = getListOfWebElementsByXpath(searchResultXpath);
            list.get(4).click();
        } catch (ElementClickInterceptedException e) {
            clickCaptcha(); //Sometimes it comes sometimes it doesnt
        }
    }
    public void typeOfPlaceSearch() throws InterruptedException {
        List<WebElement> list = null;
        try {
            doctorSearchDashboard();
            typeOfPlace.click();
            specialtySearch.sendKeys("Clinic");
            specialtySearch.sendKeys(Keys.ENTER);
            list = getListOfWebElementsByXpath(searchResultXpath);
            list.get(0).click();
        } catch (ElementClickInterceptedException e) {
            clickCaptcha();
        }
    }
    //Search for a plan
    public void TestCase1() throws InterruptedException {
        searchForPlan();
        Thread.sleep(2000);
    }
    //Search for area
    public void TestCase2() throws InterruptedException {
        searchInArea();

    }
    //Go to search dashboard
    public void TestCase3() throws InterruptedException {
        doctorSearchDashboard();
    }
    //Specialty search for a doctor
    public void TestCase4() throws InterruptedException {
        specialtySearch();
    }
    //Search for a clinic
    public void TestCase5() throws InterruptedException {
        typeOfPlaceSearch();
    }

}