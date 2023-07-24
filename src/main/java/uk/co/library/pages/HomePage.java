package uk.co.library.pages;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

/**
 * Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin, salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
 */

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;

    @FindBy(id = "location")
    WebElement location;

    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;

    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @FindBy(xpath= "//input[@id='salarymax']")
    WebElement salaryMax;

    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    @FindBy(xpath = "//iframe[@id='gdpr-consent-notice']")
    WebElement getInToIframe;

    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement acceptCookies;

    public void acceptIFrameAlert() {
        driver.switchTo().frame(getInToIframe);
        clickOnElement(acceptCookies);

    }

    public void enterJobTitle(String jobRole) {
        sendTextToElement(jobTitle, jobRole);
    }


    public void enterLocation(String enterLocation) {
        sendTextToElement(location, enterLocation);
    }


    public void selectDistance (String enterDistance) {
        selectByValueFromDropDown(distanceDropDown, enterDistance);
    }

    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin, minSalary);
    }


    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);
    }

    public void selectSalaryType(String sType) {
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);

    }

    public void selectJobType(String jobType) {
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);

    }

    public void clickOnFindJobsButton() {
        clickOnElement(findJobsBtn);
    }


}
