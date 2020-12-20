package android.pages;

import com.pnt.mobileautomation.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductPage {

    @FindBy(xpath = "//android.widget.TextView[@text='Products']")
    private WebElement clickOnProduct;

    @FindBy(xpath = "//android.widget.TextView[@text='Mortgage']")
    private WebElement clickOnMortgage;

    @FindBy(xpath = "//android.widget.TextView[@text='Personal Loans']")
    private WebElement clickOnPersonalLoans;

    @FindBy(xpath = "//android.widget.TextView[@text='Checking Accounts']")
    private WebElement clickOnCheckingAccount;

    @FindBy(xpath = "//android.widget.Button[@text='Learn more']")
    private WebElement clickOnCheckingAccountPage;

    public void clickProductBtn() {
        clickOnProduct.click();
    }

    public void clickMortageBtn() {
        clickOnMortgage.click();
    }

    public void clickPersonalLoansBtn() {
        clickOnPersonalLoans.click();
    }

    public void productPageDisplay() {
        Assert.assertTrue(clickOnCheckingAccount.isDisplayed());
        ExtentTestManager.log("scrolled down");
        ExtentTestManager.log("scrolled up");
    }

    public void clickCheckingAccount() {
        clickOnCheckingAccount.click();
        ExtentTestManager.log("clicked on Checking Accounts");
    }

    public void clickOnCheckingAccountPage() {
        Assert.assertTrue(clickOnCheckingAccountPage.isDisplayed());
        ExtentTestManager.log("Checking Page validated");
    }
}
