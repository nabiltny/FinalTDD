package Domains.Amazon;
import Common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static Domains.Amazon.WebElements.*;
public class Homepage extends WebAPI {
    public final String username = "nblauto123@gmail.com";
    public final String password = "nblPnt23";
    @FindBy(how = How.XPATH, using = topSearchBar)
    public WebElement searchBar;
    @FindBy(how = How.XPATH, using = topSearchButton)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = signInAnchor)
    public WebElement signInButton;
    @FindBy(how = How.XPATH, using = emailField)
    public WebElement emailIF;
    @FindBy(how = How.XPATH, using = signInContinue)
    public WebElement signInSubmit;
    @FindBy(how = How.XPATH, using = createAccSubmit)
    public WebElement createAccountSubmit;
    @FindBy(how = How.XPATH, using = customerNameinput)
    public WebElement customerNameIF;
    @FindBy(how = How.XPATH, using = customerEmailinput)
    public WebElement customerEmailIF;
    @FindBy(how = How.XPATH, using = customerPasswordInput)
    public WebElement customerPasswordIF;
    @FindBy(how = How.XPATH, using = customerPasswordCheckInput)
    public WebElement customerPasswordCheckIF;
    @FindBy(how = How.XPATH, using = createAccSubmit)
    public WebElement createAccountSubmitButton;

    public void searchFieldAction() {
        searchBar.click();
    }

    public void searchFor(String s) {
        inputValueInTextBoxByWebElement(searchBar, s);
    }

    public void clickSignIn() {
        signInButton.click();
    }

    public void emailFieldFill(String s) {
        emailIF.click();
        inputValueInTextBoxByWebElement(emailIF, s);
    }

    public void signInContinue() {
        signInSubmit.click();
    }

    public void clickCreateAccount() {
        createAccountSubmit.click();
    }

    public void customerNameFill(String s) {
        customerNameIF.click();
        inputValueInTextBoxByWebElement(customerNameIF, s);
    }

    public void customerEmailFill(String s) {
        customerEmailIF.click();
        inputValueInTextBoxByWebElement(customerEmailIF, s);
    }

    public void customerSignUpPasswordFill(String s) {
        customerPasswordIF.click();
        inputValueInTextBoxByWebElement(customerPasswordIF, s);
        customerPasswordCheckIF.click();
        inputValueInTextBoxByWebElement(customerPasswordCheckIF, s);
    }
    public void customerSignInPasswordFill(String s) {
        customerPasswordIF.click();
        inputValueInTextBoxByWebElement(customerPasswordIF, s);
    }

    public void createAccountSubmitButton() {
        createAccountSubmitButton.click();
    }


    public void TestCase1() throws InterruptedException {
        searchFieldAction();
        searchFor("Nikes");
    }

    //This test cases finds and fills out the create account form. This is the farthest I can go
    //Without running into bot authentication questions from the domain.
    public void TestCase2() {
        clickSignIn();
        clickCreateAccount();
        customerNameFill("Nabil Testing");
        customerEmailFill("nblauto123@gmail.com");
        customerSignUpPasswordFill("nblPnt23");
    }
    //Sign in
    public void TestCase3(){
        clickSignIn();
        emailFieldFill(username);
        customerSignInPasswordFill(password);
    }
}