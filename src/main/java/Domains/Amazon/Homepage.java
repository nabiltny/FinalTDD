package Domains.Amazon;
import Common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
    @FindBy (how = How.XPATH, using = selectHoodie)
    public WebElement selectNikeHoodie;
    @FindBy (how = How.XPATH, using = sizeChoice)
    public WebElement chooseSize;
    @FindBy (how = How.XPATH, using = addToCartButton)
    public WebElement addToCart;
    @FindBy (how = How.XPATH, using = sizeDropDown)
    public WebElement sizeDropper;
    @FindBy(how = How.XPATH, using = selectSizeFromDropper)
    public WebElement sizeDropperSelect;
    @FindBy(how = How.XPATH, using = navToCart)
    public WebElement cartIcon;
    @FindBy(how = How.XPATH, using = qtyDropdown)
    public WebElement qtyDropArrow;
    @FindBy(how = How.XPATH, using = qtyDropdownSelection)
    public WebElement qtyDropSelect;
    @FindBy(how = How.XPATH, using = accManager)
    public WebElement accManagerMenu;
    @FindBy(how = How.XPATH, using = signOut)
    public WebElement signOutButton;
    @FindBy(how = How.XPATH, using = loginSecurity)
    public WebElement loginSecurityButton;
    @FindBy(how = How.XPATH, using = hubPassword)
    public WebElement hubPasswordButton;
    @FindBy(how = How.XPATH, using = passwordchangeOld)
    public WebElement passwordChangeOldIF;
    @FindBy(how = How.XPATH, using = passwordChangeNew)
    public WebElement passwordChangeNewIF;
    @FindBy(how = How.XPATH, using = passwordChangeCheck)
    public WebElement passwordChangeCheckIF;
    @FindBy(how = How.XPATH, using = passwordChangeSubmit)
    public WebElement passwordChangeSubmitButton;
    @FindBy(how = How.XPATH, using = rememberMe)
    public WebElement rememberMeCheckbox;
    @FindBy(how = How.XPATH, using = hubAddresses)
    public WebElement hubAddressesButton;
    @FindBy(how = How.XPATH, using = addAddress)
    public WebElement addAddressButton;
    @FindBy(how = How.XPATH, using = addressName)
    public WebElement addressNameIF;
    @FindBy(how = How.XPATH, using = addressCity)
    public WebElement addressCityIF;
    @FindBy(how = How.XPATH, using = addressStateDropdown)
    public WebElement addressStateDropdownIF;
    @FindBy(how = How.XPATH, using = addressDropdownClick)
    public WebElement addressDropdownClickIF;
    @FindBy(how = How.XPATH, using = addressZip)
    public WebElement addressZipIF;
    @FindBy(how = How.XPATH, using = addressSubmit)
    public WebElement addressSubmitButton;
    @FindBy(how = How.XPATH, using = addressType)
    public WebElement addressTypeButton;
    @FindBy(how = How.XPATH, using = addressPrefer)
    public WebElement addressPreferButton;
    @FindBy(how = How.XPATH, using = addressAdd)
    public WebElement addressAddButton;
    @FindBy(how = How.XPATH, using = addressSave)
    public WebElement addressSaveButton;
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
    //Sign in function for repeated use
    public void signIn(){
        clickSignIn();

        emailFieldFill(username);
        rememberMeCheckbox.click();
        customerSignInPasswordFill(password);

    }
    public void selectNikeItem(){
        selectNikeHoodie.click();
    }
    public void selectSizeFromDropper(){
        sizeDropper.click();
        sizeDropperSelect.click();
    }
    public void addItemToCart(){
        addToCart.click();
    }

    public void normalSizeSelect(){
        chooseSize.click();
    }
    //There are 2 different types of size selecors
    //This will try both
    public void sizeSelector(){
        try{
            normalSizeSelect();
        }catch(NoSuchElementException ex){
            try{
                selectSizeFromDropper();
            }catch(NoSuchElementException ex2){

            }
        }
    }
    // Adds item to cart for test cases.
    public void testPrereqCartItem() throws InterruptedException {
        searchFieldAction();
        searchFor("Nikes");
        selectNikeItem();
        sizeSelector();
        Thread.sleep(2000);
        addItemToCart();
    }
    public void goToCart(){
        cartIcon.click();
    }
    public void changeQty(){
        qtyDropArrow.click();
        qtyDropSelect.click();
    }
    public void signOut(){
        mouseHover(accManagerMenu);
        signOutButton.click();
    }
    public void enterAccHub(){
        accManagerMenu.click();
    }
    public void accHubLoginSecurity(){
        loginSecurityButton.click();
    }
    public void accHubPassword(){
        hubPasswordButton.click();
    }
    public void resetPassword(String s, String s2){
        passwordChangeOldIF.click();
        typeOn(passwordChangeOldIF, s);
        passwordChangeNewIF.click();
        typeOn(passwordChangeNewIF, s2);
        passwordChangeCheckIF.click();
        typeOn(passwordChangeCheckIF, s2);
        passwordChangeSubmitButton.click();
    }
    public void addAddress(String street, String city, String state, String zip){
        addAddressButton.click();
        inputValueInTextBoxByWebElement(addressNameIF, street);
        inputValueInTextBoxByWebElement(addressCityIF, city);
        addressStateDropdownIF.click();
        addressDropdownClickIF.click();
        inputValueInTextBoxByWebElement(addressDropdownClickIF, state);
        addressZipIF.clear();
        inputValueInTextBoxByWebElement(addressZipIF, zip);
        addressTypeButton.click();
        addressPreferButton.click();
        addressAddButton.click();
        addressSaveButton.click();
    }

    //Simple Search
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
    //Add Nike Hoodie to Cart.
    public void TestCase4() throws InterruptedException {
        //signIn();
        searchFieldAction();
        searchFor("Nikes");
        selectNikeItem();
        sizeSelector();
        Thread.sleep(10000);
        addItemToCart();
    }
    //Changing cart item quantity
    public void TestCase5() throws InterruptedException {
        testPrereqCartItem();
        goToCart();
        changeQty();
    }

    //do a sign out
    public void TestCase6(){
        signIn();
        signOut();
    }
    //Change Password
    public void TestCase7() throws InterruptedException {
        signIn();
        enterAccHub();
        accHubLoginSecurity();
        accHubPassword();
        //Sleep to allow for me to manually input the captcha
        Thread.sleep(10000);
        resetPassword(password, password);
    }
    //Add address
    public void TestCase8(){
        signIn();
        enterAccHub();
        hubAddressesButton.click();
        addAddress("1 Main St", "New York", "New York", "10001");
    }
}