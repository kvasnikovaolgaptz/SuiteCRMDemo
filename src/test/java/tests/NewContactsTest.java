package tests;

import dto.Contacts;
import org.testng.annotations.Test;

public class NewContactsTest extends BaseTest{
    Contacts contacts = new Contacts("Miss","Ольга","8-814-2-40-56-21","менеджер",
            "Olga","Смирнова","8-911-400-40-33","Министерство",
            "8-814-2-40-56-21","190000, Россия, РК, г. Петрозаводск, ул. Лисицына, д.10, кв.10",
            "190000, Россия, г. Москва, ул. Лисицына, д.10, кв.10",
            "г. Петрозаводск", "РК","Россия","186000",
            "г. Москва","190000","Россия","","нет",
            "Cold Call","");
    @Test(testName = "Вход в систему с позитивными кредами")
    public void checkAddNewContacts(){
        newContactsPage.open()
                        .checkLoginWithPositiveCred()
                        .openNewAccount()
                        .addNewContacts(contacts)
                        .clickSave();
    }
}
