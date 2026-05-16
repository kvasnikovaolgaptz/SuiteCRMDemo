package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;
    protected JavascriptExecutor js;

    public final String BASE_URL = "https://demo.suiteondemand.com/index.php?action=Login&module=Users";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    public BasePage open() {
        driver.get(BASE_URL);
        return this;
    }

    public BasePage checkLoginWithPositiveCred() {
        js.executeScript("document.getElementById('user_name').value = arguments[0];", "will");
        js.executeScript("document.getElementById('username_password').value = arguments[0];", "will");
        js.executeScript("document.getElementsByName('Login')[0].click();");
        return this;
    }

    public BasePage clickSave() {
        js.executeScript("document.getElementById('SAVE').click();");
        return this;
    }
}
