package step;

import dto.Account;
import org.openqa.selenium.WebDriver;
import pages.NewAccountPage;

public class AccountStep {
    WebDriver driver;
    NewAccountPage newAccountPage;

    public AccountStep(WebDriver driver) {
        this.driver = driver;
        newAccountPage = new NewAccountPage(driver);
    }

    public void createAccount(Account account) {
        newAccountPage.openNewAccount();
        newAccountPage.addNewAccount(account);
        newAccountPage.clickSave();
    }
}
