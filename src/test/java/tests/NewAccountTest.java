package tests;

import dto.Account;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SaveAccountPage;
import wrappers.AddressTextarea;
import wrappers.Dropdown;
import wrappers.Input;

import static java.lang.Thread.sleep;

public class NewAccountTest extends BaseTest{

    Account account = new Account("test","+79114011845","8-8142-90-63-90","karelia.ru",
            "ул.Ленина","г.Петрозаводск","Республика Карелия",
            "185034","Россия","ул.Фокина","г.Петрозаводск",
            "Республика Карелия","185041","Россия",
            "дополнительной информации нет","Customer","Apparel");

    @Test(testName = "Вход в систему с позитивными кредами")
    public void checkAddNewAccount(){
        newAccountPage.open()
                .checkLoginWithPositiveCred()
                .openNewAccount()
                .addNewAccount(account)
                .clickSave();
    }
}
