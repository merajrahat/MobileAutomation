package android.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

    @FindBy(xpath = "//android.widget.TextView[@text='Products']")
    private WebElement clickOnProduct;

    @FindBy(xpath = "//android.widget.TextView[@text='Mortgage']")
    private WebElement clickOnMortgage;

    @FindBy(xpath = "//android.widget.TextView[@text='Personal Loans']")
    private WebElement clickOnPersonalLoans;

    public void clickProductBtn(){
        clickOnProduct.click();
    }

    public void clickMortageBtn(){
        clickOnMortgage.click();
    }

    public void clickPersonalLoansBtn(){
        clickOnPersonalLoans.click();
    }

}
