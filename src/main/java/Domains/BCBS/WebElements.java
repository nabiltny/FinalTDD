package Domains.BCBS;

public class WebElements {
    public static final String accessBenefitsXpath = "//button[@aria-label='Open the Access My Benefits form']";
    public static final String prefixIfXpath = "//input[@id='edit-prefix']";
    public static final String accessPlanOkXpath = "//button[@id='edit-submit-prefix']";
    public static final String shopForInsuranceXpath = "//button[@aria-label='Open the Shop for Insurance form']";
    public static final String shopForInsuranceZipCodeXpath = "//input[@id='edit-zip--2']";
    public static final String searchedPlanXpath = "//*[@id=\"plan-finder-zip-home-results\"]/div/ul/li/a";
    public static final String findADoctorXpath = "//button[@aria-label='Show the Find a Doctor links']";
    public static final String findADoctorLinkXpath = "//div[@id='bcbs-find-a-doctor']//a[@class='button--arrow-right'][contains(text(),'In the United States, Puerto Rico and U.S. Virgin ')]";
    public static final String chooseLocationXpath = "//button[@id='button-welcome']";
    public static final String enterZipXpath = "//input[@id='input-location']";
    public static final String locationSuggestXpath = "//button[@id='suggestion-location-0']";
    public static final String confirmXpath = "//button[@type=\"submit\"]";
    public static final String enterPlanXpath = "//input[@id='alpha-one-input']";
    public static final String continueXpath = "//button[@data-test=\"confirm-prefix\"]";
    public static final String doctorsBySpecialtyXpath = "//h2[contains(text(), 'Doctors by specialty')]";
    public static final String specialtySearchXpath = "//input[@id='SEARCH_AUTOSUGGEST_INPUT']";
    public static final String searchResultXpath = "//a[@class='profile-link d-flex align-items-center']";
    public static final String typeOfPlaceXpath = "//h2[contains(text(), 'Places by type')]";
}