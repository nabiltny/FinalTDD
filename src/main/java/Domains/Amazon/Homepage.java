package Domains.Amazon;
import Common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static Domains.Amazon.WebElements.*;
public class Homepage extends WebAPI{

    @FindBy (how = How.XPATH, using=topSearchBar) public WebElement searchBar;
    @FindBy (how = How.XPATH, using=topSearchButton) public WebElement searchButton;
    public void searchFieldAction(){
        searchBar.click();

    }
    public void searchFor(String s){
        inputValueInTextBoxByWebElement(searchBar,s);

    }

    public void TestCase1() throws InterruptedException {
        searchFieldAction();
        searchFor("Nikes");
    }

}

