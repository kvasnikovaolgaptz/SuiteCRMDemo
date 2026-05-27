package tests;

import dto.Account;
import dto.AccountFactory;
import io.qameta.allure.*;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SaveAccountPage;
import utils.AllureUtils;
import wrappers.AddressTextarea;
import wrappers.Dropdown;
import wrappers.Input;

import static java.lang.Thread.sleep;

@Test(testName = "Создание нового аккаунта")
@Description("Создание аккаунта")
@Epic("E2E")
@Feature("Создание аккаунта с рандомными значениями")
@Story("SuiteCRMDemo")
@Severity(SeverityLevel.CRITICAL)
@Link("https://kvasnikovaolgaptz.github.io/SuiteCRMDemo/6/index.html")// ссылка на документацию
@TmsLink("ITM-5")// ссылка на ТК
@Issue("ITM-5")// ссылка на багтрекинговую систему
@Flaky// помечают тест, который часто падает
@Owner("Kvasnikova Olga")
public class NewAccountTest extends BaseTest{

    Account account = Account.builder()
            .name("test")
            .phone("+79114011845")
            .fax("8-8142-90-63-90")
            .website("karelia.ru")
            .streetBilling("ул.Ленина")
            .cityBilling("г.Петрозаводск")
            .stateOrRegionBilling("Республика Карелия")
            .postalCodeBilling("185034")
            .countryBilling("Россия")
            .streetShipping("ул.Фокина")
            .cityShipping("г.Петрозаводск")
            .stateOrRegionShipping("Республика Карелия")
            .postalCodeShipping("185041")
            .countryShipping("Россия")
            .description("дополнительной информации нет")
            .type("Customer")
            .industry("Apparel")
            .build();

    Account account2 = AccountFactory.getAccount("Customer", "Apparel");

    public void checkAddNewAccount(){
        loginStep.auth(user,password);
        AllureUtils.takeScreenshot(driver);
        accountStep.createAccount(account2);
        AllureUtils.takeScreenshot(driver);
    }
}
