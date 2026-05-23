package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.NewAccountPage;
import pages.NewContactsPage;
import step.AccountStep;
import step.ContactsStep;
import step.LoginStep;

import java.time.Duration;
import java.util.HashMap;

public class BaseTest {
    private WebDriver driver; // Добавлен WebDriver как отдельная переменная
    private JavascriptExecutor js;
    protected LoginStep loginStep;
    protected AccountStep accountStep;
    protected ContactsStep contactsStep;

    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            HashMap<String, Object> chromePrefs = new HashMap<>();
            chromePrefs.put("credentials_enable_service", false);
            chromePrefs.put("profile.password_manager_enabled", false);
            options.setExperimentalOption("prefs", chromePrefs);
            options.addArguments("--incognito");
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--disable-infobars");
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }

        js = (JavascriptExecutor) driver; // Приведение типа для использования JavascriptExecutor
        loginStep = new LoginStep(driver);
        accountStep = new AccountStep(driver);
        contactsStep = new ContactsStep(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Неявное ожидание
    }

     @AfterMethod(alwaysRun = true)
     public void tearDown() {
         driver.quit();
     }
}
