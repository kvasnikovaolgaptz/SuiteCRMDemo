package step;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class LoginStep {
    WebDriver driver;
    BasePage basePage;

    public LoginStep(WebDriver driver) {
        this.driver = driver;
        basePage = new BasePage(driver);
    }

    public void auth (String user, String password) {
        basePage.open();
        basePage.checkLoginWithPositiveCred(user, password);
    }
}
