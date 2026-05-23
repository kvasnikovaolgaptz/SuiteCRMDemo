package tests;

import dto.Account;
import dto.AccountFactory;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SaveAccountPage;
import wrappers.AddressTextarea;
import wrappers.Dropdown;
import wrappers.Input;

import static java.lang.Thread.sleep;

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

    @Test(testName = "Вход в систему с позитивными кредами")
    public void checkAddNewAccount(){
        loginStep.auth("will","will");
        accountStep.createAccount(account2);
    }
}
