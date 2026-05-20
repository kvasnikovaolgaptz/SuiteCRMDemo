package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Log4j2
public class BasePage {
    protected WebDriver driver;
    protected JavascriptExecutor js;
    public final String BASE_URL = "https://demo.suiteondemand.com/index.php?action=Login&module=Users";

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    public BasePage open() {
        log.info("loginPage opening");
        driver.get(BASE_URL);
        return this;
    }

    public BasePage checkLoginWithPositiveCred() {
        log.info("log in with credential");
        js.executeScript("document.getElementById('user_name').value = arguments[0];", "will");
        js.executeScript("document.getElementById('username_password').value = arguments[0];", "will");
        js.executeScript("document.getElementsByName('Login')[0].click();");
        return this;
    }

    public BasePage clickSave() {
        log.info("Page save");
        js.executeScript("document.getElementById('SAVE').click();");
        return this;
    }
}
