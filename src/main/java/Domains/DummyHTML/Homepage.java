package Domains.DummyHTML;

import Common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static Domains.DummyHTML.WebElements.*;

public class Homepage extends WebAPI {
    @FindBy (how = How.XPATH, using = userNameXpath ) public WebElement usernameWebElement;
    @FindBy (how = How.XPATH, using = passwordXpath ) public WebElement passwordWebElement;
    @FindBy (how = How.ID, using = loginButtonID ) public WebElement loginBtnWebElement;
    @FindBy (how = How.LINK_TEXT, using = linkByLinkText ) public WebElement linkWebElement;

    // Preparation methods of various steps
    public void usernameFieldActions(){
        usernameWebElement.click();
        inputValueInTextBoxByWebElement(usernameWebElement, "Username");

    }

    public void passwordFieldActions(){
        passwordWebElement.click();
        inputValueInTextBoxByWebElement(passwordWebElement,"Password");
    }

    public void loginButtonClick(){
        loginBtnWebElement.click();
    }

    public void linkClick(){linkWebElement.click();}


    //TestCases
    public void TestCase1(){
        usernameFieldActions();
        passwordFieldActions();
        loginButtonClick();
    }

    public void TestCase2(){
        linkClick();
    }

    public void TestCase3() throws InterruptedException {
        String name = getCurrentUrl();
        Thread.sleep(2000);
        Assert.assertEquals(name, "https://www.youtube.com/");
    }

}
