package android.pages;

import com.pnt.mobileautomation.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    private WebElement accountBtn;

    @FindBy(xpath = "//android.widget.Button[@text='TRANSFER']")
    private WebElement transferBtn;

    @FindBy(xpath = "//android.widget.Button[@text='DEPOSIT']")
    private WebElement depositBtn;

    @FindBy(xpath = "//android.widget.Button[@text='SEND MONEY']")
    private WebElement sendMondyBtn;

    @FindBy(xpath = "//android.widget.Button[@text='PAY A BILL']")
    private WebElement payABillBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Products']")
    private WebElement clickOnProduct;


    public void clickOnAccountsButton() {
        accountBtn.click();

    }

    public void clickOnTransferButton() {
        transferBtn.click();

    }

    public void clickOnDepositBtton() {
        depositBtn.click();

    }

    public void clickOnSendMoneyButton() {
        sendMondyBtn.click();

    }

    public void clickOnPayAbillButton() {
        payABillBtn.click();

    }

    public void clickProductBtn() {
        clickOnProduct.click();
        ExtentTestManager.log("clicked on product");
    }


}
